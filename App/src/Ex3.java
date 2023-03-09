import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        int media = 0;
        int soma = 0;



        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            soma = soma + numero;
            count++;
            if (numero > maior){
                maior = numero;
            }

        } while (count < 5);
        System.out.println("Maior número é: " + maior);
        media = soma / count;
        System.out.println(media);

    }
}
