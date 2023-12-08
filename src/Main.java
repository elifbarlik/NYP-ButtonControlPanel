import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame();  //Uygulama ekranini olusturur
        JPanel panel = new JPanel();  //Ekrandan panel olusturur
        panel.setLayout(new GridLayout(4,4));  //paneli 4*4e ayirir

        Icon aktifSimge = UIManager.getIcon("OptionPane.informationIcon"); //aktif simgeye java kutuphanelerinden icon eklenir
        Icon pasifSimge = UIManager.getIcon("OptionPane.warningIcon");  //pasif simgeye java kutuphanelerinden icon eklenir
        String grapQLSemaAdresi = "https://myGrapQL/graphql";  //grapQL sema adresi ekler

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++) {
                ButonOzellikler btn = new ButonOzellikler(Color.BLUE, Color.YELLOW, aktifSimge, pasifSimge,grapQLSemaAdresi);  //Buton ozellikleri eklenir
                panel.add(btn); //buton panele eklenir
            }
        }

        f.add(panel); //panel frame e eklenir
        f.setSize(400,400); //frame in ilk boyutu belirlenir
        f.setVisible(true); //frame gorunur yapilir
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  //sekme kapandiginda calisma sona erer

    }
}