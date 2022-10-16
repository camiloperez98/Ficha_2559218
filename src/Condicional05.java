import java.util.Scanner;

public class Condicional05 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("ingrese un numero: ");
        int numeroUno= sc.nextInt();

        System.out.println("ingrese otro numero: ");
        int numeroDos= sc.nextInt();

        if (numeroUno==numeroDos) {
            System.out.println("los numeros son iguales y su sumas es: "+(numeroUno+numeroDos));
        }
        else if (numeroUno<numeroDos) {
            System.out.println(Math.random()*(numeroUno-numeroDos+1)+numeroUno);
        }
        else if (numeroUno<0 && numeroDos<0) {
            System.out.println("los numeros son negativos " +
                    "numero1: "+numeroUno+" numero2: "+numeroDos);
        }
    }
}
