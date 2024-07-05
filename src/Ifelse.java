import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {


        Scanner Edad = new Scanner(System.in);
        System.out.println("Por favor ingrese su edad");
        int edad = Edad.nextInt();
        if (edad >= 18) {
            System.out.println("Usted es mayor de edad");

            } else  {
            System.out.println("Usted es menor de edad");
        }
        }
}