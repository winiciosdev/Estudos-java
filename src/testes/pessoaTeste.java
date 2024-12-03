package testes;
import classes.ImprimePessoa;
import classes.Pessoa;


public class pessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        ImprimePessoa impressora = new ImprimePessoa();

        pessoa1.nome = "didi";
        pessoa1.idade = 95;
        pessoa1.CPF = "12345678";

        impressora.imprimindoPessoa(pessoa1);

        pessoa2.nome = "mussum";
        pessoa2.idade = 90;
        pessoa2.CPF = "87654321";

        impressora.imprimindoPessoa(pessoa2);

    }
}
