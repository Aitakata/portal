package br.etec.sebrae.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/evento")
public class EventoController {
	
	@RequestMapping("/alterar")
	public String alterarEvento() {
		return "evento/alterar_evento";
	}

	@RequestMapping("/cadastrar")
	public String cadastroEvento() {
		return "evento/cadastrar_evento";
	}
	
	@RequestMapping("/excluir")
	public String excluirEvento() {
		return "evento/excluir_evento";
	}
}