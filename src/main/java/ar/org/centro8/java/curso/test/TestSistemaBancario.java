package ar.org.centro8.java.curso.test;

import java.time.LocalDate;

import ar.org.centro8.java.curso.entidades.clientes.Cliente;
import ar.org.centro8.java.curso.entidades.clientes.ClienteEmpresa;
import ar.org.centro8.java.curso.entidades.clientes.ClienteIndividual;
import ar.org.centro8.java.curso.entidades.cuentas.CajaDeAhorro;
import ar.org.centro8.java.curso.entidades.cuentas.Cheque;
import ar.org.centro8.java.curso.entidades.cuentas.Cuenta;
import ar.org.centro8.java.curso.entidades.cuentas.CuentaConvertibilidad;
import ar.org.centro8.java.curso.entidades.cuentas.CuentaCorriente;

public class TestSistemaBancario {

    public static void main(String[] args) {
        System.out.println("** TEST DE CLIENTES **");

        System.out.println("** CLIENTE INDIVIDUAL **\n");

        Cliente clienteinv = new ClienteIndividual(0, "Patricio", "Sardelli", "32216856");
        System.out.println(clienteinv);

        System.out.println("\n** CLIENTE EMPRESA **\n");

        Cliente clienteemp = new ClienteEmpresa(0, "Manaos", "30708668733");
        System.out.println(clienteemp);

        System.out.println("\n** TEST DE CUENTAS **");

        System.out.println("** CAJA DE AHORRO **\n");

        Cliente cliente1 = new ClienteIndividual(1, "Diego", "Maradona", "14276579");
        Cuenta cuenta1 = new CajaDeAhorro(0, cliente1, 1_000_000,5);
        CajaDeAhorro ca1 = (CajaDeAhorro) cuenta1 ;
        System.out.println(cuenta1);

        System.out.println("***************\n");
        System.out.println("procedimiento depositar()");
        cuenta1.depositar(500);
        System.out.println("***************");
    
        System.out.println("procedimiento extraer()(sin giro en descubierto)");
        cuenta1.extraer(500);
        System.out.println("***************");

        System.out.println("procedimiento cobrarInteres()");
        ca1.cobrarInteres();
        System.out.println("***************");

        System.out.println("** CUENTA CORRIENTE **\n");

        Cliente cliente2 = new ClienteIndividual(2, "Sergio", "Agüero", "33738339");

        Cuenta cuenta2 = new CuentaCorriente(2, cliente2, 10_000, 2_000);
        CuentaCorriente cc2 = (CuentaCorriente) cuenta2;
        System.out.println(cuenta2);
        System.out.println("***************");
        
        System.out.println("procedimiento depositar()");
        cuenta2.depositar(500);
        System.out.println("***************");
        
        System.out.println("procedimiento extraer()(con giro en descubierto)");
        cuenta2.extraer(10600);
        System.out.println("***************\n");

        System.out.println("** CHEQUE **\n");

        Cheque cheque1 = new Cheque(200, "BNA", LocalDate.now());
        System.out.println("procedimiento depositarCheque()");
        cc2.depositarCheque(cheque1);

        System.out.println("***************\n");

        System.out.println("** CUENTA CONVERTIBILIDAD **\n");

        Cliente cliente3 = new ClienteEmpresa(3, "Guaymallen", "30709197289");
        ClienteEmpresa c3 = (ClienteEmpresa) cliente3;

        CuentaConvertibilidad cuenta3 = new CuentaConvertibilidad(3, c3, 10000, 2000, 0);

        System.out.println("procedimiento depositar()");
        cuenta3.depositar(500);
        System.out.println("***************");
    
        System.out.println("procedimiento extraer()(sin giro en descubierto)");
        cuenta3.extraer(500);
        System.out.println("***************");
        
        System.out.println("procedimiento depositarDolares()");
        cuenta3.depositarDolares(100);
        System.out.println("***************");
        
        System.out.println("procedimiento extraerDolares()");
        cuenta3.extraerDolares(100);
        System.out.println("***************");

        System.out.println("procedimiento convertirPesosADolares()");
        cuenta3.convertirPesosADolares(1400, 1400);
        System.out.println("Pesos: " + cuenta3.getSaldo());
        

        System.out.println("***************");

        System.out.println("procedimiento convertirDolaresAPesos()");
        cuenta3.convertirDolaresAPesos(501, 1400);
        System.out.println("dolares: " + cuenta3.getSaldoDolares());

        







        
    }

}
