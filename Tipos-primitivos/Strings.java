public class Strings {
    public static void main (String[] args){

        String nome = "Giovanni";
        String nomeDois = "Giovanni";

        int tamanhoString = nome.length();
        boolean saoIguais = nome.equals(nomeDois);



        System.out.println("Olá " + nome.toUpperCase() + " seu nome tem " + tamanhoString + " caracteres");
        System.out.println("Os nomes são iguais: " + saoIguais);;
