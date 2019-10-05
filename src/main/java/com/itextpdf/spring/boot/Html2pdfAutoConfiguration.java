package com.itextpdf.spring.boot;

import org.springframework.beans.BeansException;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.html2pdf.resolver.font.DefaultFontProvider;
import com.itextpdf.layout.font.FontProvider;

@Configuration
@ConditionalOnClass(HtmlConverter.class)
@ConditionalOnProperty(prefix = Html2pdfProperties.PREFIX, value = "enabled", havingValue = "true")
@EnableConfigurationProperties(Html2pdfProperties.class)
public class Html2pdfAutoConfiguration implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	@Bean
	@ConditionalOnMissingBean
	public FontProvider fontProvider() {
		FontProvider fontProvider = new DefaultFontProvider();
		return fontProvider;
	}

	@Bean
	public ConverterProperties converterProperties() {
		ConverterProperties props = new ConverterProperties();
		// props.setCharset("UFT-8"); 编码
		return props;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

}
