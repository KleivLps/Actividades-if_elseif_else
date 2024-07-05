import java.util.Scanner;

public class DeterminacionDeEdades {

    public static void main(String[] args) {

        Scanner edades = new Scanner(System.in);
        System.out.println("Ingresa tu edad:");

        int Edad = edades.nextInt();

        if (Edad < 18 ) {
            System.out.println("Eres menor de edad");
        } else if (Edad >= 18 && Edad <=64 ) {
            System.out.println("Eres adulto ");
        } else if (Edad >= 65) {
            System.out.println("Eres un adulto mayor ");
        }
        edades.close();
    }
}


