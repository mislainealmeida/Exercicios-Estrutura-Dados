package colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Escreva um programa que crie um array bidimensional de inteiros e
// calcule a soma de todos os seus elementos.

public class Ex09 {

    public static void main(String[] args) {
        // uma lista de listas (List<List<Integer>>) para representar a matriz. Em seguida,
        // percorrer todas as listas internas e somar seus elementos.

        List<List<Integer>> matriz = new ArrayList<>();
        matriz.add(Arrays.asList(1, 2, 3));
        matriz.add(Arrays.asList(4, 5, 6));
        matriz.add(Arrays.asList(7, 8, 9));

        int soma = 0;
        for (List<Integer> linha : matriz) {
            for (int elemento : linha) {
                soma += elemento;
            }
        }
        System.out.println("Soma dos elementos da matriz: " + soma);

    }
}
