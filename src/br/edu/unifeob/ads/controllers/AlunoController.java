package br.edu.unifeob.ads.controllers;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;

@Controller
public class AlunoController {


		private Result result;
		private AlunoController alunoController;

		public AlunoController(){		
		}
		
		@Inject
		public AlunoController(Result result, AlunoController alunoController) {		
			this.result = result;
			this.alunoController = alunoController;
		}

}
