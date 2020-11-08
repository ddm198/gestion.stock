package com.gestion.stock.gestion.stock;

import com.gestion.stock.gestion.stock.jpa.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class Application implements CommandLineRunner {

	@Autowired
	private ArticleRepository articleRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		articleRepository.findAll();
//		articleRepository.save(2L,"designation","codeArticle","photo");
		articleRepository.findAll().forEach(c-> {
			System.out.print(c.getIdArticle());
		});



	}
}
