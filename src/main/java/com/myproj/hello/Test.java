package com.myproj.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myproj.other.AnnotationBased;
import com.myproj.other.JavaBased;

public class Test {

	@Autowired
	AnnotationBased annotationBased;

	public static void main(String[] args) {

	/*	System.out.println("************* Xml based bean invocation *************");
		ApplicationContext context = new ClassPathXmlApplicationContext("my-project.xml");
		XmlBased xmlbased = (XmlBased) context.getBean("yash");
		System.out.println(xmlbased.getHello());

		System.out.println("************* Java based bean invocation *************");
		ApplicationContext context2 = new AnnotationConfigApplicationContext(JavaBased.class);
		JavaBased javabased = context2.getBean(JavaBased.class);
		javabased.print();
*/
		System.out.println("************* Anotation based bean invocation *************");
		Test t = new Test();
		t.method();

	}

	public void method() {
		System.out.println(annotationBased);
		annotationBased.print();
	}
}
