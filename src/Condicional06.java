import java.util.Scanner;

public class Condicional06 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("ingrese una frase: ");
        String palabra_1= sc.nextLine();

        System.out.println("ingrese otra frase: ");
        String palabra_2= sc.nextLine();

        if (palabra_1.equalsIgnoreCase(palabra_2)) {
            System.out.println("son iguales");
        }
        else {
            System.out.println("son diferentes frase 1: "+palabra_1+" y frase 2: "+palabra_2);
        }



    }
}
