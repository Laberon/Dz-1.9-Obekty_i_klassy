public class Book {
    private String titel;
    private int publishingYear;

    public Book(String titel, int publishingYear, Author authorName) {
        this.titel = titel;
        this.publishingYear = publishingYear;
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
