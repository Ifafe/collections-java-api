package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
      private List<Item> ListaCompra;

      public CarrinhoDeCompra() {
            this.ListaCompra = new ArrayList<>();
      }

      public void adicionarItem(String nome, double preco, int quantidade) {
            ListaCompra.add(new Item(nome, preco, quantidade));
      }
      
      public void removerItem(String nome) {
            List<Item> itemParaRemover = new ArrayList<>();
            for (Item i : ListaCompra) {
                  if (i.getNome().equalsIgnoreCase(nome)) {
                        itemParaRemover.add(i);
                  }
            }
             ListaCompra.removeAll(itemParaRemover);
      }

      public double calcularValorTotal() {
            double total = 0;
            for (Item item : ListaCompra) {
                  total += item.getPreco() * item.getQuantidade();
            }
            return  total;
      }
      
      public void exibirItens() {
            if (!ListaCompra.isEmpty()) {            
                  System.out.println("Itens no carrinho:");
                  for (Item item : ListaCompra) {
                        System.out.println(item);
                  }
            }
      }

      public static void main(String[] args) {
            CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();

            espaco();
           System.out.println("O valor total do carrinho é: " +  carrinhoDeCompra.calcularValorTotal() + "$");

            carrinhoDeCompra.adicionarItem("Maçã", 250.99, 4);
            carrinhoDeCompra.adicionarItem("Pera", 300.99, 3);
            carrinhoDeCompra.adicionarItem("Abacate", 500.99, 6);
            carrinhoDeCompra.adicionarItem("Goiaba", 150.99, 4);

            espaco();
           

            carrinhoDeCompra.exibirItens();
            espaco();
           System.out.println("O valor total do carrinho é: " +  carrinhoDeCompra.calcularValorTotal() + "$");

            espaco();

            carrinhoDeCompra.removerItem("Maçã");
            espaco();

            carrinhoDeCompra.exibirItens();
            espaco();
           System.out.println("O valor total do carrinho é: " +  carrinhoDeCompra.calcularValorTotal() + "$");

            espaco();
      }

      public static void espaco() {
            System.out.println("\n");
      }
}
