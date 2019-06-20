package br.com.etechoracio.feriadosapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etechoracio.feriadosapi.model.MeuFeriado;

public interface MeuFeriadoDAO extends JpaRepository<MeuFeriado, Long>{

	
	
}
