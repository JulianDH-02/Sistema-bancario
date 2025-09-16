package ar.org.centro8.java.curso.cuentas;


import ar.org.centro8.java.curso.clientes.Cliente;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class CajaDeAhorro extends Cuenta {
    private double tasaDeInteres;

    public CajaDeAhorro(int nroCuenta, Cliente cliente, double saldo) {
        super(nroCuenta, cliente, saldo);
        
    }
    
    /**
     * Extrae solo si hay saldo suficiente (no permite descubierto).
     */
    @Override
    public void extraer(double monto) {
        double saldo = getSaldo();
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a extraer debe ser mayor que 0.");
        }
        if (monto <= saldo) {
             saldo-= monto;
             System.out.println("Extraccion exitosa!");
        }
        else{
            System.out.println("Fondos Insuficientes");
        }
    }
    /**
     * Cobra intereses: calcula interes = saldo * tasaInteres y lo suma al saldo.
     * @return -> Devuelve el monto de interés cobrado.
     */
    public double cobrarInteres() {
        double saldo = getSaldo();
        return saldo * tasaDeInteres;
    }
}
