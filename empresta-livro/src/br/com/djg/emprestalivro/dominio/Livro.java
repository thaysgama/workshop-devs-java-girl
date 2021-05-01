package br.com.djg.emprestalivro.dominio;

public class Livro {

    //Atributos

    private int codigoLivro;
    private String nomeDoLivro;
    private String autor;
    private int numeroPaginas;

    //Construtor

    public Livro(int codigoLivro, String nomeDoLivro, String autor) {
        this.codigoLivro = codigoLivro;
        this.nomeDoLivro = nomeDoLivro;
        this.autor = autor;
    }

    //Métodos

    public int getCodigoLivro() {
        return codigoLivro;
    }

    public void setCodigoLivro(int codigoLivro) {
        this.codigoLivro = codigoLivro;
    }

    public String getNomeDoLivro() {
        return nomeDoLivro;
    }

    public void setNomeDoLivro(String nomeDoLivro) {
        this.nomeDoLivro = nomeDoLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void imprimirLivro(){
        System.out.println("Código do livro: " + this.codigoLivro +
                "\nNome: "+ this.nomeDoLivro+
                "\nAutor: "+ autor);
    }

}
