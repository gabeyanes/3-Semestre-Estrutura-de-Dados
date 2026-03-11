import java.util.Scanner;

// Elaborar um programa simples na linguagem que melhor lhe convir para calculo da sequencia de Fibonacci,
// substituindo os conteúdos a cada rodada comprovando seus valores

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, qntd, total = 0, numum1 = 0, numdois = 1;

        System.out.println("Insira o número de termos que irão ser calculados pela sequência de fibonachi: ");
        qntd = sc.nextInt();

        int lista[] = new int[qntd];

        for(i = 2; i < lista.length; i++){
            total = numum1 + numdois;
            numum1 = numdois;
            numdois = total;
            System.out.println(total);
        }
    }
}
