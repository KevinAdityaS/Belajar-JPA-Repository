package com.Batch8Ujian4.Main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Batch8Ujian4.Main.Entity.Admin;
import com.Batch8Ujian4.Main.Entity.Dosen;
import com.Batch8Ujian4.Main.Entity.Mahasiswa;
import com.Batch8Ujian4.Main.Entity.MataKuliah;
import com.Batch8Ujian4.Main.Entity.Nilai;
import com.Batch8Ujian4.Main.Entity.Pertanyaan;
import com.Batch8Ujian4.Main.Entity.PlotMataKuliah;
import com.Batch8Ujian4.Main.Entity.Soal;
import com.Batch8Ujian4.Main.Repository.AdminRepository;
import com.Batch8Ujian4.Main.Repository.PlotMataKuliahRepository;

@SpringBootApplication
public class Batch8Ujian4Application implements CommandLineRunner {

	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private PlotMataKuliahRepository plotMataKuliahRepository;
	
	public static void main(String[] args) {
		
		SpringApplication.run(Batch8Ujian4Application.class, args);
		
	}
	
	@Override
	public void run(String... args) throws Exception{
		
//		Admin admin = new Admin();
//		admin.setUsername("DewaKipas");
//		admin.setPassword("kebanned");
//		
//		PlotMataKuliah pmk1 = new PlotMataKuliah();
//		
//		Mahasiswa ms1 = new Mahasiswa();
//		ms1.setNamaMahasiswa("Kevin Aditya Sadewo");
//		ms1.setNim("53415686");
//		ms1.setJenisKelamin("Laki-laki");
//		ms1.setPassword("adadeh");
//		pmk1.setMahasiswa(ms1);
//		
//		Dosen ds1 = new Dosen();
//		ds1.setNamaDosen("Iwata Haruki");
//		ds1.setUsername("Iwata");
//		ds1.setPassword("Haruki");
//		pmk1.setDosen(ds1);
//		
//		MataKuliah mk1 = new MataKuliah();
//		mk1.setNamaMataKuliah("Springboot");
//		pmk1.setMataKuliah(mk1);
//		
//		List<Soal> listSoal = new ArrayList<Soal>();
//		
//		Soal soal1 = new Soal();
//		soal1.setNamaSoal("Soal Springboot");
//		soal1.setStatus(1);
//		
//		Nilai nilai1 = new Nilai();
//		nilai1.setNilai("100");
//		soal1.setNilai(nilai1);
//		
//		Pertanyaan pert1 = new Pertanyaan();
//		pert1.setPertanyaannya("Sebutkan apa saja kegunaan Springboot!");
//		pert1.setJawaban1("Untuk membuat tabel pada database");
//		pert1.setJawaban2("Untuk memanggil query pada database");
//		pert1.setJawaban3("Untuk manipulasi tabel database");
//		pert1.setJawaban4("Untuk pengisian data pada database");
//		pert1.setJawabanBenar(4);
//		pert1.setStatusGambar("https://www.animenewsnetwork.com/hotlink/images/encyc/P173677-1130137200.1548694837.jpg");
//		
//		List<Pertanyaan> listPertanyaan = new ArrayList<Pertanyaan>();
//		listPertanyaan.add(pert1);
//		soal1.setListPertanyaan(listPertanyaan);
//		
//		listSoal.add(soal1);
//		
//		pmk1.setListSoal(listSoal);
//		
//		this.adminRepository.save(admin);
//		this.plotMataKuliahRepository.save(pmk1);
	
	}
	
}
