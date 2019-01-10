package br.com.santander.vinicius.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.santander.vinicius.domain.Gasto;
import br.com.santander.vinicius.repositories.GastoRepository;

@Service
public class GastoImpl implements GastoService{

	@Autowired
	private GastoRepository gastoRepository;
	
	@Override
	public Gasto saveOrUpdate(Gasto gasto) {
		gastoRepository.save(gasto);
		return gasto;
	}
	
	
	
	
}
