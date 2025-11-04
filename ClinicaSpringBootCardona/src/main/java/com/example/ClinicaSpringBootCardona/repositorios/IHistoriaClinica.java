package com.example.ClinicaSpringBootCardona.repositorios;


import com.example.ClinicaSpringBootCardona.Models.HistoriaClinica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHistoriaClinica extends JpaRepository<HistoriaClinica, Integer> {
}
