import java.util.ArrayList;

public class EstudoArrayList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("São Paulo");
        cities.add("Santos");
        cities.add("Ribeirão Preto");
        cities.add(1,"Campinas");

        // Saida da lista
        System.out.println(cities);

        //Acessando um elemento
        System.out.println(cities.get(2));

        //Alterando um elemento
        cities.set(3,"Mirassol");
        System.out.println(cities);

        // Excluir um elemento
        cities.remove(1);
        System.out.println(cities);

        //Verificar o tamanho da lista
        System.out.println("A Lista tem: " + cities.size() + " elementos");

        //Laço for
        System.out.println("Laço for");
        for(int i = 0; i < cities.size(); i++){
            System.out.println(cities.get(i));
        }

        // Laço For-Each
        System.out.println("Laço For-Each");
        for(String city : cities){
            System.out.println(city);

        }

    }
}
