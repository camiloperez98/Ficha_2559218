import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("ingrese la medida de las pulgadas: ");
        float pulgadas=sc.nextFloat();

        System.out.println(pulgadas+" pulgadas equivalen a "+(pulgadas*0.0254)+" metros");
    }
}
