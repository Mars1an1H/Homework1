
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Terry", "Pratchett");
        Author author2 = new Author("Taras", "Shevchenko");
        Book patriot = new Book("Patriot", 1997, author1);
        Book kobzar = new Book("Kobzar", 1840, author2);
        System.out.println("patriot.getName() = " + patriot.getName());
        System.out.println("patriot.getAuthor().getFirstName()+\" \"+ author1.getLastName() = " + patriot.getAuthor().getFirstName() + " " + author1.getLastName());
        System.out.println("patriot.yearOfIssue = " + patriot.getYearOfIssue());
        System.out.println("kobzar.getName() = " + kobzar.getName());
        System.out.println("kobzar.getAuthor().getFirstName()+\" \"+ author2.getLastName() = " + kobzar.getAuthor().getFirstName() + " " + author2.getLastName());
        System.out.println("kobzar.getYearOfIssue() = " + kobzar.getYearOfIssue());
        patriot.setYearOfIssue(1998);
        System.out.println("patriot.getYearOfIssue() = " + patriot.getYearOfIssue());
    }
}