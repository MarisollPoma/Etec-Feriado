package br.com.etechoracio.feriadosapi.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.etechoracio.feriados.enums.TipoFeriadoEnum;

@Entity
@Table(name="TBL_FERIADO")
public class MeuFeriado {
	
	
	
	@Id
	@GeneratedValue
	@Column(name="ID_FERIADO")
	private Long id ;
	
	
	@Enumerated(EnumType.STRING)
	@Column(name="TIPO_FERIADO")
	private TipoFeriadoEnum tipoFeriado;
	
	@Column(name="DS_FERIADO")
	private String dsFeriado;
	
	
	@Column(name="DT_FERIADO ")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtFeriado;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public TipoFeriadoEnum getTipoFeriado() {
		return tipoFeriado;
	}


	public void setTipoFeriado(TipoFeriadoEnum tipoFeriado) {
		this.tipoFeriado = tipoFeriado;
	}


	public String getDsFeriado() {
		return dsFeriado;
	}


	public void setDsFeriado(String dsFeriado) {
		this.dsFeriado = dsFeriado;
	}


	public Date getDtFeriado() {
		return dtFeriado;
	}


	public void setDtFeriado(Date dtFeriado) {
		this.dtFeriado = dtFeriado;
	}
	

}
