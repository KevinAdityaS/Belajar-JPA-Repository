package com.Batch8Ujian4.Main.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Batch8Ujian4.Main.Entity.Soal;
import com.Batch8Ujian4.Main.Repository.SoalRepository;

@Service
public class ModelSoal implements ModelSoalInterface{

	@Autowired
	SoalRepository soalRepository;
	
	@Override
	public List<Soal> getAllSoal() {
		
		return (List<Soal>) this.soalRepository.findAll();
		
	}

	@Override
	public Soal getSoalByName(String name) {

		return this.soalRepository.findByNamaSoal(name);
		
	}

	@Override
	public Soal addSoal(Soal soal) {

		return this.soalRepository.save(soal);
		
	}

	@Override
	public Soal getSoalById(String id) {

		return (Soal)this.soalRepository.findById(Long.parseLong(id)).get();
		
	}

	@Override
	public void deleteSoal(String id) {

		this.soalRepository.deleteById(Long.parseLong(id));
		
	}

}
