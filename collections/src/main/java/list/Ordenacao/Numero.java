package main.java.list.Ordenacao;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Numero {
private List<Integer> numeroList;

    public Numero(List<Integer> numeroList) {
        this.numeroList = numeroList;
    }

    public List<Integer> getNumeroList() {
        return numeroList;
    }

    public void setNumeroList(List<Integer> numeroList) {
        this.numeroList = numeroList;
    }

    @Override
    public String toString() {
          return "Numero{" +
                      "numeroList=" + numeroList +
                      '}';
    }
    
public static void main(String[] args) {
        // This is where you can test the Numero class
        List<Integer> numeros = Arrays.asList(1, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20);

        // Example of lambda expression to filter pares numbers 
        Consumer<Integer> pares = numero -> {
            if (numero % 2 == 0) System.out.println(numero);
        };
            

        // Using the Consumer with the forEach method
        numeros.forEach(p -> {
            if (p % 2 == 0) {
                System.out.println(p);
            }
        });
    }
}
