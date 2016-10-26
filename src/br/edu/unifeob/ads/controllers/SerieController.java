package br.edu.unifeob.ads.controllers;

import javax.inject.Inject;
import br.edu.unifeob.ads.dao.SerieDAO;
import br.edu.unifeob.ads.models.Serie;

public class SerieController {
	
	@Inject
	private SerieDAO serieDao;
	
	public void salvar(Serie serie) {
		serieDao.salvar(serie);
    }

}
