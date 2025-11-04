package com.example.ClinicaSpringBootCardona.repositorios;


import com.example.ClinicaSpringBootCardona.Models.TarjetaProfesional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITarjetaProfesional extends JpaRepository<TarjetaProfesional, Integer> {
}
