package br.com.zup.calculadora.controllers;
import br.com.zup.calculadora.services.CalculadoraService;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @GetMapping("/calculadora")
    public String index() {
        return "index";
    }

    @Autowired
    private CalculadoraService calculadoraService;

    @PostMapping("/calcular")
    public String calcular(@RequestParam("numero1") double numero1,
                           @RequestParam("numero2") double numero2,
                           @RequestParam("operacao") String operacao,
                           Model model) {
        double resultado = switch (operacao) {
            case "+" -> calculadoraService.adicao(numero1, numero2);
            case "-" -> calculadoraService.subtracao(numero1, numero2);
            case "*" -> calculadoraService.multiplicacao(numero1, numero2);
            case "/" -> calculadoraService.divisao(numero1, numero2);
            default -> throw new IllegalArgumentException("Operação inválida: " + operacao);
        };

        model.addAttribute("resultado", resultado);
        return "index";
    }
}

