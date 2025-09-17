package ar.org.centro8.java.curso.entidades.clientes;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
/**
 * Clase Padre de los clientes.
 * Clase que representa a un cliente.
 * y en su lugar lo hacen las Clases que hereden de esta.
 * Tiene los atributos:
 *                  * nroCliente
 */
public abstract class Cliente {
    private int nroCliente;
}
