import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("ingrese un numero: ");
        float numero=sc.nextFloat();

        System.out.println("Cuadrado: "+Math.pow(numero,2));
        System.out.println("Cubo: "+Math.pow(numero,3));
        System.out.println("Cuarta potencia: "+Math.pow(numero,4));

    }
}
