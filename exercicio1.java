import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, qntd;
        double total = 0, media = 0;

        // Aqui vai ser inserido a quantidade de disciplinas no semestre
        System.out.println("Insira a quantidade de disciplinas do Semestre: ");
        qntd = sc.nextInt();

        // Aqui é inserido o tamanho da lista
        double lista[] = new double[qntd];

        for(i = 0; i < lista.length; i++){
            System.out.println("Insira sua " + (i + 1) +"°" + " nota");
            lista[i] = sc.nextDouble();

            while (lista[i] > 10 || lista[i] < 0) {
                lista[i] = 0;
                System.out.println("A nota que você inseriu não condiz com uma nota aceitável, insira novamente");
                lista[i] = sc.nextDouble();
            } 
            
            if (lista[i] >= 6) {
                System.out.println("Parabéns você passou na " + (i + 1) + "°" + " disciplina com nota " + lista[i]);
            } else{
                System.out.println("Infelizmente você não passou na " + (i + 1) + "°" + " disciplina e obteve a " + lista[i]);
            }
        }

        for(i = 0; i < lista.length; i++){
            System.out.println("Disciplina " + (i + 1) + ": " + lista[i]);
            total += lista[i];
        }

        media = total / lista.length ;

        System.out.printf("Sua média entre o total de disciplinas" + lista.length + " é " + media);
    }
}