package br.edu.ifrs.restinga.dev1.gabriel.calcIMC.imcController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class imcController {

    @RequestMapping("/ola")
    @ResponseBody
    public String ola(){
        return "ola";
    }

    @RequestMapping("/imc/{peso}/{altura:.+}")
    @ResponseBody
    public String calcIMC(@PathVariable double peso, @PathVariable double altura){
//        double resIMC = peso/(altura*altura);
        double resIMC = peso/Math.pow(altura, 2);
        if (resIMC <18.5){
            return "Seu imc é de "+resIMC+" e sua classificação é de: Magreza";
        }else if (resIMC > 18.5 && resIMC < 24.9){
            return "Seu imc é de "+resIMC+" e sua classificação é de: Saudável";
        }else if (resIMC > 25.0 && resIMC < 29.9){
            return "Seu imc é de "+resIMC+" se sua classificação é de: Sobrepeso";
        }else if (resIMC > 30.0 && resIMC < 39.9){
            return "Seu imc é de "+resIMC+" e sua classificação é de: Obesidade Grau I";
        }else if (resIMC > 35.0 && resIMC < 39.9){
            return "Seu imc é de "+resIMC+" e sua classificação é de: Obesidade Grau II(severa)";
        }else if (resIMC >= 40.0){
            return "Seu imc é de "+resIMC+" e sua classificação é de: Obesidade Grau II(mórbida)";
        }return "n sei pq ta pedindo esse return";
    }
}
