public class OperadoresArtimeticos {
    public static void main (String[] args){
        double pao = 10.50;
        double queijo = 7.00;
        double acucar = 4.00;
        double desconto = 5.00;
        int totalDiasMes = 30;

        double valorTotal = pao + queijo + acucar;
        double valorTotalComDesconto = valorTotal - desconto;
        double valorTotalDividido = valorTotalComDesconto / 2;
        double valorTotalMensal = valorTotalComDesconto * totalDiasMes;

        System.out.println("Valor Total com desconto = R$" + valorTotalComDesconto);
        System.out.println("Caso queira dividir o valor para cada fica R$" + valorTotalDividido );

        System.out.println("Você gasta no mês um total de: R$" + valorTotalMensal);


    }
}
