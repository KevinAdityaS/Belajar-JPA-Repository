package com.Batch8Ujian4.Main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Batch8Ujian4.Main.Entity.Soal;
import com.Batch8Ujian4.Main.Services.ModelPertanyaan;
import com.Batch8Ujian4.Main.Services.ModelSoal;

@Controller
public class SoalPage {

	@Autowired
	ModelSoal modelSoal;
	
	@Autowired
	ModelPertanyaan modelPertanyaan;
	
	@GetMapping("/soal/view")
	public String viewIndexSoal(Model model) {
		
		model.addAttribute("listSoal",modelSoal.getAllSoal());
		model.addAttribute("active",5);
		
		return "view_soal";
		
	}
	
	@GetMapping("/soal/add")
	public String viewAddSoal(Model model) {
		
		// buat penampung data Soal di halaman htmlnya
		model.addAttribute("soal",new Soal());
		model.addAttribute("listPertanyaan", modelPertanyaan.getAllPertanyaan());
		
		return "add_soal";
		
	}
	
	@PostMapping("/soal/view")
	  public String addSoal(@ModelAttribute Soal Soal, Model model) {
		
		this.modelSoal.addSoal(Soal);
		model.addAttribute("listSoal",modelSoal.getAllSoal());
		
		return "redirect:/soal/view";
		
	}
	
	
	@GetMapping("/soal/update/{id}")
	public String viewUpdateSoal(@PathVariable String id, Model model) {
		
		Soal Soal = modelSoal.getSoalById(id);
		model.addAttribute("soal",Soal);
		
		return "add_soal";
		
	}
	
	@GetMapping("/soal/delete/{id}")
	public String deleteSoal(@PathVariable String id, Model model) {
		
		this.modelSoal.deleteSoal(id);
		model.addAttribute("listSoal",modelSoal.getAllSoal());
		
		return "redirect:/soal/view";
		
	}
	
}
