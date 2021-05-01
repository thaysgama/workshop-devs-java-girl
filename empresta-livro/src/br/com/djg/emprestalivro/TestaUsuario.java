package br.com.djg.emprestalivro;

import br.com.djg.emprestalivro.dominio.Emprestimo;
import br.com.djg.emprestalivro.dominio.Livro;
import br.com.djg.emprestalivro.dominio.Usuario;

import java.util.Scanner;

public class TestaUsuario {
    public static void main(String[] args) {

        Usuario zezinho = new Usuario("Zezinho Silva","10/01/1994", "Rua João, 44");

        //Essa é a configuração se os atributos da classe usuário estivessem public
        //É melhor sempre utilizar o encapsulamento fazendo o get e o set
//        zezinho.nomeCompleto = "Zezinho Silva";
//        zezinho.dataNacimento = "10/01/1994";
//        zezinho.endereco = "Rua Amora, 91";

        //o set sobrescreve
        zezinho.setDataNacimento("10/01/1990");
        zezinho.setEndereco("Rua Amora, 91");

        //insere os itens não obrigatórios
        zezinho.setCodigoUsuario(250);

        zezinho.imprimirDadosUsuario();
        System.out.println("Pegar nome com get: " + zezinho.getNomeCompleto());
        System.out.println();


        Livro livroA = new Livro(001,"Torto Arado", "Itamar Vieira Junior");
        Livro livroB = new Livro(002,"Dom Casmurro", "Machado de Assis");

        //insere os campos não obrigatórios
        livroB.setNumeroPaginas(350);

        livroA.imprimirLivro();
        livroB.imprimirLivro();
        System.out.println("Número de páginas: "+livroB.getNumeroPaginas());
        System.out.println();

        Emprestimo emprestimo = new Emprestimo(25,zezinho,livroA, "23/04/2021", "24/04/2021");
        emprestimo.imprimeDadosEmprestimo();
    }
}
