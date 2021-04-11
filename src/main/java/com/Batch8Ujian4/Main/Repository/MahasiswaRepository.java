package com.Batch8Ujian4.Main.Repository;

import org.springframework.data.repository.CrudRepository;

import com.Batch8Ujian4.Main.Entity.Mahasiswa;

public interface MahasiswaRepository extends CrudRepository<Mahasiswa, Long>{

	public Mahasiswa findByNamaMahasiswa(String nama);
	public Mahasiswa findByIdMahasiswa(Long id);
	
}
