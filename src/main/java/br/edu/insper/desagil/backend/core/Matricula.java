package br.edu.insper.desagil.backend.core;

import br.pro.hashi.nfp.dao.Autokey;

public class Matricula {
	@Autokey
	private String key;
	private Aluno aluno;
	private boolean trancada;

	public Matricula(Aluno aluno) {
		this.aluno = aluno;
		this.trancada = false;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public boolean isTrancada() {
		return trancada;
	}

	public void setTrancada(boolean trancada) {
		this.trancada = trancada;
	}
}
