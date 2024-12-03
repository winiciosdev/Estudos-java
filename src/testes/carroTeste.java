package testes;

import classes.Carro;

public class carroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.nome = "Mustang";
        carro.preco = 100000;
        carro.ano = 1999;
        carro.modelo = "brabo";


        System.out.println(carro.valorizaCarro(100000));
    }
}
