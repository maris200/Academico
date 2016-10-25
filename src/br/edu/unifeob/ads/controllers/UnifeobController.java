package br.edu.unifeob.ads.controllers;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

@Controller
public class UnifeobController {

	private Result result;

	public UnifeobController() {

	}

	@Inject
	public UnifeobController(Result result) {
		this.result = result;
	}

	@Path("/unifeob")
	public void index() {
		result.include("unifeob", "Bem Vindo à Unifebo!");
	}
}
