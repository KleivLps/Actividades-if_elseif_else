import java.util.Scanner;

public class VerificadorDeContraseña {
        public static void main(String[] args) {
            String Contraseñapredefinida = "galletita";
            Scanner Clave = new Scanner(System.in);
            System.out.println("Por favor ingresa la contraseña:");

            String contraseña = Clave.nextLine();

            if (contraseña.equals(Contraseñapredefinida) ) {
                System.out.println("La contraseña es correcta | ACCESO CONCEDIDO");
            } else  {
                System.out.println("La contraseña es incorrecta | ACCESO DENEGADO");
            }
            Clave.close();
        }

}
