package br.etec.sebrae.portal.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.etec.sebrae.portal.dtos.SolicitacoesDto;

@Controller
@RequestMapping("/solicitacoes")
public class SolicitacoesController {
	
	@RequestMapping("/consultar")
	public ModelAndView consultarSolicitacoes () {
		
		ModelAndView view = new ModelAndView("documentos/solicitacoes");
		List<SolicitacoesDto> solicitacoes = new ArrayList<SolicitacoesDto>();
		/*
		 * estamos mockando a List, mas esses valores devem vir do BD via Response
		 */
		SolicitacoesDto s1 = new SolicitacoesDto();
		s1.setNomeAluno("Chico");
		s1.setStatus(true);
		s1.setTipoDocumento("Declaracao");
		s1.setDataSolicitacao(new Date());
		
		SolicitacoesDto s2 = new SolicitacoesDto();
		s2.setNomeAluno("Artur");
		s2.setStatus(true);
		s2.setTipoDocumento("Xpto");
		s2.setDataSolicitacao(new Date());
		
		solicitacoes.add(s1);
		solicitacoes.add(s2);
		// Fim do mock
		
		view.addObject("solicitacoes", solicitacoes); 	// Colocando a List dentro da View
		
		return view;
	} 

}
