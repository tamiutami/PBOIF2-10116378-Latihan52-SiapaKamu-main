/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siapakamu;

/**
 *
 * @author Sri Utami Ningsih
 * Kelas : IF-2 / PBO-IF2
 * Nim   : 10116378
 * Deskripsi : program ini berisi program yang menampilkan informasi dosen dan mahasiswa
 */
class Dosen extends Manusia{
     private String nip;
    private String mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public void mengajarApa() {
        System.out.println("Saya " + nama + " umur " + umur
                + " tahun sedang mengajar matakuliah " + mataKuliah);
    }

    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }
}
