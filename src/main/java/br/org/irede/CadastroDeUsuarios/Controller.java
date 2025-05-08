package br.org.irede.CadastroDeUsuarios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/home")
    public String boasVindas() {
        return "Esse é a rota para meu home";

    }
}
