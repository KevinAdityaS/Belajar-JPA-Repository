package com.Batch8Ujian4.Main.Services;

import java.util.List;

import com.Batch8Ujian4.Main.Entity.Mahasiswa;

public interface ModelMahasiswaInterface {

	public List<Mahasiswa> getAllMahasiswa();
	
	public Mahasiswa getMahasiswaByName(String name);
	
	public Mahasiswa addMahasiswa(Mahasiswa mahasiswa);
	
	public Mahasiswa getMahasiswaById(String id);
	
	public void deleteMahasiswa(String id);
	
}
