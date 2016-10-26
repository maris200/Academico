package br.edu.unifeob.ads.controllers;


import br.edu.unifeob.ads.models.Curso;
import br.edu.unifeob.ads.models.Modulo;


public class Programa {

	public static void main(String[] args) {
		
		Modulo modulo = new Modulo ();
		modulo.setNome("LTP");
		
		Curso curso = new Curso ();
		curso.setNome("ADS");
		curso.getModulos().add(modulo);
		
		

	}

}
