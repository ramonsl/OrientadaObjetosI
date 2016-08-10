/**
 * Created by ramon on 10/08/16.
 */
public class Livro {
    String nome;
    double valor;
    String descricao;
    String isbn;

    //modificadorDeAcesso tipoDeRetorno nomeDoMetodo(Parametros){
        // codigo
    // }

    public void mostrar(){
        System.out.println("Valor: "+this.valor);
        System.out.println("Nome: "+this.nome);
        System.out.println("descricao: "+this.descricao);
        System.out.println("isbn: "+this.isbn);
        System.out.println();
    }

}
