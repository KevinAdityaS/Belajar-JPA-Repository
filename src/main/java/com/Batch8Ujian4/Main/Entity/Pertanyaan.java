package com.Batch8Ujian4.Main.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pertanyaan")
public class Pertanyaan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPertanyaan;
	private String pertanyaannya;
	private String jawaban1;
	private String jawaban2;
	private String jawaban3;
	private String jawaban4;
	private int jawabanBenar;
	private String statusGambar;
	
}
