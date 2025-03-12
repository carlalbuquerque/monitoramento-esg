package dio.monitoramento.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmpresaControlador {

    @GetMapping("/teste")
    public String teste() {
        return "Página de Teste";
    }
}
