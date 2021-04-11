package com.Batch8Ujian4.Main.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Batch8Ujian4.Main.Entity.Mahasiswa;
import com.Batch8Ujian4.Main.Repository.MahasiswaRepository;

@Service
public class ModelMahasiswa implements ModelMahasiswaInterface{

	@Autowired
	MahasiswaRepository mahasiswaRepository;
	
	@Override
	public List<Mahasiswa> getAllMahasiswa(){
		
		return(List<Mahasiswa>) this.mahasiswaRepository.findAll();
		
	}
	
	@Override
	public Mahasiswa getMahasiswaByName(String nama) {
		
		return this.mahasiswaRepository.findByNamaMahasiswa(nama);
		
	}
	
	@Override
	public Mahasiswa addMahasiswa(Mahasiswa mahasiswa) {
		
		return this.mahasiswaRepository.save(mahasiswa);
		
	}
	
	@Override
	public Mahasiswa getMahasiswaById(String id) {
		
		return ((Mahasiswa)this.mahasiswaRepository.findByIdMahasiswa(Long.parseLong(id)));
		
	}
	
	@Override
	public void deleteMahasiswa(String id) {
		
		this.mahasiswaRepository.deleteById(Long.parseLong(id));
		
	}
	
}
