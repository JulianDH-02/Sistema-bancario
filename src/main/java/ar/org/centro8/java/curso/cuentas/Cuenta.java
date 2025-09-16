package ar.org.centro8.java.curso.cuentas;

import ar.org.centro8.java.curso.clientes.Cliente;
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


    public void depositar(double monto){
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a depositar debe ser mayor que 0.");
        }
        saldo += monto;
    }

    public abstract void extraer(double monto);
}
