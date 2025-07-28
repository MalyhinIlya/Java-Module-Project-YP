import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Race race = new Race();

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            race.checkLider(newCar());
        }
        race.printLiderName();
        scanner.close();
    }

    public static Car newCar() {
        while (true) {
            System.out.println("Введите название автомобиля: ");

            String name = scanner.next();
            if (!isNameCorrect(name)) {
                continue;
            }

            System.out.println("Введите скорость автомобиля: ");
            String speed = scanner.next();
            if (!isSpeedCorrect(speed)) {
                continue;
            }
            return new Car(name, Integer.parseInt(speed));
        }
    }

    private static boolean isSpeedCorrect(String speed) {
        if (speed.isBlank()) {
            System.out.println("Ошибка. Скорость автомобиля не должна быть пустой. Введите данные еще раз.");
            return false;
        }

        for (int i = 0; i < speed.length(); i++) {
            if (!Character.isDigit(speed.charAt(i))) {
                System.out.println("Ошибка. Скорость автомобиля должна содержать только цифры. Введите данные еще раз.");
                return false;
            }
        }
        int speedInt = Integer.parseInt(speed);
        if (speedInt < 0 || speedInt > 250) {
            System.out.println("Ошибка. Скорость автомобиля должна быть в диапазоне от 0 до 250. Введите данные еще раз.");
            return false;
        }

        return true;
    }

    private static boolean isNameCorrect(String name) {
        if (!name.isBlank()) {
            System.out.println("Ошибка. Название автомобиля не должно быть пустым. Введите данные еще раз.");
            return false;
        }
        return true;
    }
}