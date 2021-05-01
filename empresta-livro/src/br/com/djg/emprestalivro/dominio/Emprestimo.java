package br.com.djg.emprestalivro.dominio;

public class Emprestimo {

    // Atributos

    private int codigoSolicitacao;
    private Usuario usuario;
    private Livro livro;
    private String dataEmprestimo;
    private String dataDevolucao;

    // Construtor

    public Emprestimo(int codigoSolicitacao, Usuario usuario, Livro livro, String dataSolicitacao, String dataDevolucao) {
        this.codigoSolicitacao = codigoSolicitacao;
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = dataSolicitacao;
        this.dataDevolucao = dataDevolucao;
    }

    // Métodos

    public int getCodigoSolicitacao() {
        return codigoSolicitacao;
    }

    public void setCodigoSolicitacao(int codigoSolicitacao) {
        this.codigoSolicitacao = codigoSolicitacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }


    public void imprimeDadosEmprestimo(){
        System.out.println("Código empréstimo:" + codigoSolicitacao+
                "\nUsuario: "+ usuario.getNomeCompleto() +
                "\nNome do Livro: " + livro.getNomeDoLivro() + " - Autor: " + livro.getNomeDoLivro()+
                "\nData Empréstimo: "+ dataEmprestimo +
                "\nData Devolução: "+ dataDevolucao);
    }

}
