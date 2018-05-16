package com.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myproj")
//@Component("resourceRest")
public class ResourceRestImpl implements ResourceRest{

	@Override
	@RequestMapping(value = "/getMessage", method=RequestMethod.GET)
	public void showMessage() {
		System.out.println("Message has been returned....");
	}

}
