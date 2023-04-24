package colecoes;

import java.util.*;
//Escreva um programa que crie uma fila e adicione alguns elementos
// a ela. Em seguida, remova todos os elementos da fila e imprima-os.

public class Ex06 {

    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        fila.add(1);
        fila.add(2);
        fila.add(3);
        fila.add(4);
        fila.add(5);

        while(!fila.isEmpty()){
            System.out.print(fila.poll()+" ");
        }
        //O método poll() é semelhante ao método remove(), mas retorna null
        // se a fila estiver vazia, em vez de lançar uma exceção.


    }
}


