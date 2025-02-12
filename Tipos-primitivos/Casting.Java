public class Casting {
    public static void main(String[] args){
        //Conversão implicita
        int i1 = 10;
        double d1 = i1;
        System.out.println(d1);

        //Conversão explicita
        double d2 = 10.5;
        int i2 = (int)d2; //casting
        System.out.println(i2);

        //Convertendo int para string
        Integer idade = 20;
        String idadeString  = idade.toString();
        System.out.println(idade);
        System.out.println(idadeString);

        //Covertendo String para int
        String cpf = "12345678";
        Integer cpfInt = Integer.parseInt(cpf);
        System.out.println(cpf);
        System.out.println(cpfInt);
    }
}
