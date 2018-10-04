package com.rest.template.controllers;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.core.annotation.AliasFor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Retention(RetentionPolicy.RUNTIME)
@RestController
@RequestMapping("/api")
@CrossOrigin()
public @interface ApiController {
	
	@AliasFor(annotation = RequestMapping.class, attribute = "path")
    String[] value() default {};
    
}
