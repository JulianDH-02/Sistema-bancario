package ar.org.centro8.java.curso.entidades.cuentas;


import ar.org.centro8.java.curso.entidades.clientes.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
/**
 * Clase hija de Cuenta.
 * 
 * Clase que representa una Caja de ahorro.
 * 
 * Tiene los atributos:
 *                  * tasaDeInteres
 * y los heredados( nroCuenta, cliente, saldo )
 * 
 * Metodos:
 * - cobrarIntereses():void
 * - @override extraer(double monto):void (metodo abstracto heredado de su clase padre)
 * 
 */
public class CajaDeAhorro extends Cuenta {
    private double tasaDeInteres;

    public CajaDeAhorro(int nroCuenta, Cliente cliente, double saldo, double tasaDeInteres) {
        super(nroCuenta, cliente, saldo);
        this.tasaDeInteres = tasaDeInteres;
        
    }
    
    /**
     * Este procedimiento extrae solo si hay saldo suficiente (no permite descubierto).
     * @param monto 
     * Sobreescrito de la clase hija Cuenta
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
     * Este procedimiento calcula el interes y lo suma al saldo.
     * En este caso la tasa de interes esta impuesta con la Cuenta
     * Y para evitar escribir en decimal lo dividimos por 100
     */
    public void cobrarInteres() {

        setSaldo(getSaldo() * (tasaDeInteres/100) + getSaldo());
        System.out.println("Nuevo saldo con intereses: " + getSaldo());
    }
}
