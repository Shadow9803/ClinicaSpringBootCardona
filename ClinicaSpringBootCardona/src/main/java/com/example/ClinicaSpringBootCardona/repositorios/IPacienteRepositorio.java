package com.example.ClinicaSpringBootCardona.repositorios;

import com.example.ClinicaSpringBootCardona.Models.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPacienteRepositorio extends JpaRepository<Paciente, Integer> {
}
