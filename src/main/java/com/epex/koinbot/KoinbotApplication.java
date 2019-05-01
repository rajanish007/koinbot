package com.epex.koinbot;

import com.epex.koinbot.domain.Domain;
import com.epex.koinbot.repository.DomainRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KoinbotApplication {

	public static void main(String[] args) {
		SpringApplication.run(KoinbotApplication.class, args);
	}

	@Bean
	CommandLineRunner init(DomainRepository domainRepository) {

		return args -> {

		   // domainRepository.save(new Domain("mkyong.com", true));
//			Domain obj = domainRepository.findById(7L).get();
//			System.out.println(obj);

			Domain obj2 = domainRepository.findFirstByDomain("mkyong.com");
			System.out.println(obj2);

			long n = domainRepository.updateDomain("mkyong.com", false);
			System.out.println("Number of records updated : " + n);

		};

	}

}
