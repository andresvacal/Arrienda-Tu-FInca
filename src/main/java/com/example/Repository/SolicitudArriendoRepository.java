package com.example.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.SolicitudArriendo;

public interface SolicitudArriendoRepository extends JpaRepository<SolicitudArriendo, Long>{

    SolicitudArriendo findByIdSolicitud(Long idSolicitud);
    List<SolicitudArriendo> findByArrendadorIdArrendador(Long idArrendador);
}
