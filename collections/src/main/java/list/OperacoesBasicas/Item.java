package main.java.list.OperacoesBasicas;

public class Item {
      private String nome;
      private double preco;
      private double quantidade;

      public Item(String nome, double preco, double quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
      }

      public String getNome() {
            return nome;
      }

      public void setNome(String nome) {
            this.nome = nome;
      }

      public double getPreco() {
            return preco;
      }

      public void setPreco(double preco) {
            this.preco = preco;
      }

      public double getQuantidade() {
            return quantidade;
      }

      public void setQuantidade(double quantidade) {
            this.quantidade = quantidade;
      }

      @Override
      public String toString() {
            return "Item{" +
                    "nome='" + nome + '\'' +
                    ", preço=" + preco +"$" +
                    ", quantidade=" + quantidade +
                    '}';
      }

     

}
