package com.selflearn.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SelfLearnController {

	@RequestMapping("/getName")
	public String getName() {
		return "SelfLearnName";
	}
}
