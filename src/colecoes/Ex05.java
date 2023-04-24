package colecoes;

import java.util.Stack;
//Escreva um programa que crie uma pilha e adicione alguns elementos
// a ela. Em seguida, remova todos os elementos da pilha e imprima-os.
public class Ex05 {

    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);

        System.out.println(pilha);//empilhando
        System.out.println("-----------");

        while(!pilha.isEmpty()){//desempilhando
            System.out.print(pilha.pop()+" ");
        }
    }
}
