package ar.org.centro8.java.curso.clientes;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class ClienteIndividual extends Cliente {
    
    private String nombre;
    private String apellido;
    private String dni;

    public ClienteIndividual(int nroCliente, String nombre, String apellido, String dni) {
        super(nroCliente);
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    
}
