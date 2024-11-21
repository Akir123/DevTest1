package in.ashokit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ashokit.entity.PG;
import in.ashokit.repo.PgRepository;


@Controller
public class PgController {
	@Autowired
	private PgRepository repo;
	@GetMapping("/delete")
	public String delete(@RequestParam("cid") Integer cid, Model model) {
		repo.deleteById(cid);
		model.addAttribute("msg", "Customer Deleted");
		model.addAttribute("pgs", repo.findAll());
		return "data";
	}
	@GetMapping("/edit")
	public String edit(@RequestParam("cid") Integer cid, Model model) {
		Optional<PG> findById = repo.findById(cid);
		if(findById.isPresent()) {
			PG pg = findById.get();
			model.addAttribute("msg", "Product Edited");
			model.addAttribute("pg", pg);
			
		}
		return "index";
	}
	@GetMapping("/pgs")
	public String getAllProducts(Model model) {
		List<PG> list = repo.findAll();
		model.addAttribute("pgs", list);
		return "data";
	}
	@PostMapping("/pg")
	public String saveProduct(@Validated @ModelAttribute("pg") PG c, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "index";
		}
		
		c = repo.save(c);
		if(c.getCid() != null) {
			model.addAttribute("msg","Customer Saved");
		}
		return "index";
	}
	
	@GetMapping("/")
public String loadForm(Model model) {
	model.addAttribute("pg", new PG());
	return "index";
}
	
}

