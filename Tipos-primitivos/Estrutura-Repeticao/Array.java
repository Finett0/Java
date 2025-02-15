public class Array {
    public static void main(String[] args) {
    // Declaração de Array

        int [] numeros = {10,20,30,40,50};
        String [] frutas;
        frutas = new String[]{"Maça","Banana","Melão"};

        double[] salarios = new double[5];
        salarios[3] = 500.00;
        salarios[1] = 200.00;
        salarios[0] = 150.00;
        salarios[2] = 25.00;
        salarios[4] = 100.00;
//
//        for(int posicao = 0; posicao <salarios.length; posicao++){
//            System.out.println(salarios[posicao]); }
        salarios[2] = 250.00;

        for(double salario : salarios){
            System.out.println(salario);
        }


    }
}
