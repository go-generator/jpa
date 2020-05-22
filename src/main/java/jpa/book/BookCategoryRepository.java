package jpa.book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookCategoryRepository extends JpaRepository<BookCategory, BookCategoryPK> {
}
