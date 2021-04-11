package com.Batch8Ujian4.Main.Services;

import java.util.List;

import com.Batch8Ujian4.Main.Entity.Dosen;

public interface ModelDosenInterface {

	public List<Dosen> getAllDosen();
	
	public Dosen getDosenByName(String name);
	
	public Dosen addDosen(Dosen dosen);
	
	public Dosen getDosenById(String id);
	
	public void deleteDosen(String id);
	
}
