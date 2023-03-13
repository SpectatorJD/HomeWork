import static com.sun.tools.javac.util.StringUtils.toUpperCase;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        String firstName = "Ivanov ";
        String middleName = "Ivan ";
        String lastName = "Ivanovich";
        String fullName = firstName + middleName + lastName;
        System.out.println( "ФИО сотрудника " + fullName);


    }

    public static void task2 () {
        System.out.println("Задача 2");
        String firstName = "Ivanov ";
        String middleName = "Ivan ";
        String lastName = "Ivanovich";
        String fullName = firstName + middleName + lastName;
        System.out.println("ФИО сотрудника " + toUpperCase(fullName));

    }

    public static void task3 () {
        System.out.println("Задача 3");
        String firstName = "Иванов ";
        firstName = firstName.replace("е", "ё");

        String middleName = "Семен ";
        middleName = middleName.replace( "Семен ", "Семён ");

        String lastName = "Семенович";
        lastName = lastName.replace( "Семенович", "Семёнович");

        String fullName = firstName + middleName + lastName;

        System.out.println(fullName);

    }
}