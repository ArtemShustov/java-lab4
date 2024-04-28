import java.util.Scanner;

// вариант 23. Задание 2
public class Task2 {
    public static void Run() {
		Scanner console = new Scanner(System.in);

		System.out.print("Введите скорость до дождя (v1): ");
		double v1 = console.nextDouble();
		System.out.print("Введите скорость во время дождя (v2): ");
		double v2 = console.nextDouble();
		System.out.print("Введите задержку въезда на t минут: ");
		double t = console.nextDouble() / 60d;

		var s2 = (t * v1 * v2) / (v1 - v2);
		var rainTime = s2 / v2;

		System.out.println("Время, в течение которого шёл дождь: " + rainTime * 60d);
	}
}
