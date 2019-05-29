package br.com.engenharia.mm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.engenharia.mm.controller"})
public class MmApplication {

	public static void main(String[] args) {
		SpringApplication.run(MmApplication.class, args);
	}

}
