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

    public String toString() {
        return " Название книги " + this.name + " Год издания " + this.yearOfIssue + " Автор " + author;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Book book = (Book) object;
        return yearOfIssue == book.yearOfIssue && java.util.Objects.equals(name, book.name) && java.util.Objects.equals(author, book.author);
    }

    public int hashCode() {
        return java.util.Objects.hash(hashCode(), name, yearOfIssue, author);
    }
}
