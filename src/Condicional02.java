import java.util.Scanner;

public class Condicional02 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("ingrese el primer numero: ");
        int n1=sc.nextInt();

        System.out.println("ingrese el segundo numero: ");
        int n2= sc.nextInt();

        System.out.println("ingrese el tercer numero: ");
        int n3= sc.nextInt();

        if (n1>n2 && n1>n3) {
            System.out.println("el primer numero es el mayor ");
        }
        else if (n2>n1 && n2>n3) {
            System.out.println("el segundo numero es el mayor ");

        }
        else {
            System.out.println("el tercer numero es el mayor");
        }
    }
}
