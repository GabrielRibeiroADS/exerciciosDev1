package br.edu.ifrs.restinga.dev1.gabriel.operacoesMatematicas.opMatController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class opMatController {

    @RequestMapping("/calculadora/adicao")
    @ResponseBody
    public String adicao(@RequestParam int n1, @RequestParam int n2){
        int soma = n1+n2;
        return "A soma dos números "+n1+" e "+n2+" é "+soma+"!";
    }

    @RequestMapping("/calculadora/subtracao")
    @ResponseBody
    public String subtracao(@RequestParam int n1, @RequestParam int n2){
        int sub = n1-n2;
        return n1+" menos "+n2+" é igual a: "+sub+"!";
    }

    @RequestMapping("/calculadora/multiplicacao")
    @ResponseBody
    public String multiplicacao(@RequestParam int n1, @RequestParam int n2){
        int mult = n1*n2;
        return "A multiplicacao dos números "+n1+" e "+n2+" é "+mult+"!";
    }

    @RequestMapping("/calculadora/divisao")
    @ResponseBody
    public String divisao(@RequestParam int n1, @RequestParam int n2){
        int div = n1/n2;
        return n1+" dividido por "+n2+" é igual a: "+div+"!";
    }

}
