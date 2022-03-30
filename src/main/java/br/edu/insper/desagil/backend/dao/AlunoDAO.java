package br.edu.insper.desagil.backend.dao;

import br.edu.insper.desagil.backend.core.Aluno;
import br.pro.hashi.nfp.dao.DAO;

public class AlunoDAO extends DAO<Aluno> {
	public AlunoDAO() {
		super("alunos");
	}
}
