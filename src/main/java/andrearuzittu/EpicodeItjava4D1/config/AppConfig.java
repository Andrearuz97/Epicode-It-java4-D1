package andrearuzittu.EpicodeItjava4D1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import andrearuzittu.EpicodeItjava4D1.service.MenuService;

@Configuration
public class AppConfig {

	// Metodo per creare un bean per il MenuService
	@Bean
	public MenuService menuService() {
		return new MenuService();
	}

	public class GreetingBean {
		@Bean
		String getSaluto() {
			return "Hi,how are you?!";
		}

		@Bean
		String getRisposta() {
			return "T'appost!";
		}
	}
}