package colecoes;

import java.util.*;
//Implemente uma classe Fila (Queue) utilizando a estrutura de dados
// LinkedList do Java. Sua classe deve ter os métodos
// enqueue(), dequeue() e isEmpty().

public class Ex11 {
        private LinkedList<Integer> fila = new LinkedList<>();

        public void enqueue (Integer numero){//add o numero
            fila.addLast(numero);
        }

        public Integer dequeue() {//remove o numero
            return fila.removeFirst();
        }

        public boolean isEmpty() {//verifica se esta vazio
            return fila.isEmpty();
        }

    public static void main(String[] args) {
        Ex11 fila = new Ex11();

        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);

        System.out.println(fila.dequeue()); // Imprime 1
        System.out.println(fila.dequeue()); // Imprime 2
        System.out.println(fila.dequeue()); // Imprime 3
        System.out.println(fila.isEmpty()); // Imprime true

    }
}

