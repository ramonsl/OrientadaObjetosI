/**
 * Created by ramon on 10/08/16.
 */
public class Principal {

    public static void main(String[] args) {
        Livro l1 = new Livro(); // instacia de um objeto "l1"
        Livro l2 = new Livro(); // instacia de um objeto "l1"
        Livro l3 = new Livro(); // instacia de um objeto "l1"

        l1.nome ="JAVA S2";
        l1.descricao = "Java > all";
        l1.valor = 32.00;
        l1.isbn = "38276-48";
            //atribuiçao de valores ao obj.
        l2.nome ="PHP";
        l2.descricao = "Java > php";
        l2.valor = 12.00;
        l2.isbn = "2424-24";
            //atribuiçao de valores ao obj.
        l3.nome ="C#";
        l3.descricao = "Micro$$oft";
        l3.valor = 1209.00;
        l3.isbn = "666-66";
            //atribuiçao de valores ao obj.


        l1.mostrar();
        l2.mostrar();
        l3.mostrar();



    }
}
