package apitests;

import apiresources.BooksApi;
import models.books.Book;
import models.books.Search;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BooksTest {
    @Test
    public void bookApiTest() {

        Book book = BooksApi.getBookApi();

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
        assertThat(BooksApi.getCoversApi().contentType().equals("image/jpeg")).isTrue();
    }

    @Test
    public void searchApiTest() {

        Search search = BooksApi.getSearchApi();

        assertThat(search.getNumFound() == 839).isTrue();
        assertThat(search.isNumFoundExact()).isTrue();
        assertThat(search.getOffset()).isNull();
        assertThat(search.getDocs().get(0).getTitle().equals("The Lord of the Rings")).isTrue();
    }
}


