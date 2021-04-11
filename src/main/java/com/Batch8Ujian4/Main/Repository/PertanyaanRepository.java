package com.Batch8Ujian4.Main.Repository;

import org.springframework.data.repository.CrudRepository;

import com.Batch8Ujian4.Main.Entity.Pertanyaan;

public interface PertanyaanRepository extends CrudRepository<Pertanyaan, Long>{

	public Pertanyaan findByPertanyaannya(String id);
	public Pertanyaan findByIdPertanyaan(Long id);
	
}
