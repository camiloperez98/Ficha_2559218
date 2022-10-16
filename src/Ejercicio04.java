import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("ingrese el primer numero: ");
        float numero1=sc.nextFloat();

        System.out.println("ingrese el segundo numero: ");
        float numero2=sc.nextFloat();

        System.out.println("Suma de los dos numeros: "+(numero1+numero2));
        System.out.println("Diferencia entre los dos numero: "+(numero1-numero2));
        System.out.println("Productos de los dos numero: "+(numero1*numero2));
        System.out.println("Promedio de los dos numeros: "+(numero1+numero2)/2);
        System.out.println("Maximo valor: "+Math.max(numero1,numero2));
        System.out.println("Minimo valor: "+Math.min(numero1,numero2));

    }
}
