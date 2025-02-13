import java.util.Scanner;

public class EstruturaCondicional {
    public static void main(String [] args){
        System.out.println("Formulario de recrutamento do exercito brasileiro:");
        System.out.println("-------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        String nome;
        Integer idade;
        double altura;
        double peso;

        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();
        System.out.println("Digite seu peso: ");
        peso = scanner.nextDouble();
        System.out.println("Digite sua altura: ");
        altura = scanner.nextDouble();

        if(idade >= 18 && altura >= 1.60 && peso >= 55){
            System.out.println("Você está apto para ser recruta");
        }
        else{
            System.out.println("Você não está apto para servir o exercito!");
        }
    }
}
