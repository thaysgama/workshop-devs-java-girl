package br.com.djg.emprestalivro.controller;

import br.com.djg.emprestalivro.Servico.LivroService;
import br.com.djg.emprestalivro.dominio.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivroController {

    @Autowired
    private LivroService livroService;

    @PostMapping("/livro")
    public void salvarLivro(@RequestBody Livro livro){
        livroService.salvaLivro(livro);
    }
}
