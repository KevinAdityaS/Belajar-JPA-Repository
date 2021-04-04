package com.Batch8Ujian4.Main.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "mahasiswa")
public class Mahasiswa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long nim;
	private String nama_mahasiswa;
	private String jenis_kelamin;
	private String password;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name = "plot_mata_kuliah",
	joinColumns = {
			@JoinColumn(name = "nim", referencedColumnName = "nim", nullable = false, updatable = false)},
	inverseJoinColumns = {
			@JoinColumn(name = "id_mata_kuliah", referencedColumnName = "id_mata_kuliah", nullable = false, updatable = false)})
	private List<MataKuliah> listMataKuliah = new ArrayList<MataKuliah>();
	
	@ManyToMany(mappedBy = "listMahasiswa", fetch = FetchType.LAZY)
	private List<Dosen> listDosen = new ArrayList<Dosen>();
	
}
