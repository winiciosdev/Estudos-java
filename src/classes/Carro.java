package classes;

public class Carro {
    public String nome;
    public int ano;
    public String modelo;
    public int preco;

    public void exibeCarro(){
        System.out.println(nome);
        System.out.println(ano);
        System.out.println(modelo);
        System.out.println(preco);

    }

    public double valorizaCarro(int preco){
      return 2;
    }
}
