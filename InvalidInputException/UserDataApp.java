import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserDataApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные (Фамилия Имя Отчество дата_рождения номер_телефона пол):");
        String input = scanner.nextLine();
        String[] data = input.split("\\s+");

        if (data.length != 6) {
            System.out.println("Ошибка: вы ввели " + data.length + " данных. Ожидалось 6.");
            return;
        }

        try {
            String surname = data[0];
            String name = data[1];
            String patronymic = data[2];
            String birthDate = data[3];
            long phoneNumber = Long.parseLong(data[4]);
            char gender = data[5].charAt(0);
            if (!isValidDate(birthDate)) {
                throw new IllegalArgumentException("Неверный формат даты. Ожидался dd.mm.yyyy.");
            }

            if (gender != 'f' && gender != 'm') {
                throw new IllegalArgumentException("Пол должен быть 'f' или 'm'.");
            }
            writeToFile(surname, name, patronymic, birthDate, phoneNumber, gender);
            System.out.println("Данные успешно записаны в файл.");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: номер телефона должен быть целым числом.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    private static boolean isValidDate(String date) {
        String[] parts = date.split("\\.");
        if (parts.length != 3) {
            return false;
        }
        try {
            int day = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]);
            int year = Integer.parseInt(parts[2]);
            return day >= 1 && day <= 31 && month >= 1 && month <= 12;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static void writeToFile(String surname, String name, String patronymic, String birthDate, long phoneNumber, char gender) throws IOException {
        String fileName = surname + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(surname + " " + name + " " + patronymic + " " + birthDate + " " + phoneNumber + " " + gender);
            writer.newLine();
        }
    }
}
