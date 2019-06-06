package br.com.etechoracio.feriadosapi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.etechoracio.feriadosapi.model.MeuFeriado;

@RestController
@RequestMapping("/MeuFeriados")
public class MeuFeriadoController {
	
	@Autowired
	private MeuFeriadoDao dao;

	@GetMapping /* GET -> "pegar" recurso */
	public List<MeuFeriado> listar() {

		return dao.findAll();

	}

	@GetMapping("/{id}") /* Todos os void seram getMapping */
	public ResponseEntity<MeuFeriado> buscar(@PathVariable Long id) {

		Optional<MeuFeriado> resultado = dao.findById(id);
		if (resultado.isPresent()) {
			return ResponseEntity.ok(resultado.get());
		}

		return ResponseEntity.notFound().build();
	}

	@PostMapping /* Post -> incluir resurso */
	public void inserir(@RequestBody MeuFeriado m) {
		dao.save(m);

	}

	

}
