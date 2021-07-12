package br.edu.ifrs.restinga.dev1.gabriel.diaSemana.diaController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Calendar;

@Controller
public class diaController {

    @RequestMapping("/diaSemana/{ano}/{mes}/{dia}")
    @ResponseBody
    public String diaSemana(@PathVariable int ano, @PathVariable int mes, @PathVariable int dia){
        Calendar c = Calendar.getInstance();
        String dayWeek = "";
        switch(mes){
            case 1:
                mes = Calendar.JANUARY;
                break;
            case 2:
                mes = Calendar.FEBRUARY;
                break;
            case 3:
                mes = Calendar.MARCH;
                break;
            case 4:
                mes = Calendar.APRIL;
                break;
            case 5:
                mes = Calendar.MAY;
                break;
            case 6:
                mes = Calendar.JUNE;
                break;
            case 7:
                mes = Calendar.JULY;
                break;
            case 8:
                mes = Calendar.AUGUST;
                break;
            case 9:
                mes = Calendar.SEPTEMBER;
                break;
            case 10:
                mes = Calendar.OCTOBER;
                break;
            case 11:
                mes = Calendar.NOVEMBER;
                break;
            case 12:
                mes = Calendar.DECEMBER;
                break;
        }
        c.set(Calendar.YEAR, ano);
        c.set(Calendar.MONTH, mes);
        c.set(Calendar.DAY_OF_MONTH, dia);

        switch(c.get(Calendar.DAY_OF_WEEK)){
            case 1:
                dayWeek = "Domingo";
                break;
            case 2:
                dayWeek = "Segunda";
                break;
            case 3:
                dayWeek = "Terça";
                break;
            case 4:
                dayWeek = "Quarta";
                break;
            case 5:
                dayWeek = "Quinta";
                break;
            case 6:
                dayWeek = "Sexta";
                break;
            case 7:
                dayWeek = "Sábado";
                break;
        }
        return dayWeek;
    }
}
