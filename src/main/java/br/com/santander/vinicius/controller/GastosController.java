package br.com.santander.vinicius.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.santander.vinicius.domain.Gasto;
import br.com.santander.vinicius.service.GastoService;

@RestController
@RequestMapping(value = "/gastos")
public class GastosController {

	@Autowired
	private GastoService gastoService;
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Gasto> add(@RequestBody Gasto gasto){
		gastoService.saveOrUpdate(gasto);
		return ResponseEntity.ok().body(gasto);
	}
	
	
}
