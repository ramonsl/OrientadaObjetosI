import java.util.Scanner;

/**
 * Created by ramon on 10/08/16.
 */
public class Livro {
    String nome;
    double valor;
    String descricao;
    String isbn;
    Scanner tc = new Scanner(System.in);
    Autor autor;


    //modificadorDeAcesso tipoDeRetorno nomeDoMetodo(Parametros){
    // codigo
    // }

    public void ler(){
        System.out.println("Digite o nome");
        this.nome =tc.next();
    //    System.out.println("Digite o desc");
     //   this.descricao = tc.next();
        System.out.println("valor:");
        this.valor = tc.nextDouble();
        System.out.println("Digite o isbn");
        this.isbn = tc.next();
        autor = new Autor();
        autor.ler();
    }

    public void mostrar(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Valor: "+this.valor);
        System.out.println("descricao: "+this.descricao);
        System.out.println("isbn: "+this.isbn);
        System.out.println("Autor");
        this.autor.mostrar();
    }
    /* forma sem retorno
        void aplicarDesconto(double desconto){
            System.out.println("valor antigo "+ this.valor);
            this.valor -=this.valor * desconto;
            System.out.println("valor com desconto "+ this.valor);
        }
    */
    double aplicarDesconto(double desconto){
        System.out.println("valor antigo "+ this.valor);
        double desc =this.valor * desconto;
        this.valor -=this.valor * desconto;
        System.out.println("valor com desconto "+ this.valor);
        return desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Livro livro = (Livro) o;

        if (nome != null ? !nome.equals(livro.nome) : livro.nome != null) return false;
        return isbn != null ? isbn.equals(livro.isbn) : livro.isbn == null;

    }

}
