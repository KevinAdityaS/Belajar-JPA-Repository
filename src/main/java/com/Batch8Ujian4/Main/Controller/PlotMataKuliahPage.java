package com.Batch8Ujian4.Main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Batch8Ujian4.Main.Entity.Dosen;
import com.Batch8Ujian4.Main.Entity.Mahasiswa;
import com.Batch8Ujian4.Main.Entity.MataKuliah;
import com.Batch8Ujian4.Main.Entity.PlotMataKuliah;
import com.Batch8Ujian4.Main.Entity.Soal;
import com.Batch8Ujian4.Main.Services.ModelDosen;
import com.Batch8Ujian4.Main.Services.ModelMahasiswa;
import com.Batch8Ujian4.Main.Services.ModelMataKuliah;
import com.Batch8Ujian4.Main.Services.ModelPertanyaan;
import com.Batch8Ujian4.Main.Services.ModelPlotMataKuliah;
import com.Batch8Ujian4.Main.Services.ModelSoal;

@Controller
public class PlotMataKuliahPage {

	@Autowired
	ModelPlotMataKuliah modelPlotMataKuliah;
	
	@Autowired
	ModelMahasiswa modelMahasiswa;
	
	@Autowired
	ModelDosen modelDosen;
	
	@Autowired
	ModelMataKuliah modelMataKuliah;
	
	@Autowired
	ModelSoal modelSoal;
	
	@Autowired
	ModelPertanyaan modelPertanyaan;
	
	@GetMapping("/plotmatakuliah/view")
	public String viewIndexPlotMataKuliah(Model model) {
		
		model.addAttribute("listPlotMataKuliah", modelPlotMataKuliah.getAllPlotMataKuliah());
		model.addAttribute("listMahasiswa", modelMahasiswa.getAllMahasiswa());
		model.addAttribute("listDosen", modelDosen.getAllDosen());
		model.addAttribute("listMataKuliah", modelMataKuliah.getAllMataKuliah());
		model.addAttribute("listSoal", modelSoal.getAllSoal());
		model.addAttribute("active", 6);
		
		return "view_plotmatakuliah";
		
	}
	
	@GetMapping("/plotmatakuliah/add")
	public String viewAddPlotMataKuliah(Model model) {
		
		// buat penampung data Soal di halaman htmlnya
		model.addAttribute("plotmatakuliah",new PlotMataKuliah());
		model.addAttribute("listMahasiswa", modelMahasiswa.getAllMahasiswa());
		model.addAttribute("listDosen", modelDosen.getAllDosen());
		model.addAttribute("listMataKuliah", modelMataKuliah.getAllMataKuliah());
		model.addAttribute("listSoal", modelSoal.getAllSoal());
		
		return "add_plotmatakuliah";
		
	}
	
	@PostMapping("/plotmatakuliah/view")
	  public String addPlotMataKuliah(@ModelAttribute PlotMataKuliah plotMataKuliah, Model model) {
		
		this.modelPlotMataKuliah.addPlotMataKuliah(plotMataKuliah);
		model.addAttribute("listPlotMataKuliah", modelPlotMataKuliah.getAllPlotMataKuliah());
		model.addAttribute("listMahasiswa", modelMahasiswa.getAllMahasiswa());
		model.addAttribute("listDosen", modelDosen.getAllDosen());
		model.addAttribute("listMataKuliah", modelMataKuliah.getAllMataKuliah());
		model.addAttribute("listSoal", modelSoal.getAllSoal());
		
		return "redirect:/plotmatakuliah/view";
		
	}
	
	
	@GetMapping("/plotmatakuliah/update/{id}")
	public String viewUpdatePlotMataKuliah(@PathVariable String id, Model model) {
		
		PlotMataKuliah plotMataKuliah = modelPlotMataKuliah.getPlotMataKuliahById(id);
		model.addAttribute("plotMataKuliah", plotMataKuliah);
		
		Mahasiswa mahasiswa = modelMahasiswa.getMahasiswaById(id);
		model.addAttribute("mahasiswa", mahasiswa);
		
		Dosen dosen = modelDosen.getDosenById(id);
		model.addAttribute("dosen", dosen);
		
		MataKuliah mataKuliah = modelMataKuliah.getMataKuliahById(id);
		model.addAttribute("mataKuliah", mataKuliah);
		
		Soal soal = modelSoal.getSoalById(id);
		model.addAttribute("soal", soal);
		
		return "add_plotmatakuliah";
		
	}
	
	@GetMapping("/plotmatakuliah/delete/{id}")
	public String deletePlotMataKuliah(@PathVariable String id, Model model) {
		
		this.modelPlotMataKuliah.deletePlotMataKuliah(id);
		model.addAttribute("listPlotMataKuliah", modelPlotMataKuliah.getAllPlotMataKuliah());
		
		return "redirect:/plotmatakuliah/view";
		
	}
	
	@GetMapping("/plotmatakuliah/ujian")
	public String viewIndexUjian(Model model) {
		
		model.addAttribute("listPertanyaan", modelPertanyaan.getAllPertanyaan());
		
		return "view_ujian";
		
	}
	
}
