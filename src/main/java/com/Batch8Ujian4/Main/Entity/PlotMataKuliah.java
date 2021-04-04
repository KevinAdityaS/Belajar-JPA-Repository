package com.Batch8Ujian4.Main.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "plot_mata_kuliah")
public class PlotMataKuliah {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_plot_mata_kuliah;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_plot_mata_kuliah", referencedColumnName = "id_plot_mata_kuliah")
	private List<Soal> listSoal = new ArrayList<Soal>();
	
}
