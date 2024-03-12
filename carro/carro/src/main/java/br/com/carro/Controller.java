package br.com.carro;

@Controller
public class Controller {

@GetMapping('/carro')
public Modelandview getcarro(){
Modelandview mv = new Modelandview(viewName:'index');
return mv;
}

}
