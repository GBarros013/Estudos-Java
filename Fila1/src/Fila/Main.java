package Fila;

public class Main {
    public static void main(String[] args) {
        Fila<String> minhaFila = new Fila<String>();

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        System.out.println(minhaFila);
    }
}
