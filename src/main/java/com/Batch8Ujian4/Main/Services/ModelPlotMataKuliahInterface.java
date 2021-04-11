package com.Batch8Ujian4.Main.Services;

import java.util.List;

import com.Batch8Ujian4.Main.Entity.PlotMataKuliah;

public interface ModelPlotMataKuliahInterface {

	public List<PlotMataKuliah> getAllPlotMataKuliah();
	
	public PlotMataKuliah addPlotMataKuliah(PlotMataKuliah plotmatakuliah);
	
	public PlotMataKuliah getPlotMataKuliahById(String id);
	
	public void deletePlotMataKuliah(String id);
	
}
