package colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Escreva um programa  que crie uma matriz de caracteres e
// imprima a primeira linha.

public class Ex10 {

    public static void main(String[] args) {
        List<List<Character>> matriz = new ArrayList<>();

        List<Character> linha1 = Arrays.asList('a', 'b', 'c');
        List<Character> linha2 = Arrays.asList('d', 'e', 'f');
        List<Character> linha3 = Arrays.asList('g', 'h', 'i');

        matriz.add(linha1);
        matriz.add(linha2);
        matriz.add(linha3);

        List<Character> primeiraLinha = matriz.get(0);
        System.out.println(primeiraLinha);
    }
}
