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
public class Nilai {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_nilai;
	private int nilai;
	
}