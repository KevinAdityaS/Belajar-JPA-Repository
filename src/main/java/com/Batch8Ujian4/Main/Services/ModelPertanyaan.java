package com.Batch8Ujian4.Main.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Batch8Ujian4.Main.Entity.Pertanyaan;
import com.Batch8Ujian4.Main.Repository.PertanyaanRepository;

@Service
public class ModelPertanyaan implements ModelPertanyaanInterface{

	@Autowired
	PertanyaanRepository pertanyaanRepository;

	@Override
	public List<Pertanyaan> getAllPertanyaan() {
		
		return (List<Pertanyaan>) this.pertanyaanRepository.findAll();
		
	}

	@Override
	public Pertanyaan getPertanyaanByPertanyaannya(String pertanyaan) {
		
		return this.pertanyaanRepository.findByPertanyaannya(pertanyaan);
		
	}
	
	@Override
	public Pertanyaan addPertanyaan(Pertanyaan pertanyaan) {
		
		return this.pertanyaanRepository.save(pertanyaan);
		
	}

	@Override
	public Pertanyaan getPertanyaanById(String id) {
		
		return this.pertanyaanRepository.findByIdPertanyaan(Long.parseLong(id));
		
	}

	@Override
	public void deletePertanyaan(String id) {
		
		this.pertanyaanRepository.deleteById(Long.parseLong(id));
		
	}
	
}
