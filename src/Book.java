class Book {
    private String name;
    private int yearOfIssue;
    private Author author;

    public Book(String name, int yearOfIssue, Author author) {
        this.name = name;
        this.yearOfIssue = yearOfIssue;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
}
