package com.project.springproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //TODO анатиция говорит, что этот класс является основным
// Сканирует весь проект на наличие определенных анатаций
// после чего дабавляет отсканировнные классы в контекст
public class SpringStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStudentApplication.class, args);
	}

}
