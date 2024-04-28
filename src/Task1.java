import java.util.Scanner;

// вариант 23. Задание 1
public class Task1 {
    public static void Run() {
        var console = new Scanner(System.in);

        System.out.print("Enter 'a' value: ");
        var a = console.nextDouble();
        System.out.print("Enter 'b' value: ");
        var b = console.nextDouble();
        System.out.print("Enter 'x' value: ");
        var x = console.nextDouble();
        System.out.print("Enter 'y' value: ");
        var y = console.nextDouble();
        System.out.print("Enter 'z' value: ");
        var z = console.nextDouble();
        System.out.print("Enter 't' value: ");
        var t = console.nextDouble();
        System.out.print("Enter 'r' value: ");
        var r = console.nextDouble();
        System.out.println("W = " + W(t, r, y));
        System.out.println("L = " + L(b, z, x, y, a));
    }
    private static double W(double t, double r, double y) {
        return (4 * Math.pow(t, 3) + Math.log(r)) / (Math.pow(Math.E, y + r) + 7.2d * Math.sin(r));
    }
    private static double L(double b, double z, double x, double y, double a) {
        return b * Math.pow(z, 2)
                - 5 * x * y * Math.sin(Math.pow(Math.PI, 2) - 2 * Math.PI * x * y * z)
                - a * ( (Math.abs(x - Math.pow(y, 2) + z * Math.cos(x + y - z)) + Math.E)
                /(Math.pow(z, 3) * (x - 5 * y) + Math.pow(z, x * y)) );
    }
}
