package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidades")
public class habilidadesController {
	
	@GetMapping
	public String habilidade() {
		
		return "Para essa atividade a atenção aos detalhes e a adaptabilidade foram muito importantes, além de usar muito da persistência.";
		
	}
	

}
