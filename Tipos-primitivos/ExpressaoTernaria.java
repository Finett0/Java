import java.util.Scanner;

public class ExpressaoTernaria {
    public static void main (String []args){
        int idade;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();
        String mensagem = (idade >= 18) ? "Você é maior de idade.":"Você é menor de idade.";
        System.out.println(mensagem);

    }
}
