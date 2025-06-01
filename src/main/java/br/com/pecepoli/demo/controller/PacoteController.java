package br.com.pecepoli.demo.controller;

import br.com.pecepoli.demo.domain.Pacote;
import br.com.pecepoli.demo.service.PacoteService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PacoteController {
    private final PacoteService pacoteService;
    public PacoteController (PacoteService pacoteService){
        this.pacoteService = pacoteService;
    }
    @RequestMapping(method = RequestMethod.GET, path = "/dummy/pacote")
    public List<Pacote> obterTodos(){
        return pacoteService.obterTodos();
    }
}
