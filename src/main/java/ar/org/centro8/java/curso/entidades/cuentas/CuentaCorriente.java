package ar.org.centro8.java.curso.entidades.cuentas;


import java.time.LocalDate;

import ar.org.centro8.java.curso.entidades.clientes.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class CuentaCorriente extends Cuenta {
    
    private double montoAutorizado;
    
    public CuentaCorriente(int nroCuenta, Cliente cliente, double saldo,double montoAutorizado) {
        super(nroCuenta, cliente, saldo);
        this.montoAutorizado = montoAutorizado;    
    }
    public void depositarCheque(Cheque cheque){

        
        if(cheque.getFechaDePago().equals(LocalDate.now()) || cheque.getFechaDePago().isBefore(LocalDate.now())){
            depositar(cheque.getMonto());
            System.out.println("Cheque depositado");
        }
        else{
            System.out.println("El cheque aún no está disponible. Fecha de pago: " + cheque.getFechaDePago());
        }

    }

    
    @Override
    public void extraer(double monto) {
        
        
        if (monto <= 0) {
            System.out.println("El monto a extraer debe ser mayor que 0.");
        }else{
            if (getSaldo() + montoAutorizado >= monto) {
                setSaldo(getSaldo() - monto);
                System.out.println("Extraccion exitosa! \nNuevo saldo: " + getSaldo());
            }
        }
    }
}
