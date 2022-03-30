package br.edu.insper.desagil.backend.endpoint;

import br.edu.insper.desagil.backend.core.Aluno;
import br.edu.insper.desagil.backend.dao.AlunoDAO;
import br.pro.hashi.nfp.rest.server.Args;
import br.pro.hashi.nfp.rest.server.Endpoint;

public class AlunoEndpoint extends Endpoint<Aluno> {
	private AlunoDAO dao;

	public AlunoEndpoint() {
		super("/aluno");
		dao = new AlunoDAO();
	}

	@Override
	public Aluno get(Args args) {
		int id = args.getInt("id");
		Aluno aluno = dao.retrieve(id);
		return aluno;
	}

	@Override
	public Object post(Args args, Aluno aluno) {
		String key = dao.create(aluno);
		return key;
	}

	@Override
	public Object put(Args args, Aluno aluno) {
		dao.update(aluno);
		return "aluno atualizado";
	}

	@Override
	public Object delete(Args args) {
		int id = args.getInt("id");
		dao.delete(id);
		return "aluno apagado";
	}
}
