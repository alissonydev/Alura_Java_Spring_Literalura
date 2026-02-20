package com.github.alissonydev.literalura.repositories;

import com.github.alissonydev.literalura.entities.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDadosRepository extends JpaRepository<Data, Long> {
}
