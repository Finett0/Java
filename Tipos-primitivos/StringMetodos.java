public class Strings {
    public static void main (String[] args){

        String nome = "Giovanni";
        String nomeDois = "Giovanni";
        String sobreNome = " Finetto";

        String nomeCompleto = nome.concat(sobreNome);

        int tamanhoString = nome.length();
        boolean saoIguais = nome.equals(nomeDois);

        String str = "Hello";
        char ch = str.charAt(0); // 'H'

        String minusculo = str.toLowerCase();


        System.out.println("Meu nome completo é: " + nomeCompleto);
        System.out.println("Olá " + nome.toUpperCase() + " seu nome tem " + tamanhoString + " caracteres");
        System.out.println("Os nomes são iguais: " + saoIguais);;

        System.out.println("Iremos trabalhar com a frase " + str);

        System.out.println("O Primeiro caracter da frase Hello é: " + ch);

        System.out.println("O Metedo para deixar uma função em minusculo é toLowerCase() exp: str.toLowerCase(): " + minusculo);

    }
}
