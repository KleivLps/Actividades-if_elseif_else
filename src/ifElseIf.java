import java.util.Scanner;

public class ifElseIf {
    public static void main(String[] args) {


        Scanner parOimpar = new Scanner(System.in);
        System.out.println("Por favor indicame un numero");
       int Par = parOimpar.nextInt();
        if (Par == 0) {
            System.out.println("El numero es 0");
        } else if (Par > 1) {

            System.out.println("El numero es positivo");

        } else   {
            System.out.println( "El numero es negativo");
        }

    }
}