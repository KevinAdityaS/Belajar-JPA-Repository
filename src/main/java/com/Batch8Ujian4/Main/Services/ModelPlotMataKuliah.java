package com.Batch8Ujian4.Main.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Batch8Ujian4.Main.Entity.PlotMataKuliah;
import com.Batch8Ujian4.Main.Repository.PlotMataKuliahRepository;

@Service
public class ModelPlotMataKuliah implements ModelPlotMataKuliahInterface{

	@Autowired
	PlotMataKuliahRepository plotMataKuliahRepository;
	
	@Override
	public List<PlotMataKuliah> getAllPlotMataKuliah() {

		return (List<PlotMataKuliah>) this.plotMataKuliahRepository.findAll();
		
	}

	@Override
	public PlotMataKuliah addPlotMataKuliah(PlotMataKuliah plotmatakuliah) {

		return this.plotMataKuliahRepository.save(plotmatakuliah);
		
	}

	@Override
	public PlotMataKuliah getPlotMataKuliahById(String id) {

		return (PlotMataKuliah)this.plotMataKuliahRepository.findById(Long.parseLong(id)).get();
		
	}

	@Override
	public void deletePlotMataKuliah(String id) {

		this.plotMataKuliahRepository.deleteById(Long.parseLong(id));
		
	}

}
