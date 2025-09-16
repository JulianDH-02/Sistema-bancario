package ar.org.centro8.java.curso.banco;

import ar.org.centro8.java.curso.clientes.Cliente;
import ar.org.centro8.java.curso.clientes.ClienteEmpresa;
import ar.org.centro8.java.curso.clientes.ClienteIndividual;
import ar.org.centro8.java.curso.cuentas.CajaDeAhorro;
import ar.org.centro8.java.curso.cuentas.Cuenta;

public class Banco {

    public static void main(String[] args) {
        System.out.println("** TEST DE CLIENTES **");

        System.out.println("CLIENTE INDIVIDUAL");
        Cliente clienteinv1 = new ClienteIndividual(0, "Patricio", "Sardelli", "22567132");
        System.out.println(clienteinv1);
        System.out.println("CLIENTE EMPRESA");
        Cliente clienteemp1 = new ClienteEmpresa(1, "Manaos", "20305536713");
        System.out.println(clienteemp1);

        System.out.println("** TEST DE CUENTAS **");

        System.out.println("CAJA DE AHORRO");

        Cuenta cuenta1 = new CajaDeAhorro(0, clienteinv1, 1_000_000);
        System.out.println(cuenta1);
        cuenta1.depositar(500);
        System.out.println(cuenta1.getSaldo());


    }

}
