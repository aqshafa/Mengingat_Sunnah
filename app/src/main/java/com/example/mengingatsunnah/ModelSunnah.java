package com.example.mengingatsunnah;

public class ModelSunnah {

    private String id;
    private String judul;
    private String subjudul;
    private int gambar;

    public ModelSunnah(String id, String judul, String subjudul, int gambar) {
        this.id = id;
        this.judul = judul;
        this.subjudul = subjudul;
        this.gambar = gambar;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getSubjudul() {
        return subjudul;
    }

    public void setSubjudul(String subjudul) {
        this.subjudul = subjudul;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
