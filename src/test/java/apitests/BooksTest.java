package apitests;

import apiresources.BooksApi;
import models.books.Book;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BooksTest {
    @Test
    public void bookApiTest() {

        Book book = BooksApi.getBook();

        assertThat(book.getIsbnBook().getBibKey().equals("ISBN:0201558025")).isTrue();
        assertThat(book.getIsbnBook().getInfoUrl().equals("https://openlibrary.org/books/OL1429049M/Concrete_mathematics")).isTrue();
        assertThat(book.getIsbnBook().getPreview().equals("full")).isTrue();
        assertThat(book.getIsbnBook().getPreviewUrl().equals("https://archive.org/details/concretemathemat00grah_444")).isTrue();
        assertThat(book.getIsbnBook().getThumbnailUrl().equals("https://covers.openlibrary.org/b/id/135182-S.jpg")).isTrue();

        assertThat(book.getLccnBook().getBibKey().equals("LCCN:93005405")).isTrue();
        assertThat(book.getLccnBook().getInfoUrl().equals("https://openlibrary.org/books/OL1397864M/Zen_speaks")).isTrue();
        assertThat(book.getLccnBook().getPreview().equals("borrow")).isTrue();
        assertThat(book.getLccnBook().getPreviewUrl().equals("https://archive.org/details/zenspeaksshoutso0000caiz")).isTrue();
        assertThat(book.getLccnBook().getThumbnailUrl().equals("https://covers.openlibrary.org/b/id/240726-S.jpg")).isTrue();
    }

    @Test
    public void coversApiTest() {
        assertThat(BooksApi.getCovers().contentType().toString().equals("image/jpeg")).isTrue();
    }
}


