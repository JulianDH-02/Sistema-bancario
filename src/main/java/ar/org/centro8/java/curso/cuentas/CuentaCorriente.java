package ar.org.centro8.java.curso.cuentas;


import ar.org.centro8.java.curso.clientes.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class CuentaCorriente extends Cuenta {
    
    private double montoAutorizado;
    
    
    public CuentaCorriente(int nroCuenta, Cliente cliente, double saldo,double montoAutorizado) {
        super(nroCuenta, cliente, saldo);
        this.montoAutorizado = montoAutorizado;
        
    }
    public void depositarCheques(){

    }

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
}
