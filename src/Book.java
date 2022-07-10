public class Book {
    private String titel;
    private int publishingYear;
    public Author author;

    public Book(String titel, int publishingYear, Author author) {
        this.titel = titel;
        this.publishingYear = publishingYear;
        this.author=author;
    }
    public String getTitel(){
        return this.titel;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear=publishingYear;
    }
}
