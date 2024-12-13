package br.edu.ifpr.pgua.eic.tads.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Handler;

import br.edu.ifpr.pgua.eic.tads.models.Cadastro;
import br.edu.ifpr.pgua.eic.tads.models.Pessoa;
import io.javalin.http.Context;

public class ListaController {

    private Cadastro cadastro;

    public ListaController(Cadastro cadastro){
        this.cadastro = cadastro;
    }
    
    public io.javalin.http.Handler get = (Context ctx) ->{

        List<Pessoa> lista = cadastro.getPessoas();

        Map<String,Object> dados = new HashMap<>();

        dados.put("lista",lista);
        ctx.render("lista.html", dados);


    };

}
