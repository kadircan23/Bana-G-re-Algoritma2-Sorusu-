 package algoritmasorum;

import java.util.Calendar;

 
public class BenzinliArac extends MercedesTasit{
  
       BenzinliArac(String aracModel) {
         
        MercedesTasit benzinliMercedes = new MercedesTasit();
        benzinliMercedes.setAracModel(aracModel);
        benzinliMercedes.setKmHarcananYakitOrani(15);
        benzinliMercedes.setAracYil(2020);
        benzinliMercedes.setYakitTuru("Benzin");
        benzinliMercedes.setDepoYakitLitre(60);
         
        System.out.println("Marka: "+benzinliMercedes.getAracMarka());
        System.out.println("Model: "+benzinliMercedes.getAracModel());
        System.out.println("Yakıt Türü: "+benzinliMercedes.getYakitTuru());
        System.out.println("Araç Yıl: "+benzinliMercedes.getAracYil());
        System.out.println("Yakıt Depo Kapasite: "+benzinliMercedes.getDepoYakitLitre());
        
    }
 
    void aracCalistir() 
    {
        System.out.println("Benzinli Araç Çalışıyor..");
    }
    
}
