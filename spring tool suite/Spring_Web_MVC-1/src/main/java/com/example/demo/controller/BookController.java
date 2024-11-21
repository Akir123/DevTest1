package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.BookRepository;
import com.example.demo.entity.Book;


@Controller
public class BookController {

@Autowired
private BookRepository repo;
	
@GetMapping("/book")
public String getBookById(@RequestParam("id") Integer id, Model model) {
	
	
	Optional<Book>findById = repo.findById(id);
	
	if(findById.isPresent()) {
	Book booksObj = findById.get();
	model.addAttribute("book",booksObj);
	}
	
	
	return "index";
}

}
