package com.example.mengingatsunnah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailSunnah extends AppCompatActivity {

    public static final String KEY_SUNNAH = "KEY";
    ImageView ivDetail;
    TextView judulDetail, subDetail;
    String idSunnah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_sunnah);
        idSunnah = getIntent().getStringExtra("KEY");
        ivDetail = findViewById(R.id.ivDetail);
        judulDetail = findViewById(R.id.judulDetail);
        subDetail = findViewById(R.id.subDetail);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("");

        if (idSunnah.equals("1")) {
            ivDetail.setImageResource(R.drawable.sandal);
            judulDetail.setText("1. Mendahulukan Kaki Kanan Saat Memakai Sandal Dan Kaki Kiri Saat Melepasnya");
            subDetail.setText("Diriwayatkan dari Abu Hurairah Radhiyallahu Anhu bahwa Rasulullah Shallallahu Alaihi wa Sallambersabda, “Jika kalian memakai sandal maka dahulukanlah kaki kanan, dan jika melepaskannya, maka dahulukanlah kaki kiri. Jika memakainya maka hendaklah memakai keduanya atau tidak memakaikeduanya sama sekali.” (HR. Al-Bukhari dan Muslim)");
        } else if (idSunnah.equals("2")) {
            ivDetail.setImageResource(R.drawable.wudhu);
            judulDetail.setText("2. Menjaga Dan Memelihara Wudhu");
            subDetail.setText("Diriwayatkan dari Tsauban Radhiyallahu Anhu bahwa Rasulullah Shallallahu Alaihi wa Sallam bersabda,“Istiqamahlah (konsistenlah) kalian semua (dalam menjalankan perintah Allah) dan kalian tidak akan pernah dapat menghitung pahala yang akan Allah berikan. Ketahuilah bahwa sebaik-baik perbuatan adalah shalat, dan tidak ada yang selalu memelihara wudhunya kecuali seorang mukmin.” (HR. Ahmad dan Ibnu Majah)");
        } else if (idSunnah.equals("3")) {
            ivDetail.setImageResource(R.drawable.siwak);
            judulDetail.setText("3. Bersiwak (Menggosok Gigi dengan Kayu Siwak)");
            subDetail.setText("Diriwayatkan dari Aisyah Radhiyallahu Anha bahwa Rasulullah Shallallahu Alaihi wa Sallam bersabda,“Siwak dapat membersihkan mulut dan sarana untuk mendapatkan ridha Allah.” (HR. Ahmad dan An-Nasa`i)\n" +
                    "\n" +
                    "Rasulullah Shallallahu Alaihi wa Sallam juga bersabda, “Andaikata tidak memberatkan umatku niscaya aku memerintahkan mereka untuk bersiwak setiap kali hendak shalat.” (HR. Al-Bukhari dan Muslim)\n" +
                    "\n" +
                    "Bersiwak disunnahkan setiap saat, tetapi lebih sunnah lagi saat hendak berwudhu, shalat, membaca Al-Qur`an, saat bau mulut berubah, baik saat berpuasa ataupun tidak, pagi maupun sore, saat bangun tidur, dan hendak memasuki rumah.\n" +
                    "\n" +
                    "Bersiwak merupakan perbuatan sunnah yang hampir tidak pernah dilakukan oleh banyak orang, kecuali yang mendapatkan rahmat dari Allah. Untuk itu, wahai saudaraku, belilah kayu siwak untuk dirimu dan keluargamu sehingga kalian bisa menghidupkan sunnah ini kembali dan niscaya kalian akan mendapatkan pahala yang sangat besar.");
        } else if (idSunnah.equals("4")) {
            ivDetail.setImageResource(R.drawable.istikharah);
            judulDetail.setText("4. Shalat Istikharah");
            subDetail.setText("Diriwayatkan dari Jabir Radhiyallahu Anhu bahwa ia berkata, “Rasulullah Shallallahu Alaihi wa Sallammengajarkan kepada kita tata cara shalat istikharah untuk segala urusan, sebagaimana beliau mengajarkan surat-surat Al-Qur`an kepada kami.” (HR. Al-Bukhari)\n" +
                    "\n" +
                    "Oleh karena itu, lakukanlah shalat ini dan berdoalah dengan doa yang sudah lazim diketahui dalam shalat istikharah.");
        } else if (idSunnah.equals("5")) {
            ivDetail.setImageResource(R.drawable.wudhu);
            judulDetail.setText("5. Berkumur-Kumur Dan Menghirup Air dengan Hidung Dalam Satu Cidukan Telapak TanganKetika Berwudhu");
            subDetail.setText("Diriwayatkan dari Abdullah bin Zaid Radhiyallahu Anhu, bahwa Rasulullah Shallallahu Alaihi wa Sallamberkumur-kumur dan menghirup air dengan hidung secara bersamaan dari satu ciduk air dan itu dilakukan sebanyak tiga kali. (HR. Al-Bukhari dan Muslim)");
        } else if (idSunnah.equals("6")) {
            ivDetail.setImageResource(R.drawable.kanan);
            judulDetail.setText("6. Berwudhu Sebelum Tidur Dan Tidur Dengan Posisi Miring Ke Kanan");
            subDetail.setText("Diriwayatkan dari Al-Barra’ bin Azib Radhiyallahu Anhu bahwa Rasulullah Shallallahu Alaihi wa Sallambersabda, “Jika kamu hendak tidur, maka berwudhulah seperti hendak shalat, kemudian tidurlah dengan posisi miring ke kanan dan bacalah, ‘Ya Allah, Aku pasrahkan jiwa ragaku kepada-Mu, aku serahkan semua urusanku kepada-Mu, aku lindungkan punggungku kepada-Mu, karena cinta sekaligus takut kepada-Mu, tiada tempat berlindung mencari keselamatan dari (murka)-Mu kecuali kepada-Mu, aku beriman dengan kitab yang Engkau turunkan dan dengan nabi yang Engkau utus’. Jika engkau meninggal, maka engkau meninggal dalam keadaan fitrah. Dan usahakanlah doa ini sebagai akhir perkataanmu.” (HR. Al-Bukhari dan Muslim)");
        } else if (idSunnah.equals("7")) {
            ivDetail.setImageResource(R.drawable.ringan);
            judulDetail.setText("7. Berbuka Puasa Dengan Makanan Ringan");
            subDetail.setText("Diriwayatkan dari Anas bin Malik Radhiyallahu Anhu, ia berkata, “Rasulullah Shallallahu Alaihi wa Sallamberbuka puasa sebelum shalat maghrib dengan beberapa kurma basah. Jika tidak ada maka dengan beberapa kurma kering. Jika tidak ada, maka beliau hanya meminum beberapa teguk air.” (HR. Ahmad, Abu Dawud dan At-Tirmidzi)");
        } else if (idSunnah.equals("8")) {
            ivDetail.setImageResource(R.drawable.syukur);
            judulDetail.setText("8. Sujud Syukur Saat Mendapatkan Nikmat Atau Terhindar Dari Bencana");
            subDetail.setText("Sujud ini hanya sekali dan tidak terikat oleh waktu. Diriwayatkan dari Abu Bakrah Radhiyallahu Anhu ia berkata, “Jika Rasulullah Shallallahu Alaihi wa Sallam mendapatkan sesuatu yang menyenangkan atau disampaikan kabar gembira maka beliau langsung sujud dalam rangka bersyukur kepada Allah.” (HR. Abu Dawud, At-Tirmidzi dan Ibnu Majah).");
        } else if (idSunnah.equals("9")) {
            ivDetail.setImageResource(R.drawable.tidur);
            judulDetail.setText("9. Tidak Begadang Dan Segera Tidur Selesai Shalat Isya`");
            subDetail.setText("Hal ini berlaku jika tidak ada keperluan saat begadang. Tetapi jika ada keperluan, seperti belajar, mengobati orang sakit dan lain-lain maka itu diperbolehkan. Dalam hadits shahih dinyatakan bahwa Rasulullah Shallallahu Alaihi wa Sallam tidak suka tidur sebelum shalat isya` dan tidak suka begadang setelah shalat isya`.");
        } else if (idSunnah.equals("10")) {
            ivDetail.setImageResource(R.drawable.adzan);
            judulDetail.setText("10. Mengikuti Bacaan Muadzin");
            subDetail.setText("Diriwayatkan dari Abdullah bin Amr Radhiyallahu Anhu bahwa dia mendengar Rasulullah Shallallahu Alaihi wa Sallam bersabda, “Jika kalian mendengar adzan, maka ucapkanlah seperti yang diucapkan oleh muadzin, kemudian bershalawatlah kepadaku. Barangsiapa yang bershalawat kepadaku, maka Allah akan bershalawat kepadanya sepuluh kali. Kemudian mintakan wasilah untukku, karena wasilah merupakan tempat di surga yang tidak layak kecuali bagi seorang hamba Allah dan aku berharap agar akulah yang mendapatkannya. Barangsiapa yang memintakan wasilah untukku maka ia akan mendapatkan syafaatku (di akhirat kelak).” (HR. Muslim)");
        } else if (idSunnah.equals("11")) {
            ivDetail.setImageResource(R.drawable.semangat);
            judulDetail.setText("11. Berlomba-Lomba Untuk Mengumandangkan Adzan, Bersegera Menuju Shalat, Serta Berupaya Untuk Mendapatkan Shaf Pertama.");
            subDetail.setText("Diriwayatkan dari Abu Hurairah Radhiyallahu Anhu bahwa Rasulullah Shallallahu Alaihi wa Sallambersabda, “Andaikata umat manusia mengetahui pahala di balik adzan dan berdiri pada shaf pertama kemudian mereka tidak mendapatkan bagian kecuali harus mengadakan undian terlebih dahulu niscaya mereka membuat undian itu. Andaikata mereka mengetahui pahala bergegas menuju masjid untuk melakukan shalat, niscaya mereka akan berlomba-lomba melakukannya. Andaikata mereka mengetahui pahala shalat isya dan subuh secara berjamaah, niscaya mereka datang meskipun dengan merangkak.”(HR. Al-Bukhari dan Muslim)");
        } else if (idSunnah.equals("12")) {
            ivDetail.setImageResource(R.drawable.izin);
            judulDetail.setText("12. Meminta Izin Tiga Kali Ketika Bertamu");
            subDetail.setText("Jika tidak mendapatkan izin dari tuan rumah, maka konsekuensinya anda harus pergi. Namun, banyak sekali orang yang marah-marah jika mereka bertamu tanpa ada perjanjian sebelumnya, lalu pemilik rumah tidak mengizinkannya masuk. Mereka tidak bisa memaklumi, mungkin pemilik rumah memiliki uzur sehingga tidak bisa memberi izin. Allah Ta’ala berfirman, “Dan jika dikatakan kepadamu, “Kembalilah!” Maka (hendaklah) kamu kembali. Itu lebih suci bagimu, dan Allah Maha Mengetahui apa yang kamu kerjakan.” (QS. An-Nuur: 28)\n" +
                    "\n" +
                    "Rasulullah Shallallahu Alaihi wa Sallam bersabda, “Adab meminta izin itu hanya tiga kali, jika tidak diizinkan maka seseorang harus pulang.” (HR. Al-Bukhari dan Muslim)");
        } else if (idSunnah.equals("13")) {
            ivDetail.setImageResource(R.drawable.kibas);
            judulDetail.setText("13. Mengibaskan Seprai Saat Hendak Tidur");
            subDetail.setText("Diriwayatkan dari Abu Hurairah Radhiyallahu Anhu bahwa Rasulullah Shallallahu Alaihi wa Sallambersabda, “Jika kalian hendak tidur, maka hendaknya dia mengambil ujung seprainya, lalu mengibaskannya dengan membaca basmallah, karena dia tidak mengetahui apa yang akan terjadi di atas kasurnya. Jika dia hendak merebahkan tubuhnya, maka hendaknya dia mengambil posisi tidur miring ke kanan dan membaca, “Maha Suci Engkau, ya Allah, Rabbku, dengan-Mu aku merebahkan tubuhku, dan dengan-Mu pula aku mengangkatnya. Jika Engkau menahan nyawaku, maka ampunkanlah ia, dan jika Engkau melepasnya, maka lindungilah ia dengan perlindungan-Mu kepada hamba-hamba-Mu yang shalih.” (HR. Muslim)");
        } else if (idSunnah.equals("14")) {
            ivDetail.setImageResource(R.drawable.ruqyah);
            judulDetail.setText("14. Meruqyah Diri Dan Keluarga");
            subDetail.setText("Diriwayatkan dari Aisyah Radhiyallahu Anha bahwa ia berkata, “Nabi Muhammad Shallallahu Alaihi wa Sallam senantiasa meruqyah dirinya dengan doa-doa perlindungan ketika sakit, yaitu pada sakit yang menyebabkan wafatnya beliau. Saat beliau kritis, akulah yang meruqyah beliau dengan doa tersebut, lalu aku mengusapkan tangannya ke anggota tubuhnya sendiri, karena tangan itu penuh berkah.” (HR. Al-Bukhari)");
        } else if (idSunnah.equals("15")) {
            ivDetail.setImageResource(R.drawable.pakaian);
            judulDetail.setText("15. Berdoa Saat Memakai Pakaian Baru");
            subDetail.setText("Diriwayatkan dari Abu Sa’id Al-Khudri Radhiyallahu Anhu ia berkata, “Rasulullah Shallallahu Alaihi wa Sallam jika mengenakan pakaian baru, maka beliau menamai pakaian itu dengan namanya, baik itu baju, surban, selendang ataupun jubah, kemudian beliau membaca, “Ya Allah, hanya milik-Mu semua pujian itu, Engkau telah memberiku pakaian, maka aku mohon kepada-Mu kebaikannya dan kebaikan tujuannya dibuat, dan aku berlindung kepada-Mu dari keburukannya dan keburukan tujuannya dibuat.” (HR. Abu Dawud dan At-Tirmidzi)");
        } else if (idSunnah.equals("16")) {
            ivDetail.setImageResource(R.drawable.salam);
            judulDetail.setText("16. Mengucapkan Salam Kepada Semua Orang Islam Termasuk Anak Kecil");
            subDetail.setText("Diriwayatkan dari Abdullah bin Amru Radhiyallahu Anhu, ia menceritakan, ”Seorang laki-laki bertanya kepada Rasulullah Shallallahu Alaihi wa Sallam, ‘Apa ciri keislaman seseorang yang paling baik?’Rasulullah Shallallahu Alaihi wa Sallam menjawab, ‘Kamu memberikan makanan (kepada orang yang membutuhkan) dan mengucapkan salam kepada orang yang kamu kenal dan orang yang tidak kamu kenal.” (HR. Al-Bukhari dan Muslim)\n" +
                    "\n" +
                    "Diriwayatkan dari Anas Radhiyallahu Anhu bahwa ia menuturkan, “Rasulullah Shallallahu Alaihi wa Sallam berjalan melewati kumpulan anak-anak, lalu beliau mengucapkan salam kepada mereka semua.”(HR. Muslim)");
        } else if (idSunnah.equals("17")) {
            ivDetail.setImageResource(R.drawable.wudhu);
            judulDetail.setText("17. Berwudhu Sebelum Mandi Besar (Mandi Junub)");
            subDetail.setText("Diriwayatkan dari Aisyah Radhiyallahu Anhu, “Jika Rasulullah Shallallahu Alaihi wa Sallam ingin mandi besar, maka beliau membasuh tangannya terlebih dahulu, lalu berwudhu seperti hendak shalat, kemudian memasukkan jemarinya ke airdan membasuh rambutnya dengan air. Selanjutnya Rasulullah Shallallahu Alaihi wa Sallam menuangkan air tiga ciduk ke kepalanya dengan menggunakan tangannya, lalu mengguyur semua bagian tubuhnya.” (HR. Al-Bukhari dan Muslim)");
        } else if (idSunnah.equals("18")) {
            ivDetail.setImageResource(R.drawable.amin);
            judulDetail.setText("18. Membaca ‘Amin’ Dengan Suara Keras Saat Menjadi Makmum");
            subDetail.setText("Diriwayatkan dari Abu Hurairah Radhiyallahu Anhu bahwa Rasulullah Shallallahu Alaihi wa Sallambersabda, “Jika imam membaca “Amin” maka kalian juga harus membaca “Amin” karena barangsiapa yang bacaan Amin-nya bersamaan dengan bacaan malaikat maka diampunkan dosa-dosanya yang telah berlalu.” (HR. Al-Bukhari dan Muslim)\n" +
                    "\n" +
                    "Dalam sebuah riwayat disebutkan bahwa kaum salafus-shalih mengeraskan bacaan “Amin” sehingga masjid bergemuruh.");
        } else if (idSunnah.equals("19")) {
            ivDetail.setImageResource(R.drawable.dzikir);
            judulDetail.setText("19. Mengeraskan Suara Saat Membaca Zikir Setelah Shalat");
            subDetail.setText("Di dalam kitab Shahih Al-Bukhari disebutkan, “Ibnu Abbas Radhiyallahu Anhuma mengatakan, mengeraskan suara dalam berzikir setelah orang-orang selesai melaksanakan shalat wajib telah ada sejak zaman Rasulullah Shallallahu Alaihi wa Sallam. Ibnu Abbas juga mengatakan, “Aku mengetahui orang-orang telah selesai melaksanakan shalat karena mendengar zikir mereka.” (HR. Al-Bukhari)\n" +
                    "\n" +
                    "Syaikhul Islam Ibnu Taimiyah berkata, “Disunnahkan mengeraskan suara saat membaca tasbih, tahmid dan takbir setelah shalat.”\n" +
                    "\n" +
                    "Sunnah ini tidak dilakukan di banyak masjid sehingga tidak dapat dibedakan apakah imam sudah salam atau belum, karena suasananya sepi dan hening. Caranya adalah imam dan makmum mengeraskan bacaan tasbih (Subhanallah), tahmid (Alhamdulillah) dan takbir (Allahu Akbar) secara sendiri-sendiri, bukan satu komando dan satu suara. Adapun mengeraskan suara ketika berzikir dengan satu komando, satu suara dan dipimpin oleh imam maka dalam hal ini terdapat perbedaan pendapat di kalangan ulama. Ada yang mengatakan sunnah secara mutlak, ada yang memandang sunnah dengan syarat-syarat tertentu dan ada pula yang mengatakan bahwa zikir berjamaah adalah perbuatan bid’ah.");
        } else {
            ivDetail.setImageResource(R.drawable.sutrah);
            judulDetail.setText("20. Membuat Pembatas Saat Sedang Shalat Fardhu Atau Shalat Sunnah");
            subDetail.setText("Diriwayatkan dari Abu Said al-Kudri Radhiyallahu Anhu bahwa Rasulullah Shallallahu Alaihi wa Sallambersabda, “Ketika kalian hendak shalat, maka buatlah pembatas di depannya dan majulah sedikit, dan janganlah membiarkan seseorang lewat di depannya. Jika ada orang yang sengaja lewat di depannya, maka hendaknya dia menghalanginya karena orang itu adalah setan.” (HR. Abu dawud dan Ibnu Majah)\n" +
                    "\n" +
                    "Diriwayatkan dari Abdullah bin Umar Radhiyallahu Anhuma, ia berkata, “Rasulullah menancapkan tombak di depannya, lalu shalat di belakang tongkat itu.” (HR. Al-Bukhari)\n" +
                    "\n" +
                    "Sunnah ini sering diabaikan, terutama saat melakukan shalat sunnah.\n" +
                    "\n" +
                    "Wahai saudaraku! Jadilah seperti orang yang diungkapkan oleh Abdurrahman bin Mahdi, “Aku mendengar Sufyan berkata, ‘Tiada satu hadits pun yang sampai kepadaku kecuali aku mengamalkannya meskipun hanya sekali.”");
        }

    }
}
