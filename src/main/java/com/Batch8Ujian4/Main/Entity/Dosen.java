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
@Table(name = "dosen")
public class Dosen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_dosen;
	private String username;
	private String password;
	private String nama_dosen;

	
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name = "plot_mata_kuliah",
	joinColumns = {
			@JoinColumn(name = "id_dosen", referencedColumnName = "id_dosen", nullable = false, updatable = false)},
	inverseJoinColumns = {
			@JoinColumn(name = "nim", referencedColumnName = "nim", nullable = false, updatable = false)})
	private List<Mahasiswa> listMahasiswa = new ArrayList<Mahasiswa>();
	
	@ManyToMany(mappedBy = "listDosen", fetch = FetchType.LAZY)
	private List<MataKuliah> listMataKuliah = new ArrayList<MataKuliah>();
	
}
