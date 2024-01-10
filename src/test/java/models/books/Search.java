package models.books;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Search {
    private int numFound;
    private int start;
    private boolean numFoundExact;
    private List<Docs> docs;
    private int num_found;
    private String q;
    private Integer offset;  // Use Integer to allow null values

    public int getNumFound() {
        return numFound;
    }

    public void setNumFound(int numFound) {
        this.numFound = numFound;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public boolean isNumFoundExact() {
        return numFoundExact;
    }

    public void setNumFoundExact(boolean numFoundExact) {
        this.numFoundExact = numFoundExact;
    }

    public List<Docs> getDocs() {
        return docs;
    }

    public void setDocs(List<Docs> docs) {
        this.docs = docs;
    }

    public int getNum_found() {
        return num_found;
    }

    public void setNum_found(int num_found) {
        this.num_found = num_found;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Docs {
        private String key;
        private String type;
        private List<String> seed;
        private String title;
        private String title_suggest;
        private String title_sort;
        private int edition_count;
        private List<String> edition_key;
        private List<String> publish_date;
        private List<Integer> publish_year;
        private int first_publish_year;
        private int number_of_pages_median;
        private List<String> isbn;
        private long last_modified_i;
        private int ebook_count_i;
        private String ebook_access;
        private boolean has_fulltext;
        private boolean public_scan_b;
        private int readinglog_count;
        private int want_to_read_count;
        private int currently_reading_count;
        private int already_read_count;
        private List<String> publisher;
        private List<String> language;
        private List<String> author_key;
        private List<String> author_name;
        private List<String> id_goodreads;
        private List<String> id_librarything;
        private List<String> publisher_facet;
        private long _version_;
        private List<String> author_facet;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public List<String> getSeed() {
            return seed;
        }

        public void setSeed(List<String> seed) {
            this.seed = seed;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle_suggest() {
            return title_suggest;
        }

        public void setTitle_suggest(String title_suggest) {
            this.title_suggest = title_suggest;
        }

        public String getTitle_sort() {
            return title_sort;
        }

        public void setTitle_sort(String title_sort) {
            this.title_sort = title_sort;
        }

        public int getEdition_count() {
            return edition_count;
        }

        public void setEdition_count(int edition_count) {
            this.edition_count = edition_count;
        }

        public List<String> getEdition_key() {
            return edition_key;
        }

        public void setEdition_key(List<String> edition_key) {
            this.edition_key = edition_key;
        }

        public List<String> getPublish_date() {
            return publish_date;
        }

        public void setPublish_date(List<String> publish_date) {
            this.publish_date = publish_date;
        }

        public List<Integer> getPublish_year() {
            return publish_year;
        }

        public void setPublish_year(List<Integer> publish_year) {
            this.publish_year = publish_year;
        }

        public int getFirst_publish_year() {
            return first_publish_year;
        }

        public void setFirst_publish_year(int first_publish_year) {
            this.first_publish_year = first_publish_year;
        }

        public int getNumber_of_pages_median() {
            return number_of_pages_median;
        }

        public void setNumber_of_pages_median(int number_of_pages_median) {
            this.number_of_pages_median = number_of_pages_median;
        }

        public List<String> getIsbn() {
            return isbn;
        }

        public void setIsbn(List<String> isbn) {
            this.isbn = isbn;
        }

        public long getLast_modified_i() {
            return last_modified_i;
        }

        public void setLast_modified_i(long last_modified_i) {
            this.last_modified_i = last_modified_i;
        }

        public int getEbook_count_i() {
            return ebook_count_i;
        }

        public void setEbook_count_i(int ebook_count_i) {
            this.ebook_count_i = ebook_count_i;
        }

        public String getEbook_access() {
            return ebook_access;
        }

        public void setEbook_access(String ebook_access) {
            this.ebook_access = ebook_access;
        }

        public boolean isHas_fulltext() {
            return has_fulltext;
        }

        public void setHas_fulltext(boolean has_fulltext) {
            this.has_fulltext = has_fulltext;
        }

        public boolean isPublic_scan_b() {
            return public_scan_b;
        }

        public void setPublic_scan_b(boolean public_scan_b) {
            this.public_scan_b = public_scan_b;
        }

        public int getReadinglog_count() {
            return readinglog_count;
        }

        public void setReadinglog_count(int readinglog_count) {
            this.readinglog_count = readinglog_count;
        }

        public int getWant_to_read_count() {
            return want_to_read_count;
        }

        public void setWant_to_read_count(int want_to_read_count) {
            this.want_to_read_count = want_to_read_count;
        }

        public int getCurrently_reading_count() {
            return currently_reading_count;
        }

        public void setCurrently_reading_count(int currently_reading_count) {
            this.currently_reading_count = currently_reading_count;
        }

        public int getAlready_read_count() {
            return already_read_count;
        }

        public void setAlready_read_count(int already_read_count) {
            this.already_read_count = already_read_count;
        }

        public List<String> getPublisher() {
            return publisher;
        }

        public void setPublisher(List<String> publisher) {
            this.publisher = publisher;
        }

        public List<String> getLanguage() {
            return language;
        }

        public void setLanguage(List<String> language) {
            this.language = language;
        }

        public List<String> getAuthor_key() {
            return author_key;
        }

        public void setAuthor_key(List<String> author_key) {
            this.author_key = author_key;
        }

        public List<String> getAuthor_name() {
            return author_name;
        }

        public void setAuthor_name(List<String> author_name) {
            this.author_name = author_name;
        }

        public List<String> getId_goodreads() {
            return id_goodreads;
        }

        public void setId_goodreads(List<String> id_goodreads) {
            this.id_goodreads = id_goodreads;
        }

        public List<String> getId_librarything() {
            return id_librarything;
        }

        public void setId_librarything(List<String> id_librarything) {
            this.id_librarything = id_librarything;
        }

        public List<String> getPublisher_facet() {
            return publisher_facet;
        }

        public void setPublisher_facet(List<String> publisher_facet) {
            this.publisher_facet = publisher_facet;
        }

        public long get_version_() {
            return _version_;
        }

        public void set_version_(long _version_) {
            this._version_ = _version_;
        }

        public List<String> getAuthor_facet() {
            return author_facet;
        }

        public void setAuthor_facet(List<String> author_facet) {
            this.author_facet = author_facet;
        }
    }
}
