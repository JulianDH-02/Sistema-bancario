package ar.org.centro8.java.curso.entidades.cuentas;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
/**
 * Clase con Relacion de Asociacion simple
 * Crea cheques para la Clase CuentaCorriente
 */
public class Cheque {
    private double monto;
    private String bancoEmisor;
    private LocalDate fechaDePago;     
}
