package br.com.djg.emprestalivro.dominio;

public class Usuario {

    private int codigoUsuario;
    private String nomeCompleto;
    private String dataNacimento;
    private String endereco;

    public Usuario(String nomeCompleto, String dataNacimento, String endereco) {
        this.nomeCompleto = nomeCompleto;
        this.dataNacimento = dataNacimento;
        this.endereco = endereco;
    }

    public void imprimirDadosUsuario() {
        //o uso do this. se refere sempre a variavel da classs global
        System.out.println("Código do usuário: " +  codigoUsuario +
                "\nNome: " + this.nomeCompleto +
                "\nData de nascimento: "+ this.dataNacimento+
                "\nEndereço: "+ endereco);
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(String dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
