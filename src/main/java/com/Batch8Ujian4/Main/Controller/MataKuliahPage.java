package com.Batch8Ujian4.Main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Batch8Ujian4.Main.Entity.MataKuliah;
import com.Batch8Ujian4.Main.Services.ModelMataKuliah;

@Controller
public class MataKuliahPage {

	@Autowired
	ModelMataKuliah modelMataKuliah;
	
	@GetMapping("/matakuliah/view")
	public String viewIndexMataKuliah (Model model) {
		
		model.addAttribute("listMataKuliah", modelMataKuliah.getAllMataKuliah());
		model.addAttribute("active",3);
		
		return "view_matakuliah";
		
	}
	
	@GetMapping("/matakuliah/add")
	public String viewAddMataKuliah(Model model) {
		
		model.addAttribute("matakuliah", new MataKuliah());
		
		return "add_matakuliah";
		
	}

	@PostMapping("/matakuliah/view")
	public String addMataKuliah(@ModelAttribute MataKuliah matakuliah, Model model) {
		
		this.modelMataKuliah.addMataKuliah(matakuliah);
		model.addAttribute("listMataKuliah", modelMataKuliah.getAllMataKuliah());
		
		return "redirect:/matakuliah/view";
		
	}
	
	@GetMapping("/matakuliah/update/{id}")
	public String viewUpdateMataKuliah(@PathVariable String id, Model model) {
		
		MataKuliah matakuliah = modelMataKuliah.getMataKuliahById(id);
		model.addAttribute("matakuliah", matakuliah);
		
		return "add_matakuliah";
		
	}
	
	@GetMapping("/matakuliah/delete/{id}")
	public String deleteMataKuliah(@PathVariable String id, Model model) {
		
		this.modelMataKuliah.deleteMataKuliah(id);
		model.addAttribute("listMataKuliah", modelMataKuliah.getAllMataKuliah());
		
		return "redirect:/matakuliah/view";
		
	}
	
}
