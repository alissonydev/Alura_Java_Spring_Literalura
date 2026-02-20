package com.github.alissonydev.literalura.services;

import com.github.alissonydev.literalura.dtos.AuthorResponseDTO;

import java.util.List;

public interface IAuthorService {
    List<AuthorResponseDTO> findAllAuthors();
}
