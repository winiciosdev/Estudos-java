package testes;

import classes.Estudante;
import classes.ImpressoraEstudante;

public class estudanteTeste {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome  = "chaves";
        estudante1.idade = 60;
        estudante1.matricula = "01";

        estudante2.nome  = "kiko";
        estudante2.idade = 59;
        estudante2.matricula = "02";

        estudante1.imprime();
        estudante2.imprime();
    }
}
