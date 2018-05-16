package com.myproj.other;

import org.springframework.stereotype.Component;

@Component
public class AnnotationBased {

	public void print() {
		System.out.println("This method is called throguh annotation based configuration....");
	}
}
