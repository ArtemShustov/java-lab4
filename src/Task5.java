import java.util.Scanner;

// вариант 23. Задание 5
// ="Проекция точки P на прямую AB: (" & A1 + (A2-A1) / SQRT((A2-A1)^2 + (B2-B1)^2) * ((A3-A1)*(A2-A1) + (B3-B1)*(B2-B1)) & ", " & B1 + (B2-B1) / SQRT((A2-A1)^2 + (B2-B1)^2) * ((A3-A1)*(A2-A1) + (B3-B1)*(B2-B1)) & ")"
public class Task5 {
    public static void Run() {
		Scanner console = new Scanner(System.in);
		// A point
		System.out.print("Введите координату x точки A: ");
		double A_x = console.nextDouble();
		System.out.print("Введите координату y точки A: ");
		double A_y = console.nextDouble();
		// B point
		System.out.print("Введите координату x точки B: ");
		double B_x = console.nextDouble();
		System.out.print("Введите координату y точки B: ");
		double B_y = console.nextDouble();
		// P point
		System.out.print("Введите координату x точки P: ");
		double P_x = console.nextDouble();
		System.out.print("Введите координату y точки P: ");
		double P_y = console.nextDouble();
		// Найдем направляющий вектор AB
		double AB_x = B_x - A_x;
		double AB_y = B_y - A_y;
		// Найдем вектор AP
		double AP_x = P_x - A_x;
		double AP_y = P_y - A_y;
		// Вычислим длину проекции
		double projection_length = (AP_x * AB_x + AP_y * AB_y) / (AB_x * AB_x + AB_y * AB_y);
		// Вычислим координаты проекции
		double projection_x = A_x + projection_length * AB_x;
		double projection_y = A_y + projection_length * AB_y;

		System.out.println("Координаты проекции точки P на прямую через A и B: (" + projection_x + ", " + projection_y + ")");
    }
}
