public class Ciclos01 {
    public static void main(String[] args) {

        System.out.println("--------for--------");

        for (int contador=1; contador<=10; contador++) {
            System.out.println("Hola mundo");
        }

        System.out.println("---------while-----");

        int cont=1;

        while (cont<=10) {
            System.out.println("Hola mundo");
            cont++;
        }

        System.out.println("--------do while----");

        int myCont=1;

        do {
            System.out.println("Hola mundo");
            myCont++;
        }
        while (myCont<=10);
    }
}
