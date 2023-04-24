package colecoes;

import java.util.HashMap;
import java.util.Map;
//Escreva um programa que crie um mapa e adicione alguns pares
// chave-valor a ele. Em seguida, imprima todos os pares chave-valor
// do mapa.

public class Ex08 {
    public static void main(String[] args) {
        Map<String, Integer> pessoa = new HashMap<>();

        pessoa.put("Ana", 20);
        pessoa.put("Eduardo", 31);
        pessoa.put("Joaquim", 94);
        pessoa.put("Larissa", 23);


        // O método entrySet() retorna um conjunto de pares chave-valor contidos
        // no mapa, que podem ser iterados com um loop for
        for (Map.Entry<String, Integer> entry: pessoa.entrySet()){
            System.out.println(entry.getKey()+ " tem "+ entry.getValue()+ " anos.");
        }
    }
}
