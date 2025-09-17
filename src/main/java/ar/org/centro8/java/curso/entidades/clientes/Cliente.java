package ar.org.centro8.java.curso.entidades.clientes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public abstract class Cliente {
    private int nroCliente;
}
