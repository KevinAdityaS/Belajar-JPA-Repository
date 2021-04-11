package com.Batch8Ujian4.Main.Services;

import java.util.List;

import com.Batch8Ujian4.Main.Entity.Soal;

public interface ModelSoalInterface {

	public List<Soal> getAllSoal();
	
	public Soal getSoalByName(String name);
	
	public Soal addSoal(Soal soal);
	
	public Soal getSoalById(String id);
	
	public void deleteSoal(String id);
	
}
