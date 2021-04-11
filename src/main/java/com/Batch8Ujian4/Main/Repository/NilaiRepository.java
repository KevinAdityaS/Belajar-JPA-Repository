package com.Batch8Ujian4.Main.Repository;

import org.springframework.data.repository.CrudRepository;

import com.Batch8Ujian4.Main.Entity.Nilai;

public interface NilaiRepository extends CrudRepository<Nilai, Long>{

	public Nilai findByIdNilai(Long id);
	
}
