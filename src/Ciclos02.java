public class Ciclos02 {
    public static void main(String[] args) {

        int numero=1;

        while(numero<=10){
            if (numero==5){
                numero++;
                continue;
            }
            System.out.println(numero);
            numero++;
        }
    }
}
