package com.nttdata.bootcamp.Taller5.controller;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class PersonController {
	@Autowired
	PersonService personService;
	
	@GetMapping("/person-list-1")
	public Flux<Person> personList1(){
		Person p1 = new Person("Andrea","Guillen",24);
		Flux<Person> flux1 = Flux.just(p1).delayElements(Duration.ofSeconds(2));
		return flux1;
		
	}
	
	@GetMapping("/person-list-2")
	public Flux<Person> personList2(){
		Person p2 = new Person("Juan","Alcaide",25);
		Flux<Person> flux2 = Flux.just(p2).delayElements(Duration.ofSeconds(4));
		return flux2;
	}
	
	@GetMapping("/person-list-3")
	public Flux<Person> personList3(){
		Person p3 = new Person("Paco","Rodriguez",40);
		Flux<Person> flux3 = Flux.just(p3).delayElements(Duration.ofSeconds(6));
		return flux3;
	}

	@GetMapping("/person-list-4")
	public Flux<Person> personList4(){
		Person p4 = new Person("Mari","Castro",55);
		Flux<Person> flux4 = Flux.just(p4).delayElements(Duration.ofSeconds(8));
		return flux4;
	}

}
