package ar.org.centro8.java.curso.entidades.cuentas;

import ar.org.centro8.java.curso.entidades.clientes.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public abstract class Cuenta {
    private int nroCuenta;
    private Cliente cliente;
    private double saldo;


    /**
     * Deposita efectivo en la cuenta
     * @param monto
     * @return
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
     * Extrae efectivo de la cuenta
     * @param monto
     * @return 
     */
    public abstract void extraer(double monto);
}
