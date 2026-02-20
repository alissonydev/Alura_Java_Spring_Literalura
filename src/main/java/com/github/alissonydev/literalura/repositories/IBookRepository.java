package com.github.alissonydev.literalura.repositories;

import com.github.alissonydev.literalura.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long> {
}
