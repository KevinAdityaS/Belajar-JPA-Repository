package com.Batch8Ujian4.Main.Services;

import java.util.List;

import com.Batch8Ujian4.Main.Entity.MataKuliah;

public interface ModelMataKuliahInterface {

	public List<MataKuliah> getAllMataKuliah();
	
	public MataKuliah getMataKuliahByName(String name);
	
	public MataKuliah addMataKuliah(MataKuliah matakuliah);
	
	public MataKuliah getMataKuliahById(String id);
	
	public void deleteMataKuliah(String id);
	
}
