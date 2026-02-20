package com.github.alissonydev.literalura.dtos;

import com.github.alissonydev.literalura.entities.Book;

public record BookResponseDTO(

        String title ,
        String authors ,
        String languages ,
        Integer downloadCount
) {
    public BookResponseDTO(Book entity) {
        this(
                entity.getTitle() ,
                entity.getAuthors().toString().replace("[","").replace("]","") ,
                entity.getLanguages().getFirst() ,
                entity.getDownloadCount()
        );
    }

    @Override
    public String toString() {
        return  "\n----- LIVRO -----" +
                "\nTítulo: " + title +
                "\nAutor: " + authors +
                "\nIdioma: " + languages +
                "\nNúmero de downloads: " + downloadCount +
                "\n-------------------\n";
    }

}
