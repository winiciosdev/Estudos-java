package classes;

public class Estudante {
    public String matricula;
    public  String nome;
    public int idade;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.matricula);
    }
}
