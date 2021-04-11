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
@Table(name = "mata_kuliah")
public class MataKuliah {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idMataKuliah;
	private String namaMataKuliah;
	
}
