package colecoes;

import java.util.Arrays;
import java.util.List;
//Escreva um programa que crie um array de inteiros
// e calcule a soma de todos os seus elementos.

public class Ex03 {


    public static void main(String[] args) {
        Integer[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        List<Integer> numerosList = Arrays.asList(numeros);

       int soma = 0;
       for (int i= 0; i< numerosList.size(); i++){
           soma += numerosList.get(i);
       }
        System.out.println("A soma de todos os elementos da lista é: "+soma);
    }
}
