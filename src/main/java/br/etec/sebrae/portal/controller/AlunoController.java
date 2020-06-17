package br.etec.sebrae.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/aluno")
public class AlunoController {
	
	@RequestMapping("/alterar")
	public String alterarAluno() {
		return "aluno/alterar_aluno";
	}

	@RequestMapping("/cadastrar")
	public String cadastroAluno() {
		return "aluno/cadastrar_aluno";
	}
	
	@RequestMapping("/excluir")
	public String excluirAluno() {
		return "aluno/excluir_aluno";
	}
}
