package Calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        char c;
        do{
            System.out.print("Enter number 1: ");
            num1 = scanner.nextInt();
            System.out.print("Enter number 2: ");
            num2 = scanner.nextInt();

            System.out.println(num1 + "+"+num2+"=" + calc.add(num1, num2 ));
            System.out.println(num1 + "-"+num2+"=" + calc.subtract(num1, num2));
            System.out.println(num1 + "*"+num2+"=" + calc.multiply(num1, num2));
            System.out.println(num1 + "/"+num2+"=" + calc.divide(num1, num2));

            System.out.print("Enter 1 to continue/Enter anything to end: ");
            c = scanner.next().charAt(0);
        }while(c == '1');
    }
}
