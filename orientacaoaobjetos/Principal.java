
package orientacaoaobjetos;

public class Principal {
    
    public static void main(String[] args) {
        Livro livro = new Livro();
        
        livro.nome = "Bóson Linux";
        livro.descricao = "Livro sobre Linux Bóson!";
        livro.isbn = "97867186617";
        livro.preco = 45.95;
        livro.autor = "Fábio dos Reis";
        livro.dataPub = "20/04/2017";
        
        System.out.printf("A data de publicação do livro %s é %s", livro.nome, livro.dataPub);
        System.out.printf("O autor do livro é %s", livro.autor);
    }
}
