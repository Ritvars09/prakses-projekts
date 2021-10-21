package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping(path = "api/v1/student")
	
	@Controller
public class studentcontroller {
		@Autowired
		studentservice service;

		@GetMapping("/save")
		public student save() {
			return service.save();
		}

		@GetMapping("/get")
		public student getKlienti() {
			return service.getKlienti();
		}


		

	
}
