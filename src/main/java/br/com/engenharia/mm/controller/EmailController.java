package br.com.engenharia.mm.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.engenharia.mm.dto.EmailDTO;
import br.com.engenharia.mm.utils.GeradorEmail;

@RestController
public class EmailController {
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/sendmail")
	public boolean enviaEmail(@RequestBody EmailDTO email) {
		return GeradorEmail.enviarEmail(email);
	}
}