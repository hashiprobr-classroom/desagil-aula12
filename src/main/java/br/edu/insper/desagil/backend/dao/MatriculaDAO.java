package br.edu.insper.desagil.backend.dao;

import br.edu.insper.desagil.backend.core.Matricula;
import br.pro.hashi.nfp.dao.DAO;

public class MatriculaDAO extends DAO<Matricula> {
	public MatriculaDAO() {
		super("matriculas");
	}
}
