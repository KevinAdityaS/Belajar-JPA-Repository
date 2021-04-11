package com.Batch8Ujian4.Main.Repository;

import org.springframework.data.repository.CrudRepository;

import com.Batch8Ujian4.Main.Entity.MataKuliah;

public interface MataKuliahRepository extends CrudRepository<MataKuliah, Long> {

	public MataKuliah findByNamaMataKuliah(String nama);
	public MataKuliah findByIdMataKuliah(Long id);
	
}
