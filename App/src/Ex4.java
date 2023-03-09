import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumero;
        int count = 0;
        int numero;
        int quantPares = 0;
        int quantImpar = 0;

        System.out.println("Quantidade de números: ");
        quantNumero = scan.nextInt();

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            if (numero % 2 == 0){
                quantPares++;
            }else {
                quantImpar++;
            }
            count++;

        } while(count < quantNumero);
        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Impar: " + quantImpar);

    }
}
