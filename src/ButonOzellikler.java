import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButonOzellikler extends JButton {

    //tanimlamalar
    private Color aktifRenk;
    private Color pasifRenk;
    private Icon aktifSimge;
    private Icon pasifSimge;
    private String grapQlSemaAdresi;
    private static ButonOzellikler aktifButon;

    private boolean isActive = false;

    //yapici metot  --butonun ozelliklerini tanimlar
    public ButonOzellikler(Color aktifRenk, Color pasifRenk, Icon aktifSimge, Icon pasifSimge, String grapQlSemaAdresi){
        this.aktifRenk=aktifRenk;
        this.aktifSimge=aktifSimge;
        this.pasifRenk=pasifRenk;
        this.pasifSimge=pasifSimge;
        this.grapQlSemaAdresi=grapQlSemaAdresi;

        pasifZamanCalismasi();  //butonun pasif olarak baslamasini saglar

        addActionListener(new ActionListener() {  //butonun tiklanma aktivitesini olusturur
            @Override
            public void actionPerformed(ActionEvent e) {
                butonCalisma();  //buton tiklandiginda butonCalisma metotuna gidilir
            }
        });
    }

    public void aktifZamanCalismasi(){  //butonun aktif zamani icin duzenlemeler
        isActive=true;
        setBackground(aktifRenk);
        setIcon(aktifSimge);
        aktifButon=this;
    }
    public void pasifZamanCalismasi(){  //butonun pasif zamani icin duzenlemeler
        isActive=false;
        setBackground(pasifRenk);
        setIcon(pasifSimge);
    }

    public void butonlariPasifEt(){  //yeni buton aktif edildiginde tum butonlari pasif eder
        Container parent = getParent();
        for (Component c : parent.getComponents()) {
            if (c instanceof ButonOzellikler) {
                ((ButonOzellikler) c).pasifZamanCalismasi();
            }
        }
    }
    public void butonCalisma(){
        if(isActive){  //buton aktifse
            pasifZamanCalismasi();
        }else{  //buton pasifse
            butonlariPasifEt();
            aktifZamanCalismasi();
            aktifButon=this;
            Mutation.metinEkle();
        }
    }

    public static class Mutation {  //grapQLin mutation simule eder
        public static Button metinEkle() {
            aktifButon.setText("Tiklandi");
            return null;
        }
    }

}
