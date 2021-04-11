package com.Batch8Ujian4.Main.Repository;

import org.springframework.data.repository.CrudRepository;

import com.Batch8Ujian4.Main.Entity.PlotMataKuliah;

public interface PlotMataKuliahRepository extends CrudRepository<PlotMataKuliah, Long>{

	public PlotMataKuliah findByIdPlotMataKuliah(Long id);
	
}
