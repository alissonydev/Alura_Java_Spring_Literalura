package com.github.alissonydev.literalura.services;

import com.github.alissonydev.literalura.dtos.BookResponseDTO;

import java.util.List;

public interface IBookService {
    List<BookResponseDTO> findAllBooks();
    List<BookResponseDTO> findBooksByLanguage(List<String> lnguage);
}
