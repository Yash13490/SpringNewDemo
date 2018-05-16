package com.myproj.other;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.myproj.other")
public class JavaBasedConfiguration {

	@Bean
	public JavaBased getJavaBasedObject() {
		return new JavaBased();
	}
}
