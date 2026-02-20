package com.github.alissonydev.literalura.services;

import com.github.alissonydev.literalura.dtos.BookResponseDTO;
import com.github.alissonydev.literalura.entities.Book;
import com.github.alissonydev.literalura.repositories.IBookRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookService implements IBookService {

    private final IBookRepository bookRepository;

    public BookService(IBookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<BookResponseDTO> findAllBooks() {
        return bookRepository.findAll()
                .stream()
                .map(BookResponseDTO::new)
                .toList();
    }

    @Override
    public List<BookResponseDTO> findBooksByLanguage(List<String> language) {
        return getList(bookRepository.findBooksByLanguage(language));
    }

    @Override
    public List<BookResponseDTO> findTop10ByOrderByDownloadCountDesc() {
        return getList(bookRepository.findTop10ByOrderByDownloadCountDesc());
    }

    @NotNull
    private List<BookResponseDTO> getList(List<Book> books) {
        return books
                .stream()
                .map(BookResponseDTO::new)
                .toList();
    }
}
