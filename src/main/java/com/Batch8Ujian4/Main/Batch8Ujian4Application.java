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
import com.Batch8Ujian4.Main.Repository.DosenRepository;
import com.Batch8Ujian4.Main.Repository.MahasiswaRepository;
import com.Batch8Ujian4.Main.Repository.MataKuliahRepository;
import com.Batch8Ujian4.Main.Repository.NilaiRepository;
import com.Batch8Ujian4.Main.Repository.PertanyaanRepository;
import com.Batch8Ujian4.Main.Repository.PlotMataKuliahRepository;
import com.Batch8Ujian4.Main.Repository.SoalRepository;

@SpringBootApplication
public class Batch8Ujian4Application implements CommandLineRunner {

	public static void main(String[] args) {
		
		SpringApplication.run(Batch8Ujian4Application.class, args);
		
	}

	@Autowired
	AdminRepository adminRepository;
	
	@Autowired
	MahasiswaRepository mahasiswaRepository;
	
	@Autowired
	MataKuliahRepository mataKuliahRepository;
	
	@Autowired
	DosenRepository dosenRepository;
	
	@Autowired
	PlotMataKuliahRepository plotMataKuliahRepository;
	
	@Autowired
	SoalRepository soalRepository;
	
	@Autowired
	PertanyaanRepository pertanyaanRepository;
	
	@Autowired
	NilaiRepository nilaiRepository;
	
	@Override
	public void run(String... args) throws Exception{
		
		Admin admin = new Admin();
		admin.setUsername("DewaKipas");
		admin.setPassword("kebanned");
		this.adminRepository.save(admin);
		
		Mahasiswa ms1 = new Mahasiswa();
		ms1.setNama_mahasiswa("Kevin Aditya Sadewo");
		ms1.setJenis_kelamin("Laki-laki");
		ms1.setPassword("adadeh");
		this.mahasiswaRepository.save(ms1);
		
		Mahasiswa ms2 = new Mahasiswa();
		ms2.setNama_mahasiswa("Tono Hikaru");
		ms2.setJenis_kelamin("Perempuan");
		ms2.setPassword("kepoih");
		this.mahasiswaRepository.save(ms2);
		
		MataKuliah mk1 = new MataKuliah();
		mk1.setNama_mata_kuliah("Springboot");
		this.mataKuliahRepository.save(mk1);
		
		MataKuliah mk2 = new MataKuliah();
		mk2.setNama_mata_kuliah("Fundamental JAVA");
		this.mataKuliahRepository.save(mk2);
		
		Dosen ds1 = new Dosen();
		ds1.setNama_dosen("Iwata Haruki");
		ds1.setUsername("Iwata");
		ds1.setPassword("Haruki");
		this.dosenRepository.save(ds1);
		
		Dosen ds2 = new Dosen();
		ds2.setNama_dosen("Otsuka Sae");
		ds2.setUsername("Otsuka");
		ds2.setPassword("Sae");
		this.dosenRepository.save(ds2);
		
		PlotMataKuliah pmk1 = new PlotMataKuliah();
		PlotMataKuliah pmk2 = new PlotMataKuliah();
		
		List<Mahasiswa> listMahasiswa1 = new ArrayList<Mahasiswa>();
		listMahasiswa1.add(ms1);
		
		List<Mahasiswa> listMahasiswa2 = new ArrayList<Mahasiswa>();
		listMahasiswa2.add(ms2);
		
		List<MataKuliah> listMataKuliah1 = new ArrayList<MataKuliah>();
		listMataKuliah1.add(mk1);
		
		List<MataKuliah> listMataKuliah2 = new ArrayList<MataKuliah>();
		listMataKuliah2.add(mk2);
		
		List<Dosen> listDosen1 = new ArrayList<Dosen>();
		listDosen1.add(ds1);
		
		List<Dosen> listDosen2 = new ArrayList<Dosen>();
		listDosen2.add(ds2);
		
		ms1.setListMataKuliah(listMataKuliah1);
		mk1.setListDosen(listDosen1);
		ds1.setListMahasiswa(listMahasiswa1);
		ms2.setListMataKuliah(listMataKuliah2);
		mk2.setListDosen(listDosen2);
		ds2.setListMahasiswa(listMahasiswa2);
		
		Soal soal1 = new Soal();
		soal1.setNama_soal("Soal Ujian Springboot");
		soal1.setStatus(0);
		this.soalRepository.save(soal1);
		
		Soal soal2 = new Soal();
		soal2.setNama_soal("Soal Ujian Fundamental JAVA");
		soal2.setStatus(1);
		this.soalRepository.save(soal2);
		
		List<Soal> listSoal1 = new ArrayList<Soal>();
		listSoal1.add(soal1);
		
		List<Soal> listSoal2 = new ArrayList<Soal>();
		listSoal2.add(soal2);
		
		pmk1.setListSoal(listSoal1);
		pmk2.setListSoal(listSoal2);
		
		Pertanyaan pert1 = new Pertanyaan();
		pert1.setPertanyaan("Sebutkan apa saja kegunaan Springboot!");
		pert1.setJawaban_1("Untuk membuat tabel pada database");
		pert1.setJawaban_2("Untuk memanggil query pada database");
		pert1.setJawaban_3("Untuk manipulasi tabel database");
		pert1.setJawaban_4("Untuk pengisian data pada database");
		pert1.setJawaban_benar(4);
		pert1.setStatus_gambar(0);
		this.pertanyaanRepository.save(pert1);
		
		Pertanyaan pert2 = new Pertanyaan();
		pert2.setPertanyaan("Sebutkan apa saja framework yang terdapat pada JAVA!");
		pert2.setJawaban_1("Spring MVC");
		pert2.setJawaban_2("Vaadin");
		pert2.setJawaban_3("Spark");
		pert2.setJawaban_4("Python");
		pert2.setJawaban_benar(3);
		pert2.setStatus_gambar(0);
		this.pertanyaanRepository.save(pert2);
		
		List<Pertanyaan> listPertanyaan1 = new ArrayList<Pertanyaan>();
		listPertanyaan1.add(pert1);
		
		List<Pertanyaan> listPertanyaan2 = new ArrayList<Pertanyaan>();
		listPertanyaan2.add(pert2);
		
		soal1.setListPertanyaan(listPertanyaan1);
		soal2.setListPertanyaan(listPertanyaan2);
		
		Nilai nilai1 = new Nilai();
		nilai1.setNilai(100);
		this.nilaiRepository.save(nilai1);
		
		Nilai nilai2 = new Nilai();
		nilai2.setNilai(75);
		this.nilaiRepository.save(nilai2);
		
		List<Nilai> listNilai1 = new ArrayList<Nilai>();
		listNilai1.add(nilai1);
		
		List<Nilai> listNilai2 = new ArrayList<Nilai>();
		listNilai2.add(nilai2);
		
		soal1.setListNilai(listNilai1);
		soal2.setListNilai(listNilai2);
		
		this.mahasiswaRepository.save(ms1);
		this.mataKuliahRepository.save(mk1);
		this.dosenRepository.save(ds1);
		this.mahasiswaRepository.save(ms2);
		this.mataKuliahRepository.save(mk2);
		this.dosenRepository.save(ds2);
		
		this.plotMataKuliahRepository.save(pmk1);
		this.plotMataKuliahRepository.save(pmk2);

		this.soalRepository.save(soal1);
		this.soalRepository.save(soal2);
		
	}
	
}
