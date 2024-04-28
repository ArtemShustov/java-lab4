import java.util.Scanner;

// вариант 23. Задание 3
public class Task3 {
    public static void Run() {
		Scanner console = new Scanner(System.in);

		System.out.print("Enter 'r': ");
		double r = console.nextDouble();
		System.out.print("Enter 'h': ");
		double h = console.nextDouble();

		double result = r * 6 / Math.sqrt(3);
		System.out.println("Result: " + result);
    }
}
