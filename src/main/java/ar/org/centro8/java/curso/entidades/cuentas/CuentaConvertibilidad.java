package ar.org.centro8.java.curso.entidades.cuentas;

import ar.org.centro8.java.curso.entidades.clientes.ClienteEmpresa;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class CuentaConvertibilidad extends CuentaCorriente {
    private double saldoDolares;

    public CuentaConvertibilidad(int numeroCuenta, ClienteEmpresa cliente, double saldo, double montoDescubierto) {
        super(numeroCuenta, cliente, saldo, montoDescubierto);
        this.saldoDolares = 0;
    }

    /**
     * Extrae solo si hay saldo suficiente (no permite descubierto).
     */
    @Override
    public void extraer(double monto) {
        
        if (monto <= 0) {
            System.out.println("El monto a extraer debe ser mayor que 0");
        }
        if (monto <= getSaldo()) {
            setSaldo(getSaldo() - monto);
            System.out.println("Extraccion exitosa! \nNuevo saldo: " + getSaldo()); 
        }
        else{
            System.out.println("Fondos Insuficientes");
        }
        
    }

    // Métodos adicionales propios de CuentaConvertibilidad
    public void depositarDolares(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a depositar debe ser mayor que 0");
        }else{
            saldoDolares += monto;
            System.out.println("Deposito exitoso! \n Nuevo saldo en dolares: " + saldoDolares);
        }
    }

    public void extraerDolares(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a extraer debe ser mayor que 0.");
        }else{
            if (monto <= saldoDolares) {
                saldoDolares -= monto;
                System.out.println("Extraccion exitosa! \n Nuevo saldo en dolares: " + saldoDolares);    
            }
        }
    }

    public void convertirPesosADolares(double monto, double tasa) {
        if (monto <= 0) {
            System.out.println("El monto a convertir debe ser mayor que 0.");
        }else{
            if (getSaldo() >= monto) {
                setSaldo(getSaldo() - monto);
                saldoDolares += monto/tasa;
                System.out.println("Nuevo saldo en dolares: " + saldoDolares);
            }else{System.out.println("Fondos insuficentes");}
        }
    }

    public void convertirDolaresAPesos(double monto, double tasa) {
        if (monto <= 0) {
            System.out.println("El monto a extraer debe ser mayor que 0.");
        }else{    
            if (saldoDolares >= monto) {
                saldoDolares -= monto;
                setSaldo(getSaldo() + monto * tasa);
                System.out.println("Nuevo saldo en pesos: " + getSaldo());
            }else System.out.println("Fondos insuficentes");
        }
    }
}
