package service;

import dto.BookDto;
import dto.BookSearchParameters;
import dto.CreateBookRequestDto;
import java.util.List;
import org.springframework.data.domain.Pageable;

public interface BookService {
    BookDto save(CreateBookRequestDto requestDto);

    List<BookDto> findAll(Pageable pageable);

    BookDto findById(Long id);

    void deleteById(Long id);

    List<BookDto> search(BookSearchParameters parameters);
}
