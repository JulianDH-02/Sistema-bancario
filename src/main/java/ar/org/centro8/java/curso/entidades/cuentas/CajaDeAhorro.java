package ar.org.centro8.java.curso.entidades.cuentas;


import ar.org.centro8.java.curso.entidades.clientes.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class CajaDeAhorro extends Cuenta {
    private double tasaDeInteres;

    public CajaDeAhorro(int nroCuenta, Cliente cliente, double saldo, double tasaDeInteres) {
        super(nroCuenta, cliente, saldo);
        this.tasaDeInteres = tasaDeInteres;
        
    }
    
    /**
     * Extrae solo si hay saldo suficiente (no permite descubierto).
     */
    @Override
    public void extraer(double monto) {
        double saldo = getSaldo();
        if (monto <= 0) {
            System.out.println("El monto a extraer debe ser mayor que 0");
        }
        if (monto <= saldo) {
            setSaldo(saldo - monto);
            System.out.println("Extraccion exitosa! \nNuevo saldo: " + getSaldo()); 
        }
        else{
            System.out.println("Fondos Insuficientes");
        }
        
    }
    /**
     * Cobra intereses: calcula interes = saldo * tasaInteres y lo suma al saldo.
     */
    public void cobrarInteres() {
        setSaldo(getSaldo() * (tasaDeInteres/100) + getSaldo());
        System.out.println("Nuevo saldo con intereses: " + getSaldo());
    }
}
