package com.Batch8Ujian4.Main.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Batch8Ujian4.Main.Entity.MataKuliah;
import com.Batch8Ujian4.Main.Repository.MataKuliahRepository;

@Service
public class ModelMataKuliah implements ModelMataKuliahInterface{

	@Autowired
	MataKuliahRepository mataKuliahRepository;

	@Override
	public List<MataKuliah> getAllMataKuliah() {
		
		return (List<MataKuliah>) this.mataKuliahRepository.findAll();
		
	}

	@Override
	public MataKuliah getMataKuliahByName(String name) {
		
		return this.mataKuliahRepository.findByNamaMataKuliah(name);
		
	}

	@Override
	public MataKuliah addMataKuliah(MataKuliah matakuliah) {
		
		return this.mataKuliahRepository.save(matakuliah);
		
	}

	@Override
	public MataKuliah getMataKuliahById(String id) {
		
		return this.mataKuliahRepository.findByIdMataKuliah(Long.parseLong(id));
		
	}

	@Override
	public void deleteMataKuliah(String id) {
		
		this.mataKuliahRepository.deleteById(Long.parseLong(id));
		
	}
	
}
