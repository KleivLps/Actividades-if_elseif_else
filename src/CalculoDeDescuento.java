import java.util.Scanner;

public class CalculoDeDescuento {

    public static void main(String[] args) {

        Scanner numDescuento = new Scanner(System.in);
        System.out.println("Ingresa el precio del producto:");

       int descuento = numDescuento.nextInt();

       //Calculando el descuento
        double precioDescuento = descuento * 0.10;
        double precioDescuento2 = descuento * 0.20;
        double numeroConDescuento = descuento - precioDescuento;
        double numeroConDescuento2 = descuento - precioDescuento2;

        if (descuento >= 100 && descuento <= 219 ) {
            System.out.println("el descuento del producto es del 10%, el precio total del producto sera: " +numeroConDescuento);
        } else if (descuento >= 220 ) {
            System.out.println("El descuento del producto es del 20%, el precio total del producto sera:" +numeroConDescuento2);
        } else if (descuento < 100) {
            System.out.println("El producto no cuenta con descuento :C ");
        }
        numDescuento.close();
    }
}


