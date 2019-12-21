package com.segreteria.webapp.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{
	//Questa classe configura il dispatcherservlet

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() //questo metodo indica la classe di configurazione generale (in questo caso WebApplicationContextConfig)
	{
		return new Class[] {WebApplicationContextConfig.class};
	}

	@Override
	protected String[] getServletMappings() 
	{
		return new String[] {"/"}; //indica che qualsiasi chiamata sarà gestita dal dispatcher servlet.
		//Possiamo anche far gestire solo una parte del sito dal dispatcher servlet, basta mettere il path
	}

}
