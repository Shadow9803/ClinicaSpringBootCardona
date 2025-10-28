# Clínica Spring Boot Cardona 🏥

Bienvenido al proyecto **ClinicaSpringBootCardona**. Este repositorio contiene una aplicación desarrollada con Spring Boot para la gestión de una clínica, con entidades como Paciente, Médico, Historia Clínica y Tarjeta Profesional.

---

## 🎯 Objetivo

El objetivo de este proyecto es construir una API/ aplicación backend que:

- Permita la creación, lectura, actualización y eliminación (CRUD) de las entidades necesarias.  
- Se conecte a una base de datos (puede ser H2 en memoria o MySQL para persistencia real).  
- Este estructurado bajo el paquete `com.example.clinica`.  
- Posea las siguientes entidades:  
  - Paciente  
  - HistoriaClinica  
  - Medico  
  - TarjetaProfesional  
- Y relaciones uno-a-uno (1:1) entre:  
  - Paciente ↔ HistoriaClinica  
  - Medico ↔ TarjetaProfesional  

---

## 🧱 Estructura del proyecto

com.example.clinica
├─ modelos (paquete para las entidades)
└─ ClinicaSpringBootApellidosApplication.java

📋 Entidades y Relaciones
Entidades:

Paciente

HistoriaClinica

Medico

TarjetaProfesional

Relaciones:

Un Paciente tiene una HistoriaClinica (1:1)

Un Medico tiene una TarjetaProfesional (1:1)



Las entidades están en el paquete `modelos` y cada una tendrá un mínimo de 10 atributos (incluyendo el identificador `id`). Se usan anotaciones de JPA como `@Entity`, `@Table`, `@Id`, `@GeneratedValue`, y para las relaciones `@OneToOne`, `@JoinColumn`.

---

## 🛠 Dependencias principales

Este proyecto incluye las siguientes dependencias en el archivo `pom.xml` (o el equivalente de Gradle):

- Spring Web  
- Spring Data JPA  
- H2 Database (en memoria)  
- MySQL Server (para persistencia real)  
- Spring DevTools  

---

## 🚀 Cómo levantar el proyecto

1. Clona este repositorio:  
   ```bash
   git clone https://github.com/tu-usuario/ClinicaSpringBootApellidos.git
