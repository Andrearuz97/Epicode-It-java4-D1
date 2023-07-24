package andrearuzittu.EpicodeItjava4D1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import andrearuzittu.EpicodeItjava4D1.service.MenuService;

@Configuration
public class AppConfig {

	@Bean
	public MenuService menuService() {
		return new MenuService();
	}

	@Bean
	String getSaluto() {
		return "Hi,how are you?!";
	}

	@Bean
	String getRisposta() {
		return "T'appost!";

	}
}