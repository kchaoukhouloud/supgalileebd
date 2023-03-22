package com.supgalilee.dbh2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.supgalilee.dbh2.entities.Adherent;
import com.supgalilee.dbh2.repository.AdherentRepository;

@SpringBootApplication
public class SupgalileebdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupgalileebdApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(AdherentRepository repository){
		return args->{
			repository.save(new Adherent(null,"Adherent1","Paris",29));
			repository.save(new Adherent(null,"Adherent2","Palaiseau",29));
			repository.save(new Adherent(null,"Adherent3","Gif sur Yvette",29));
		};
	}

}
