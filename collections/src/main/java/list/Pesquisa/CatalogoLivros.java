package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
      private List<Livro> livroList;

      public CatalogoLivros() {
            this.livroList = new ArrayList();
      }

      // Addiciona um novo Livro
      public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
            livroList.add(new Livro(titulo, autor, anoPublicacao));
      }

      // Lista de Livros Por Autor
      public List<Livro> pesquisarPorAutor(String autor) {
            List<Livro> livroPorAutor = new ArrayList<>();
            if (!livroList.isEmpty()) {
                  for (Livro livro : livroList) {
                        if (livro.getAutor().equalsIgnoreCase(autor)) {
                              livroPorAutor.add(livro);
                        }
                  }
            }
            return livroPorAutor;
      }

      // Pesquisa Livro por intervalo de Anos
      public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
            List<Livro> livroPorIntervaloAnos = new ArrayList<>();
            if (!livroList.isEmpty()) {
                  for (Livro livro : livroList) {
                        if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                              livroPorIntervaloAnos.add(livro);
                        }
                  }
            }
            return livroPorIntervaloAnos;
      }

      // Pesquisa de Livro por Titulo
      public Livro pesquisarPorTitulo(String titulo) {
            Livro livroPorTitulo = null;
            if (!livroList.isEmpty()) {
                  for (Livro livro : livroList) {
                        if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                              livroPorTitulo = livro;
                              break;
                        }
                  }
            }
            return livroPorTitulo;
      }

      public static void main(String[] args) {
            CatalogoLivros catalogoLivros = new CatalogoLivros();

            catalogoLivros.adicionarLivro("Título 1", "Pedro Miguel", 2020);
            catalogoLivros.adicionarLivro("Título 1", "Alexandre André", 2020);
            catalogoLivros.adicionarLivro("Título 2", "Adão Ifafe", 2020);
            catalogoLivros.adicionarLivro("Título 3", "Benjamim Ifafe", 2020);
            catalogoLivros.adicionarLivro("Título 4", "Edmilson António", 2020);
            catalogoLivros.adicionarLivro("Título 5", "Roger Saturnino", 2020);

            System.out.println("\n");
            System.out.println("Livros do autor Pedro Miguel: " + catalogoLivros.pesquisarPorAutor("Pedro Miguel"));
            System.out.println("\n");
            System.out.println("Livro por Título: " + catalogoLivros.pesquisarPorTitulo("Título 1"));
            System.out.println("\n");
            System.out.println("Livros publicados entre 2019 e 2021: \n\n"
                        + catalogoLivros.pesquisarPorIntervaloAnos(2019, 2021));
            System.out.println("\n");
      }
}
