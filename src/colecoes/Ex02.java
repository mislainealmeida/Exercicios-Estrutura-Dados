package colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Escreva um programa que crie
//um array de strings e imprima o tamanho do array.

public class Ex02 {


    public static void main(String[] args) {
        List<String> elementos = new ArrayList<>();
        elementos=Arrays.asList("Ana", "José", "Patrícia", "Mônica");

        System.out.println("O tamanho do array é de: "+ elementos.size()+" posições.");
    }


}