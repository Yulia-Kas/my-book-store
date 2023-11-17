package repository.book.spec;

import java.util.Arrays;
import model.Book;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import repository.SpecificationProvider;

@Component
public class AuthorSpecificationProvider implements SpecificationProvider<Book> {
    @Override
    public String getKey() {
        return "author";
    }

    @Override
    public Specification<Book> getSpecification(String[] params) {
        return (root, query, criteriaBuilder) -> root.get("author")
                .in(Arrays.stream(params).toArray());
    }
}