package kz.chrome.keyapp.joom.repository;

import kz.chrome.keyapp.joom.model.book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<book, Long> {
}

