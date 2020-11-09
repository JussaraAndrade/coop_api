package br.com.coop.coop_api.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.coop.coop_api.entities.PublicacaoOng;
import br.com.coop.coop_api.services.PublicacaoOngService;
import lombok.RequiredArgsConstructor;

@RestController
@CrossOrigin
@RequestMapping("/api/publicacao")
@RequiredArgsConstructor
public class PublicacaoOngController {
	
	private final PublicacaoOngService publicacaoOngService;
	
	@GetMapping
	public Iterable<PublicacaoOng> getConsultas(){
		return publicacaoOngService.getPublicacaoOng();
	}

	@CrossOrigin
	@PostMapping
	public PublicacaoOng Inserir(@RequestBody PublicacaoOng publicacaoOng) {
		publicacaoOngService.Inserir(publicacaoOng);
		return publicacaoOng;
		
	}

}
