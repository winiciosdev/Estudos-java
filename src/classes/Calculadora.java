package classes;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public double divideDoisNumeros(double num1, double num2){
        return num1/num2;
    }

    public void imprimeSomaDeDoisNumeros(int num1, int num2){
        if (num2 == 0){
            System.out.println("o número zero não adiciona nada ao primeiro número");
       return;
        }
        System.out.println(num1 + num2);
    }

    public void alteraDoisNumeros(int num1, int num2 ){
       num1 = 11;
       num2 = 22;
        System.out.println("dentro do metodo");
        System.out.println("Número 1 " + num1);
        System.out.println("Número 2 " + num2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for( int num: numeros){
            soma+= num;
        }
        System.out.println(soma);
    }
}
