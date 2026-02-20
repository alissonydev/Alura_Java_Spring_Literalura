package com.github.alissonydev.literalura.services;

import com.github.alissonydev.literalura.entities.Data;

import java.util.List;

public interface IDadosService {
    List<Data> findAllDados();
    Data dadosCreate(Data dados);
}
