package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdencaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdencaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparadorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdencaoPessoas ordencaoPessoas = new OrdencaoPessoas();

        ordencaoPessoas.adicionarPessoa("Ifafe",25,1.80);
        ordencaoPessoas.adicionarPessoa("Domingos",20,1.60);
        ordencaoPessoas.adicionarPessoa("Adam",15,1.80);
        ordencaoPessoas.adicionarPessoa("André",22,1.70);
        ordencaoPessoas.adicionarPessoa("Edmilson",12,1.40);
        ordencaoPessoas.adicionarPessoa("Longuessa",45,1.85);

        System.out.println(ordencaoPessoas.pessoaList); // Sem ordenção
        System.out.println(ordencaoPessoas.ordenarPorIdade() + "\n");// Ordem por idade
        System.out.println(ordencaoPessoas.ordenarPorAltura());// Ordem por Altura
    }
}
