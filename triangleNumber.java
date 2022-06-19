//Написать программу вычисления n-ого треугольного числа.
import java.util.Scanner;
public class triangleNumber {

    public static int reader() {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Введите положительное целое число n: !");
        while (!sc.hasNextInt()) {
            System.out.println("Неправильный ввод! Попробуйте еще раз!");
            sc.next(); 
        }
        number = sc.nextInt();
        } while (number <= 0);
        sc.close();
        return number;
    }
       
    public static int definition(int number){
        return (int) (0.5*number*(number+1));
    }
    public static void main(String [] args) {
        int number = reader();
        System.out.println("Спасибо! Вы ввели число " + number);
        int result = definition(number);
        System.out.printf("Треугольное число: %d \n", result);
    }
}
