package ar.org.centro8.java.curso.entidades.cuentas;

import ar.org.centro8.java.curso.entidades.clientes.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
/*
 * Clase padre de los Clientes
 * Crea una Cuenta.
 * Tiene los atributos:
 *                  * nroCuenta
 *                  * cliente
 *                  * saldo
 * Metodos:
 * - depositar(double monto): void
 * - abstract extraer(double monto): void
 */
public abstract class Cuenta {
    private int nroCuenta;
    private Cliente cliente;
    private double saldo;


    /**
     * Este procedimiento deposita saldo en la cuenta
     * @param monto -> Representa el monto a depositar.
     */
    public void depositar(double monto){
        
        if (monto <= 0) {
             System.out.println("El monto a depositar debe ser mayor a 0");
        }else{
            saldo += monto;
            System.out.println("Deposito exitoso!\nNuevo saldo: " + saldo);
        }
}
    /**
     * Este procedimiento extrae saldo de la cuenta(varia el comportamiento en las clases hijas)
     * @param monto -> Representa el monto a extraer
     */
    public abstract void extraer(double monto);
}
