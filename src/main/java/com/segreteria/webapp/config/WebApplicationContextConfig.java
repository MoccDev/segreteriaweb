package com.segreteria.webapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration //indica che questa è una classe di configurazione
@EnableWebMvc //abilita le funzionalità dello spring mvc
@ComponentScan(basePackages = "com.segreteria.webapp") //indica che le richieste saranno gestite nel package com.segreteria.webapp
public class WebApplicationContextConfig implements WebMvcConfigurer
{
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer)
	{
		configurer.enable();
	}
	
	@Bean
	public InternalResourceViewResolver getInternalResourceViewResolver() //questo metodo crea il bean che configura il view resolver
	{
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		
		resolver.setPrefix("/WEB-INF/view/");
		resolver.setSuffix(".jsp");
		//stiamo dicendo al view resolver di cercare le pagine jsp nella cartella /WEB-INF/view/ (all'interno di src/main/webapp) e di aggiungere il suffisso .jsp

		return resolver;
	}
}
