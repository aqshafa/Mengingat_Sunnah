package com.example.mengingatsunnah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private SunnahAdapter sunnahAdapter;
    RecyclerView rvMain;
    ArrayList<ModelSunnah> arrayList;
    int count = 0;
    String idSunnah;
    private String[] id = {
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "11",
            "12",
            "13",
            "14",
            "15",
            "16",
            "17",
            "18",
            "19",
            "20",
    };

    private String[] judul = {
            "1. Mendahulukan Kaki Kanan Saat Memakai Sandal Dan Kaki Kiri Saat Melepasnya",
            "2. Menjaga Dan Memelihara Wudhu",
            "3. Bersiwak (Menggosok Gigi dengan Kayu Siwak)",
            "4. Shalat Istikharah",
            "5. Berkumur-Kumur Dan Menghirup Air dengan Hidung Dalam Satu Cidukan Telapak TanganKetika Berwudhu",
            "6. Berwudhu Sebelum Tidur Dan Tidur Dengan Posisi Miring Ke Kanan",
            "7. Berbuka Puasa Dengan Makanan Ringan",
            "8. Sujud Syukur Saat Mendapatkan Nikmat Atau Terhindar Dari Bencana",
            "9. Tidak Begadang Dan Segera Tidur Selesai Shalat Isya`",
            "10. Mengikuti Bacaan Muadzin",
            "11. Berlomba-Lomba Untuk Mengumandangkan Adzan, Bersegera Menuju Shalat, Serta Berupaya Untuk Mendapatkan Shaf Pertama.",
            "12. Meminta Izin Tiga Kali Ketika Bertamu",
            "13. Mengibaskan Seprai Saat Hendak Tidur",
            "14. Meruqyah Diri Dan Keluarga",
            "15. Berdoa Saat Memakai Pakaian Baru",
            "16. Mengucapkan Salam Kepada Semua Orang Islam Termasuk Anak Kecil",
            "17. Berwudhu Sebelum Mandi Besar (Mandi Junub)",
            "18. Membaca ‘Amin’ Dengan Suara Keras Saat Menjadi Makmum",
            "19. Mengeraskan Suara Saat Membaca Zikir Setelah Shalat",
            "20. Membuat Pembatas Saat Sedang Shalat Fardhu Atau Shalat Sunnah",
    };

    private String[] subjudul = {
            "Diriwayatkan dari Abu Hurairah Radhiyallahu Anhu",
            "Diriwayatkan dari Tsauban Radhiyallahu Anhu",
            "Diriwayatkan dari Aisyah Radhiyallahu Anha",
            "Diriwayatkan dari Jabir Radhiyallahu Anhu",
            "Diriwayatkan dari Abdullah bin Zaid Radhiyallahu Anhu",
            "Diriwayatkan dari Al-Barra’ bin Azib Radhiyallahu Anhu",
            "Diriwayatkan dari Anas bin Malik Radhiyallahu Anhu",
            "Diriwayatkan dari Abu Bakrah Radhiyallahu Anhu",
            "",
            "Diriwayatkan dari Abdullah bin Amr Radhiyallahu Anhu",
            "Diriwayatkan dari Abu Hurairah Radhiyallahu Anhu",
            "",
            "Diriwayatkan dari Abu Hurairah Radhiyallahu Anhu",
            "Diriwayatkan dari Aisyah Radhiyallahu Anha",
            "Diriwayatkan dari Abu Sa’id Al-Khudri Radhiyallahu Anhu",
            "Diriwayatkan dari Abdullah bin Amru Radhiyallahu Anhu",
            "Diriwayatkan dari Aisyah Radhiyallahu Anha",
            "Diriwayatkan dari Abu Hurairah Radhiyallahu Anhu",
            "Ibnu Abbas Radhiyallahu Anhuma mengatakan",
            "Diriwayatkan dari Abu Sa’id Al-Khudri Radhiyallahu Anhu",
    };

    private int[] gambar = {
      R.drawable.sandal,
      R.drawable.wudhu,
      R.drawable.siwak,
      R.drawable.istikharah,
      R.drawable.wudhu,
      R.drawable.kanan,
      R.drawable.ringan,
      R.drawable.syukur,
      R.drawable.tidur,
      R.drawable.adzan,
      R.drawable.semangat,
      R.drawable.izin,
      R.drawable.kibas,
      R.drawable.ruqyah,
      R.drawable.pakaian,
      R.drawable.salam,
      R.drawable.wudhu,
      R.drawable.amin,
      R.drawable.dzikir,
      R.drawable.sutrah,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        idSunnah = getIntent().getStringExtra("KEY");
        rvMain = findViewById(R.id.rvMain);
        arrayList = new ArrayList<>();
        setDataSunnah();
        rvMain.setLayoutManager(new LinearLayoutManager(this));
        rvMain.setHasFixedSize(true);
        sunnahAdapter = new SunnahAdapter(arrayList);
        rvMain.setAdapter(sunnahAdapter);
        rvMain.setHasFixedSize(true);


    }

    private void setDataSunnah(){
        for (String idsunnah : id){
            arrayList.add(new ModelSunnah(idsunnah, judul[count], subjudul[count], gambar[count]));
            count++;
        }

    }
}
