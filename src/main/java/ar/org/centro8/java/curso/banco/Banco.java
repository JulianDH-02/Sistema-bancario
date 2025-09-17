package ar.org.centro8.java.curso.banco;

import java.time.LocalDate;

import ar.org.centro8.java.curso.entidades.clientes.Cliente;
import ar.org.centro8.java.curso.entidades.clientes.ClienteEmpresa;
import ar.org.centro8.java.curso.entidades.clientes.ClienteIndividual;
import ar.org.centro8.java.curso.entidades.cuentas.CajaDeAhorro;
import ar.org.centro8.java.curso.entidades.cuentas.Cheque;
import ar.org.centro8.java.curso.entidades.cuentas.Cuenta;
import ar.org.centro8.java.curso.entidades.cuentas.CuentaConvertibilidad;
import ar.org.centro8.java.curso.entidades.cuentas.CuentaCorriente;

public class Banco {

    public static void main(String[] args) {
        System.out.println("** TEST DE CLIENTES **");

        System.out.println("** CLIENTE INDIVIDUAL **");
        Cliente clienteinv = new ClienteIndividual(0, "Patricio", "Sardelli", "22567132");
        System.out.println(clienteinv);
        System.out.println("** CLIENTE EMPRESA **");
        Cliente clienteemp = new ClienteEmpresa(0, "Manaos", "20305536713");
        System.out.println(clienteemp);

        System.out.println("** TEST DE CUENTAS **");

        System.out.println("** CAJA DE AHORRO **");

        Cliente cliente1 = new ClienteIndividual(1, "Rodrigo", "Hudson", "32354945");

        Cuenta cuenta1 = new CajaDeAhorro(0, cliente1, 1_000_000,5);

        CajaDeAhorro ca1 = (CajaDeAhorro) cuenta1 ;
        System.out.println(cuenta1);
        System.out.println("***************");
        
        cuenta1.depositar(500);
        System.out.println("***************");
    
        cuenta1.extraer(500);
        System.out.println("***************");

        ca1.cobrarInteres();
        System.out.println("***************");

        System.out.println("** CUENTA CORRIENTE **");

        Cliente cliente2 = new ClienteIndividual(2, "Gregorio", "Lissandro", "22435876");

        Cuenta cuenta2 = new CuentaCorriente(2, cliente2, 10_000, 2_000);
        CuentaCorriente cc2 = (CuentaCorriente) cuenta2;
        System.out.println(cuenta2);
        System.out.println("***************");
        
        cuenta2.depositar(500);
        System.out.println("***************");
        
        cuenta2.extraer(10600);
        System.out.println("***************\n");

        System.out.println("** CHEQUE **");

        Cheque cheque1 = new Cheque(200, "BNA", LocalDate.now());
        cc2.depositarCheque(cheque1);

        System.out.println("***************\n");

        System.out.println("** CUENTA CONVERTIBILIDAD **");

        Cliente cliente3 = new ClienteEmpresa(3, "Guaymallen", "20128934533");
        ClienteEmpresa c3 = (ClienteEmpresa) cliente3;
        CuentaConvertibilidad cuenta3 = new CuentaConvertibilidad(3, c3, 10000, 2000);

        System.out.println(cuenta3.getSaldo());
        cuenta3.convertirPesosADolares(1400, 1400);
        System.out.println("Pesos: " + cuenta3.getSaldo());
        cuenta3.convertirDolaresAPesos(cuenta3.getSaldoDolares(), 1400);
        System.out.println("dolares: " + cuenta3.getSaldoDolares());

        







        
    }

}
