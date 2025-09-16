package ar.org.centro8.java.curso.cuentas;


import java.time.LocalDate;

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
    public Cheque crearCheque(double monto, String bancoEmisor, LocalDate fechaDePago){
        return new Cheque(monto,bancoEmisor,fechaDePago);
    }
    public void depositarCheque(){

    }

    @Override
    public double extraer(double monto) {
    double saldo = this.getSaldo();
        if (monto <= 0) {
            System.out.println("El monto a extraer debe ser mayor que 0.");
        }
        if (monto <= saldo && monto > montoAutorizado) {
        this.setSaldo(saldo - monto);
        }
        return saldo;
    }
}
