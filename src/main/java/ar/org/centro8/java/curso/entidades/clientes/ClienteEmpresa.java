package ar.org.centro8.java.curso.entidades.clientes;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
/**
 * Clase hija de Cliente.
 * Clase que representa a un cliente de empresa.
 * Tiene una relacion de Agregacion con la clase Cuenta.
 * Tiene los atributos:
 *                  * nombreFantasia
 *                  * cuit
 */
public class ClienteEmpresa extends Cliente {
   
    private String nombreFantasia;
    private String cuit;

    public ClienteEmpresa(int nroCliente, String nombreFantasia, String cuit) {
        super(nroCliente);
        this.nombreFantasia = nombreFantasia;
        this.cuit = cuit;
    }
}
