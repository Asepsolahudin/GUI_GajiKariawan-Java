/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guiproject2;

/**
 *
 * @author acer
 */
public class karyawan {
    
    public String kodeKaryawan;
    public String namaKaryawan;
    public String gol;
    public String status;
    public int jumlahAnak;
    public float gapok;
    
    
    public void setGajiPokok()
    {
        if (this.gol == "IIIa") this.gapok = 1200000;
        else if (this.gol == "IIIb") this.gapok = 1500000;
        else if (this.gol == "IIIc") this.gapok = 1700000;
        else if (this.gol == "IIId") this.gapok = 1900000;
    }
    
    public float tunjanganIstri()
    {
        float tunjIstri = 0;
        if (this.status == "MENIKAH") tunjIstri =  (float) (this.gapok * 0.1);
        else if (this.status == "BELUM MENIKAH") tunjIstri = (float) 0;
        return tunjIstri;
    }
    
    public float tunjanganAnak()
    {
        return (float) (this.jumlahAnak * this.gapok * 0.05);
    }
    
    public float totalTunjangan()
    {
        return this.tunjanganAnak() + this.tunjanganIstri();
    }
    
    public float gajiKotor()
    {
        return this.gapok + this.totalTunjangan();
    }
    
    public float potongan()
    {
        return (float) (0.15 * this.gajiKotor());
    }
    
    public float gajiBersih()
    {
        return this.gajiKotor() - this.potongan();
    }
}
