package com.example.DTO;

public class ArrendatarioDTO {

    private Long idArrendatario;
    private String nombres;
    private String apellidos;
    private String correoElectronico;
    private String telefono;
    private String password; // Include password cautiously due to security concerns

    // Optional: List of related entities (consider lazy loading or DTOs for them)
    // private List<SolicitudArriendoDTO> solicitudes;
    // private List<PagoDTO> pagos;

    // Getters and setters for all fields

    // Optional: Constructor(s)
    public ArrendatarioDTO() {
    }

    public ArrendatarioDTO(Long idArrendatario, String nombres, String apellidos, String correoElectronico, String telefono, String password) {
        this.idArrendatario = idArrendatario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.password = password;
    }

    // ... getters and setters
}
