import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var vitor = new Pessoa();
        vitor.setNome("Vítor");
        vitor.setIdade(26);

        var arthur = new Pessoa();
        arthur.setNome("Arthur");
        arthur.setIdade(18);

        var yugi = new Pessoa();
        yugi.setNome("yugi");
        yugi.setIdade(29);

        var listaDePessoas = new ArrayList<Pessoa>();
        listaDePessoas.add(vitor);
        listaDePessoas.add(arthur);
        listaDePessoas.add(yugi);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.getFirst());
        System.out.println(listaDePessoas);
    }
}