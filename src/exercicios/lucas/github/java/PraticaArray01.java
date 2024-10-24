package exercicios.lucas.github.java;

public class PraticaArray01 {
    public static void main(String[] args) {

        String[] nomeViloes = {"Desejo" , "Darkside", "Flash reverso", "coringa"};
        int[] nivelDePoder = {100, 90, 80, 70};

        for (int i = 0; i < nivelDePoder.length - 1; i ++){
            int maxIndex = i;

            for (int j = i + 1; j < nivelDePoder.length; j++){
                if (nivelDePoder[j] > nivelDePoder[maxIndex]){
                    maxIndex = j;

                }
            }

            int temp = nivelDePoder[maxIndex];
            nivelDePoder[maxIndex] = nivelDePoder[i];
            nivelDePoder[i] = temp;

            String tempNome = nomeViloes[maxIndex];
            nomeViloes[maxIndex] = nomeViloes[i];
            nomeViloes[i] = tempNome;
        }

        for (int i = 0; i < nivelDePoder.length; i ++){
            System.out.println(nomeViloes[i] + " Nivel de poder: " + nivelDePoder[i]);
        }
    }
}
