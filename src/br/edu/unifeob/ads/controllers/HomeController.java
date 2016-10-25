package br.edu.unifeob.ads.controllers;
import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

@Controller
public class HomeController {
	
	private Result result;	
	
	public HomeController(){		
	}
	
	@Inject
	public HomeController(Result result) {
		this.result = result;	
	}
	
	@Path("/home")
	public void index(){
		result.include("mensagem", "HELLO WORlD!");		
	}

	
	
}
