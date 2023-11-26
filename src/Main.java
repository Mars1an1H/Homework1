public class Main {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName =lastName+" "+firstName+" "+middleName;
        System.out.println("Ф. И. О. сотрудника — "+fullName);
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — "+fullName.toUpperCase());
        fullName = "Иванов Семён Семёнович";
        String rightFullName = fullName.replace("ё", "e");
        System.out.println("Данные Ф. И. О. сотрудника —"+rightFullName);
    }
}