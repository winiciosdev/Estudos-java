package testes;

import classes.Calculadora;

public class calculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);

    }
}
