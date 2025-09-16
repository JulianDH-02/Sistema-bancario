# Sistema Bancario – Java POO

Primera actividad obligatoria de POO del Centro de formacion profesional N°8 SMATA

Este proyecto implementa un modelo bancario utilizando **Programación Orientada a Objetos en Java**, con el objetivo de practicar conceptos de herencia, polimorfismo y abstracción.  

El sistema permite gestionar **clientes** y **cuentas bancarias** con diferentes reglas de negocio según el tipo de cliente y de cuenta.

---

## Características principales

### Clientes
- **Cliente Individual**: identificado por nombre, apellido y DNI.  
- **Cliente Empresa**: identificado por nombre de fantasía y CUIT.  

### Cuentas
Todas las cuentas poseen un **número de cuenta**, un **cliente asociado** y un **saldo**.  

Se modelan los siguientes tipos de cuentas:  
- **Caja de Ahorro**  
  - Permite depósitos y extracciones.  
  - Posee una tasa de interés y un método para cobrar intereses.  
- **Cuenta Corriente**  
  - Permite depósitos, extracciones y sobregiro hasta un monto autorizado de descubierto.  
  - Permite depositar cheques.  
- **Cuenta Convertibilidad**  
  - Disponible únicamente para clientes empresa.  
  - Opera en pesos y en dólares.  
  - Además de las operaciones de la cuenta corriente, permite:  
    - Depositar y extraer dólares (sin descubierto).  
    - Convertir pesos a dólares y viceversa.  

### Cheques
Los cheques incluyen:  
- Monto  
- Banco emisor  
- Fecha de pago  

Se pueden depositar en cuentas corrientes y cuentas convertibilidad.  

---

## Tecnologías utilizadas
- Lenguaje: **Java 21**  
- Paradigma: **Programación Orientada a Objetos (POO)**  
- Modelado: **UML** para representar herencia y relaciones entre clases
- Framework: **Spring Boot**(incluido Lombok y Spring Boot kit develoment tools como dependencias)  

---

## Sobre el proyecto
Este proyecto forma parte de una **actividad obligatoria de Programación Orientada a Objetos en Java**.  


