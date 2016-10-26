package br.edu.unifeob.ads.controllers;

import javax.inject.Inject;
import br.edu.unifeob.ads.dao.ModuloDAO;
import br.edu.unifeob.ads.models.Modulo;

public class ModuloController {
	
	@Inject
	private ModuloDAO moduloDao;
	
	public void salvar(Modulo modulo) {
		moduloDao.salvar(modulo);
    }

}
