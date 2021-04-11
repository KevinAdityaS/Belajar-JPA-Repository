package com.Batch8Ujian4.Main.Services;

import java.util.List;

import com.Batch8Ujian4.Main.Entity.Pertanyaan;

public interface ModelPertanyaanInterface {

	public List<Pertanyaan> getAllPertanyaan();
	
	public Pertanyaan getPertanyaanByPertanyaannya(String pertanyaan);
	
	public Pertanyaan addPertanyaan(Pertanyaan pertanyaan);
	
	public Pertanyaan getPertanyaanById(String id);
	
	public void deletePertanyaan(String id);
	
}
