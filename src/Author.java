public class Author {
    private String firstName;
    private String secondName;

    public Author(String firstName,String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getAutors(){
        String autors = (firstName +" "+ secondName);
        return autors;
    }
}
