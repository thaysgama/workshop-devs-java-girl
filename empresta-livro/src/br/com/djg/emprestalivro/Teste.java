package br.com.djg.emprestalivro;

import br.com.djg.emprestalivro.dominio.Emprestimo;
import br.com.djg.emprestalivro.dominio.Livro;
import br.com.djg.emprestalivro.dominio.Usuario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();
        System.out.println("Digite sua data de nascimento: ");
        String dataNascimento = scanner.nextLine();
        System.out.println("Digite seu endereço: ");
        String endereco = scanner.nextLine();

        Usuario usuario = new Usuario(nomeCompleto, dataNascimento, endereco);
        usuario.imprimirDadosUsuario();

        System.out.println("Digite o código do livro: ");
        int codigoLivro = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o título do livro: ");
        String nomeLivro = scanner.nextLine();
        System.out.println("Digite o autor: ");
        String autor = scanner.nextLine();

        Livro livro = new Livro(codigoLivro, nomeLivro, autor);
        livro.imprimirLivro();


        System.out.println("Digite o código do empréstimo: ");
        int codigoEmprestimo = scanner.nextInt();
        scanner.nextLine();

        String dataEmprestimo = "";
        String dataDevolucao = "";
        boolean invalido = true;

        while (invalido) {
            System.out.println("Digite data do empréstimo: ");
            dataEmprestimo = scanner.nextLine();
            System.out.println("Digite sua data de devolução: ");
            dataDevolucao = scanner.nextLine();

            // formato da data 2021-04-23
            LocalDate localDateEmprestimo = LocalDate.parse(dataEmprestimo, DateTimeFormatter.ISO_DATE);
            LocalDate localDateDevolucao = LocalDate.parse(dataDevolucao, DateTimeFormatter.ISO_DATE);

            if (localDateDevolucao.isBefore(localDateEmprestimo)) {
                invalido = true;
                System.out.println("A data devolução deve ser depois da data de empréstimo");
            } else {
                invalido = false;
                System.out.println("Seu empréstimo foi concluido com sucesso");
            }
        }

        Emprestimo emprestimo = new Emprestimo(codigoEmprestimo, usuario, livro, dataEmprestimo, dataDevolucao);
        emprestimo.imprimeDadosEmprestimo();
    }
}
