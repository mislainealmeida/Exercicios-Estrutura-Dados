package colecoes;

import java.util.*;
//Escreva um programa que crie um conjunto e adicione alguns elementos
// a ele. Em seguida, imprima todos os elementos do conjunto.

public class Ex07 {

    public static void main(String[] args) {
        Set<Integer> conjunto = new HashSet<>();
        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(3);
        conjunto.add(4);
        conjunto.add(5);

        //usar um loop é necessário para imprimir os elementos
        // de um conjunto de forma individualizada.

        for (Integer conjuntoSet: conjunto){
            System.out.print(conjuntoSet+ " ");
        }
    }
}
