package com.fabyane.curriculos.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.fabyane.curriculos.model.Curriculo;

public interface CurriculoRepository extends JpaRepository<Curriculo, Long> {
    
}