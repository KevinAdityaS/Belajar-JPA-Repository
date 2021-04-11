package com.Batch8Ujian4.Main.Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.Batch8Ujian4.Main.Entity.Pertanyaan;
import com.Batch8Ujian4.Main.Services.ModelPertanyaan;
import com.Batch8Ujian4.Main.Utility.FileUtility;

@Controller
public class PertanyaanPage {

	@Autowired
	ModelPertanyaan modelPertanyaan;
	
	@GetMapping("/pertanyaan/view")
	public String viewIndexPertanyaan(Model model) {
		
		model.addAttribute("listPertanyaan", modelPertanyaan.getAllPertanyaan());
		model.addAttribute("active",4);
		
		return "view_pertanyaan";
		
	}
	
	@GetMapping("/pertanyaan/add")
	public String viewAddPertanyaan(Model model) {
		
		model.addAttribute("pertanyaan", new Pertanyaan());
		
		return "add_pertanyaan";
		
	}
	
	@PostMapping("/pertanyaan/view")
	public String addPertanyaan(@RequestParam(value = "file") MultipartFile file, @ModelAttribute Pertanyaan pertanyaan, Model model) throws IOException {
		
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());		
		String uploadDir = "user-photos/";
		FileUtility.saveFile(uploadDir, fileName, file);
		
		pertanyaan.setStatusGambar("/" + uploadDir + fileName);
		this.modelPertanyaan.addPertanyaan(pertanyaan);
		model.addAttribute("listPertanyaan", modelPertanyaan.getAllPertanyaan());
		
		return "redirect:/pertanyaan/view";
		
	}
	
	@GetMapping("/pertanyaan/update/{id}")
	public String viewUpdatePertanyaan(@PathVariable String id, Model model) {
		
		Pertanyaan pertanyaan = modelPertanyaan.getPertanyaanById(id);
		model.addAttribute("pertanyaan", pertanyaan);
		
		return "add_pertanyaan";
		
	}
	
	@GetMapping("/pertanyaan/delete/{id}")
	public String deletePertanyaan(@PathVariable String id, Model model) {
		
		this.modelPertanyaan.deletePertanyaan(id);
		model.addAttribute("listPertanyaan", modelPertanyaan.getAllPertanyaan());
		
		return "redirect:/pertanyaan/view";
		
	}
	
}
