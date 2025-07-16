package main.java.list.OperacoesBasicas;



public class Tarefa {
      private String descricao;

      public Tarefa(String descricao) {
            this.descricao = descricao;
      }

      public String GetDescricao() {
            return descricao;
      }
      

      @Override
      public String toString() {
            return  descricao;
      }
}
