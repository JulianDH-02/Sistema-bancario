package ar.org.centro8.java.curso.cuentas;

import ar.org.centro8.java.curso.clientes.ClienteEmpresa;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class CuentaConvertibilidad extends CuentaCorriente {
    private double saldoDolares;

    public CuentaConvertibilidad(int numeroCuenta, ClienteEmpresa cliente, double saldoInicial, double montoDescubierto) {
        super(numeroCuenta, cliente, saldoInicial, montoDescubierto);
        this.saldoDolares = 0;
    }

    // Métodos adicionales propios de CuentaConvertibilidad
    public void depositarDolares(double monto) {
        saldoDolares += monto;
    }

    public boolean extraerDolares(double monto) {
        if (monto <= saldoDolares) {
            saldoDolares -= monto;
            return true;
        }
        return false;
    }

    public void convertirPesosADolares(double monto, double tasa) {
        if (getSaldo() >= monto) {
            setSaldo(getSaldo() - monto);
            saldoDolares += monto / tasa;
        }
    }

    public void convertirDolaresAPesos(double monto, double tasa) {
        if (saldoDolares >= monto) {
            saldoDolares -= monto;
            setSaldo(getSaldo() + monto * tasa);
        }else{

        }
    }
}
