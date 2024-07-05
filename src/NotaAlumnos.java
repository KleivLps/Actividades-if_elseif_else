import java.util.Scanner;

public class NotaAlumnos {
    public static void main(String[] args) {
        Scanner Nota = new Scanner(System.in);
        System.out.println("Ingresa la nota del alumno:");
        int nota = Nota.nextInt();
        if (nota >= 90 && nota <= 100) {
            System.out.println("El alumno ha aprobado con creces :'A'");
        } else if (nota >= 80 && nota <= 90) {
            System.out.println("El alumno tuvo una muy buena nota: 'B'");
        } else if (nota >= 70 && nota <= 80) {
            System.out.println("El alumno saco una buena nota: 'C'");
        } else if (nota >= 60 && nota <= 70) {
            System.out.println("El alumno aprobo con la nota minima: 'D'");
        }else if(nota <=60 ) {
            System.out.println("El alumno reprobo el curso: 'F'");
        }else {
            System.out.println("Por favor ingresa un numero valido ");
        }
        Nota.close();
        }
    }