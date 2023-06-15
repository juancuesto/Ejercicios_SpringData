package com.example.Ejercicio3SpringDatajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CocheReppository extends JpaRepository<Coche,Long> {
}
