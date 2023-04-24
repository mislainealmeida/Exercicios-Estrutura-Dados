package colecoes;

import java.util.LinkedList;
//Escreva um programa que crie uma lista ligada simples e adicione alguns elementos a ela.
// Em seguida, imprima todos os elementos da lista.


public class Ex04 {

    public static void main(String[] args) {
        //Primeiro, ao criar uma lista ligada simples, é necessário instanciar um objeto
        // do tipo LinkedList, em vez de instanciar um objeto do tipo List.
        LinkedList<Integer> elementos= new LinkedList<>();

        // Para adicionar elementos a uma lista ligada,
        // você deve usar o método add() da classe LinkedList.
        elementos.add(1);
        elementos.add(2);
        elementos.add(3);
        elementos.add(4);
        elementos.add(5);
        elementos.add(6);
        elementos.add(7);
        elementos.add(8);
        elementos.add(8);
        elementos.add(10);

        //Se você precisa de flexibilidade e personalização, o loop
        // for each é uma boa opção. Se você precisa de simplicidade
        // e concisão, o método toString() ou a sintaxe direta podem
        // ser mais adequados.

        for(Integer elemento: elementos){
            System.out.print(elemento+" ");
        }

        System.out.println();
        System.out.println("------------");
        System.out.println(elementos);

        System.out.println("------------");
        System.out.println(elementos.toString());
    }
}
