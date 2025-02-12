import java.util.Scanner;

public class EntradaSaidaDeDados {
    public static void main (String[] args){
        System.out.println("Preencha seus dados para o formulario de emprego:");
        System.out.println("-------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o seu Sobrenome: ");
        String sobreNome = scanner.nextLine();
        String nomeCompleto = nome + " " + sobreNome;
        System.out.println("Digite sua idade " + nomeCompleto + ":");
        int idade = scanner.nextInt();
        System.out.println("Digite seu tempo de profissão: ");
        int tempoProfissional = scanner.nextInt();
        System.out.println(nomeCompleto + " você tem " + idade + " anos " + "e está " + tempoProfissional + " anos no mercado de trabalho");




    }
}
