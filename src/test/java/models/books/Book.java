package models.books;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Book {
    @JsonProperty("ISBN:0201558025")
    private BookInfo isbnBook;

    @JsonProperty("LCCN:93005405")
    private BookInfo lccnBook;

    public BookInfo getIsbnBook() {
        return isbnBook;
    }

    public void setIsbnBook(BookInfo isbnBook) {
        this.isbnBook = isbnBook;
    }

    public BookInfo getLccnBook() {
        return lccnBook;
    }

    public void setLccnBook(BookInfo lccnBook) {
        this.lccnBook = lccnBook;
    }

    public static class BookInfo {
        @JsonProperty("bib_key")
        private String bibKey;

        @JsonProperty("info_url")
        private String infoUrl;

        private String preview;

        @JsonProperty("preview_url")
        private String previewUrl;

        @JsonProperty("thumbnail_url")
        private String thumbnailUrl;

        public String getBibKey() {
            return bibKey;
        }

        public void setBibKey(String bibKey) {
            this.bibKey = bibKey;
        }

        public String getInfoUrl() {
            return infoUrl;
        }

        public void setInfoUrl(String infoUrl) {
            this.infoUrl = infoUrl;
        }

        public String getPreview() {
            return preview;
        }

        public void setPreview(String preview) {
            this.preview = preview;
        }

        public String getPreviewUrl() {
            return previewUrl;
        }

        public void setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
        }

        public String getThumbnailUrl() {
            return thumbnailUrl;
        }

        public void setThumbnailUrl(String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
        }
    }
}
