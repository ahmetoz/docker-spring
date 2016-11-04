package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DockerSpringApplication implements CommandLineRunner {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	PersonRepository personRepository;


	public static void main(String[] args) {
		SpringApplication.run(DockerSpringApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

		System.out.println("Mongodb works..:");
		System.out.println("-------------------------------");
		customerRepository.deleteAll();

		// save a couple of customers
		customerRepository.save(new Customer("Alice", "Smith"));
		customerRepository.save(new Customer("Bob", "Smith"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : customerRepository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(customerRepository.findByFirstName("Alice"));

		System.out.println("Customers found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		for (Customer customer : customerRepository.findByLastName("Smith")) {
			System.out.println(customer);
		}

		System.out.println("Postgres works..:");
		System.out.println("-------------------------------");

		personRepository.save(new Person(new Date(), "Ahmet Oz", "3493409324", "bilmuhahmet@gmail.com" ));

		for (Person p : personRepository.findAll()){
			System.out.println(p);
		}
	}
}
