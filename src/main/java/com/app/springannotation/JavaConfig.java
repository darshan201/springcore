package com.app.springannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages =  "com.app.springannotation")
public class JavaConfig {

	@Bean(name = "student")
	public Student getstudent() {
		Student ss = new Student();
		return ss;
	}

	@Bean
	public Book book() {
		Book book = new Book();

		return book;

	}

}
