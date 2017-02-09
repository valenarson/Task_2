/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_2;

/**
 *
 * @author user
 */
public class Mahasiswa {
    private String NIM, Nama, Status;
    private char[] nilai;
    private int x;
    
    public Mahasiswa() {
        this.Status ="TIDAK LULUS";
        this.x = 0;
        this.nilai = new char[10];
    }
    
    public Mahasiswa(String NIM, String Nama) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Status = "TIDAK LULUS";
        this.x = 0;
        this.nilai = new char[10];
    }
    
    public String getNIM() {
        return NIM;
    }
    
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
    
    public String getNama() {
        return Nama;
    }
    
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    
    public String getStatus() {
        return Status;
    }
    
    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    public char getNilai (int x) {
        char nilai = this.nilai[x];
        return nilai;
    }
    
    public void setNilai (char[] nilai) {
        this.nilai = nilai;
    }
    
    public int getX() {
        return x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void addNilai (char nilai) {
        if (x < 10) {
            this.nilai[x] = nilai;
            x++;
        }
    }
    
     
    
    public String toString() {
        String mahasiswa = NIM + "," +Nama+ "," +Status+ "=";
        for (int m = 0; m < x; m++) {
            mahasiswa = mahasiswa+nilai[m]+ ",";
        }
        return mahasiswa;
    }
    
    public char cekNilai (Mahasiswa m) {
        char j = 0;
        for(char k = 'A'; k < 'E'; k++) {
            for (int l = 0; l < x; l++) {
                if (nilai [l] == k) {
                    for (int n = 0; n < m.x; n++) {
                        if (m.nilai[n] == k) {
                            return k;
                        }
                    }
                }
            }
        }
        return j;
    }
}
