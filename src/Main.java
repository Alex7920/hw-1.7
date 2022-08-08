import javax.swing.*;
import java.nio.file.FileSystemNotFoundException;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String name = "Ivan";
        String surname = "Ivanov";
        String patronymic = "Ivanovich";
        String fullName = surname +" " + name + " " + patronymic;
        System. out. println("фио сотрудника - " + fullName );

        System. out. println("Данные фио сотрудника для заполнения отчёта  - " + fullName.toUpperCase() );

        fullName = "Иванов Семён Семёнович";
        String replaceFullName = fullName.replace("ё","e");
        System.out.println("Данные ФИО сотрудника - " +replaceFullName );
    }
}