package com.example.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.ArrendadorRepository;
import com.example.Repository.ArrendatarioRepository;
import com.example.Repository.PagoRepository;
import com.example.Repository.SolicitudArriendoRepository;
import com.example.entity.Arrendador;
import com.example.entity.Arrendatario;
import com.example.entity.Pago;
import com.example.entity.SolicitudArriendo;

@Service
public class PagoService {
    private final PagoRepository pagoRepository;
    private final SolicitudArriendoRepository solicitudArriendoRepository;
    private final ArrendadorRepository arrendadorRepository;
    private final ArrendatarioRepository arrendatarioRepository;
    @Autowired
    public PagoService(PagoRepository pagoRepository, SolicitudArriendoRepository solicitudArriendoRepository, ArrendadorRepository arrendadorRepository, ArrendatarioRepository arrendatarioRepository) {
        this.pagoRepository = pagoRepository;
        this.solicitudArriendoRepository = solicitudArriendoRepository;
        this.arrendadorRepository = arrendadorRepository;
        this.arrendatarioRepository = arrendatarioRepository;
    }
    public List<Pago> getPagos() {
        return pagoRepository.findAll();
    }

    public void savePago(Pago pago) {
        System.out.println("mi Pago es: " + pago);
        pagoRepository.save(pago);
    }
    public void eliminarPago(Long id) {
        boolean exists = pagoRepository.existsById(id);
        if (!exists) {
            throw new IllegalStateException(
                "Pago con id " + id + " no existe"
            );
        }
        pagoRepository.deleteById(id);
    }
public void pagarReserva(Long idSolicitud,Long idArrendador, Long idArrendatario, Pago pago) {
    System.out.println("Pago de la solicitud: " + idSolicitud);
    
    SolicitudArriendo solicitud = solicitudArriendoRepository.findByIdSolicitud(idSolicitud);    
    
    if(solicitud.getEstado().equals("Pendiente")) {
        solicitud.setEstado("Pagado");
        solicitudArriendoRepository.save(solicitud);    

        // Fetch Arrendador and Arrendatario using their IDs from Pago object
        Arrendador arrendador = arrendadorRepository.findByIdArrendador(idArrendador);
        Arrendatario arrendatario = arrendatarioRepository.findByIdArrendatario(idArrendatario);
        
        if (arrendador != null && arrendatario != null) {
            // Set Arrendador and Arrendatario in Pago object
            pago.setArrendador(arrendador);
            pago.setArrendatario(arrendatario);
            
            // Save Pago object with Arrendador and Arrendatario
            pagoRepository.save(pago);
        } else {
            // Handle if Arrendador or Arrendatario is not found
            System.out.println("Arrendador or Arrendatario not found.");
        }
    }
}

}
