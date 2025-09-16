package ar.org.centro8.java.curso.banco;

import ar.org.centro8.java.curso.clientes.Cliente;
import ar.org.centro8.java.curso.clientes.ClienteEmpresa;
import ar.org.centro8.java.curso.clientes.ClienteIndividual;
import ar.org.centro8.java.curso.cuentas.CajaDeAhorro;
import ar.org.centro8.java.curso.cuentas.Cuenta;
import ar.org.centro8.java.curso.cuentas.CuentaCorriente;

public class Banco {

    public static void main(String[] args) {
        System.out.println("** TEST DE CLIENTES **");

        System.out.println("CLIENTE INDIVIDUAL");
        Cliente clienteinv = new ClienteIndividual(0, "Patricio", "Sardelli", "22567132");
        System.out.println(clienteinv);
        System.out.println("CLIENTE EMPRESA");
        Cliente clienteemp = new ClienteEmpresa(1, "Manaos", "20305536713");
        System.out.println(clienteemp);

        System.out.println("** TEST DE CUENTAS **");

        System.out.println("** CAJA DE AHORRO **");

        Cliente cliente1 = new ClienteIndividual(0, "Rodrigo", "Hudson", "32354945");
        Cuenta cuenta1 = new CajaDeAhorro(0, cliente1, 1_000_000);
        System.out.println(cuenta1);
        cuenta1.depositar(500);
        System.out.println("Saldo: " + cuenta1.getSaldo());
        cuenta1.extraer(1000);
        System.out.println("Saldo: " + cuenta1.getSaldo());

        System.out.println("** CUENTA CORRIENTE **");

        Cliente cliente2 = new ClienteIndividual(0, "Gregorio", "Lissandro", "22435876");
        Cuenta cuenta2 = new CuentaCorriente(0, cliente2, 10_000, 0);
        System.out.println(cuenta2);
        cuenta2.depositar(500);
        System.out.println("Saldo: " + cuenta2.getSaldo());
        cuenta2.extraer(1000);
        System.out.println("Saldo: " + cuenta2.getSaldo());
    }

}
