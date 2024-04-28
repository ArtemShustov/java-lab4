import java.util.Scanner;

// вариант 23. Задание 4
public class Task4 {
    public static void Run() {
		Scanner console = new Scanner(System.in);

		System.out.print("Температура в фаренгейтах: ");
		double fahrenheit = console.nextDouble();

		double celsius = (fahrenheit - 32) * 5.0/9.0;
		double kelvin = (fahrenheit + 459.67) * 5.0/9.0;

		System.out.println("Температура в градусах Цельсия: " + celsius + " °C");
		System.out.println("Температура в Кельвинах: " + kelvin + " K");
    }
}
