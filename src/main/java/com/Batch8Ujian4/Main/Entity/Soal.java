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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "soal")
public class Soal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idSoal;
	private String namaSoal;
	private int status;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "idSoal", referencedColumnName = "idSoal")
	private List<Pertanyaan> listPertanyaan = new ArrayList<Pertanyaan>();
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idNilai")
	private Nilai nilai;
	
}
