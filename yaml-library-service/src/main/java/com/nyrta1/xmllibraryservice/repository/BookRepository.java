package com.nyrta1.xmllibraryservice.repository;

import com.nyrta1.xmllibraryservice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface BookRepository
        extends JpaRepository<Book, UUID> {
    Optional<Book> findByBookUUID(UUID uuid);
    int deleteByBookUUID(UUID uuid);
}
