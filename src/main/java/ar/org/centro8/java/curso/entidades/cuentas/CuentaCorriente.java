package ar.org.centro8.java.curso.entidades.cuentas;

import java.time.LocalDate;

import ar.org.centro8.java.curso.entidades.clientes.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
/**
 * Clase hija de Cuenta.
 * Esta clase representa una Cuenta Corriente.
 * Tiene los atributos:
 * * montoAutorizado
 * y los heredados( nroCuenta, cliente, saldo )
 * 
 * Metodos:
 * - depositarCheque(Cheque cheque): void
 * - @override extraer(double monto):void (metodo abstracto heredado de su clase
 * padre)
 */
public class CuentaCorriente extends Cuenta {

    private double montoAutorizado;

    public CuentaCorriente(int nroCuenta, Cliente cliente, double saldo, double montoAutorizado) {
        super(nroCuenta, cliente, saldo);
        this.montoAutorizado = montoAutorizado;
    }

    /**
     * Este procedimiento deposita el monto de un cheque a la cuenta.
     * 
     * @param cheque
     */
    public void depositarCheque(Cheque cheque) {
        
        if (cheque.getFechaDePago().equals(LocalDate.now()) || cheque.getFechaDePago().isBefore(LocalDate.now())) {
            depositar(cheque.getMonto());
            System.out.println("Cheque depositado");
        } else {
            System.out.println("El cheque aún no está disponible. Fecha de pago: " + cheque.getFechaDePago());
        }

    }

    @Override
    /**
     * Este procedimiento extrae saldo de la cuenta
     * incluso si no hay fondos, pero esta limitado
     * por un monto autorizado (el cual no permite que la cuenta vaya mas
     * en negativo que eso).
     */
    public void extraer(double monto) {

        if (monto <= 0) {
            System.out.println("El monto a extraer debe ser mayor que 0.");
        } else {
            if (getSaldo() + montoAutorizado >= monto) {
                setSaldo(getSaldo() - monto);
                System.out.println("Extraccion exitosa! \nNuevo saldo: " + getSaldo());
            }
        }
    }
}
