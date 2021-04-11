package com.Batch8Ujian4.Main.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Batch8Ujian4.Main.Entity.Dosen;
import com.Batch8Ujian4.Main.Repository.DosenRepository;

@Service
public class ModelDosen implements ModelDosenInterface{

	@Autowired
	DosenRepository dosenRepository;
	
	@Override
	public List<Dosen> getAllDosen(){
		
		return(List<Dosen>) this.dosenRepository.findAll();
		
	}
	
	@Override
	public Dosen getDosenByName(String nama) {
		
		return this.dosenRepository.findByNamaDosen(nama);
		
	}
	
	@Override
	public Dosen addDosen(Dosen dosen) {
		
		return this.dosenRepository.save(dosen);
		
	}
	
	@Override
	public Dosen getDosenById(String id) {
		
		return ((Dosen)this.dosenRepository.findByIdDosen(Long.parseLong(id)));
		
	}
	
	@Override
	public void deleteDosen(String id) {
		
		this.dosenRepository.deleteById(Long.parseLong(id));
		
	}
	
}
