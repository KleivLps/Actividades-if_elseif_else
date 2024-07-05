import java.util.Scanner;

public class divisorPor5y3 {
    public static void main(String[] args) {
        Scanner Numero = new Scanner(System.in);
        System.out.println("Ingresa el numero a dividir:");

        int divisor = Numero.nextInt();

        if (divisor % 5 == 0  ) {
            System.out.println("El numero es divisible por 5");
        } else if (divisor % 3 == 0) {
            System.out.println("El numero es divisible por 3");
        } else if (divisor % 5 == 0 && divisor % 3 == 0) {
            System.out.println("El numero es divisible por 5 y 3");
        } else   {
            System.out.println("El numero no es divisible ni por 5 ni por 3");
        }
        Numero.close();
    }
}