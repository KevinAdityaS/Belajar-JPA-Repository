package com.Batch8Ujian4.Main.Repository;

import org.springframework.data.repository.CrudRepository;

import com.Batch8Ujian4.Main.Entity.Soal;

public interface SoalRepository extends CrudRepository<Soal, Long>{

	public Soal findByNamaSoal(String nama);
	public Soal findByIdSoal(Long id);
	
}
