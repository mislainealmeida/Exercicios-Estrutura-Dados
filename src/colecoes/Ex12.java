package colecoes;

import java.util.ArrayList;
//Implemente uma classe Pilha (Stack) utilizando a estrutura de dados
// ArrayList do Java. Sua classe deve ter os métodos push(), pop()
// e isEmpty().

public class Ex12 {

    private ArrayList<Integer> pilha = new ArrayList<>();

    public void push(Integer numero){
        pilha.add(numero);
    }

    public Integer pop(){
        if (isEmpty()){
            throw new RuntimeException("A pilha está vazia.");
        }
        return pilha.remove(pilha.size()-1);
    }
    public boolean isEmpty(){
        return pilha.isEmpty();
    }

    public static void main(String[] args) {

        Ex12 pilha = new Ex12();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);

        System.out.println(pilha.pop());
        System.out.println(pilha.isEmpty());




    }

}
