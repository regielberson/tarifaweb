package br.com.tarweb.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.tarweb.dto.RequisicaoCadastroEquipamento;
import br.com.tarweb.model.Equipamento;
import br.com.tarweb.repository.EquipamentoRepository;
import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	private EquipamentoRepository repository;

	@GetMapping("inicio")
	public String Hello(HttpServletRequest request) {

		request.setAttribute("nome", "Jdesusds");
		return "inicio";
	}

	@GetMapping("/inicio/cadastro")
	public String cadastro() {
		return "cadastro";
	}
	
    @GetMapping("/inicio/listar")
    public String listar(Model model) {
    	
    	List<Equipamento> equipamentos = repository.findAll();
    	model.addAttribute("equipamentos", equipamentos);
    	
    	return "listar";
    	
    }

	@PostMapping("/inicio/cadastrar")
	public String cadastrar(RequisicaoCadastroEquipamento requisicao) {

		Equipamento equipamento = requisicao.toEquipamento();

		repository.save(equipamento);
		return "redirect:/inicio";

	}

}
