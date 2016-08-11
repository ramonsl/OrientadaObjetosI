/**
 * Created by ramon on 10/08/16.
 */
public class Principal {

    public static void main(String[] args) {
        Livro l1 = new Livro(); // instacia de um objeto "l1"
        Livro l2 = new Livro(); // instacia de um objeto "l1"
        Livro l3 = new Livro(); // instacia de um objeto "l1"

        l1.ler();
        l2.ler();
        l1.mostrar();
        if(l1.equals(l2)){
            System.out.println("iguais");
        }else{
            System.out.println("diferentes");
        }
      //  double valor =l1.aplicarDesconto(.2);
   //     l1.aplicarDesconto(.2);
        System.out.println("Valor desconto "+ l1.aplicarDesconto(.2));

        String a = "ramon";
        String b = "ramon";
                a.equals(b);

//        l2.mostrar();
  //      l3.mostrar();



    }
}
