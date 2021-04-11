package com.Batch8Ujian4.Main.Repository;

import org.springframework.data.repository.CrudRepository;

import com.Batch8Ujian4.Main.Entity.Dosen;

public interface DosenRepository extends CrudRepository<Dosen, Long> {

	public Dosen findByNamaDosen(String nama);
	public Dosen findByIdDosen(Long id);
	
}
