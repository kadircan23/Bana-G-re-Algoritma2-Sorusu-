 
package algoritmasorum;
 
public class DizelArac extends MercedesTasit 
{
     
   DizelArac(String aracModel) {
         
        MercedesTasit dizelMercedes = new MercedesTasit();
        dizelMercedes.setAracModel(aracModel);
        dizelMercedes.setKmHarcananYakitOrani(15);
        dizelMercedes.setAracYil(2019);
        dizelMercedes.setYakitTuru("Dizel");
        dizelMercedes.setDepoYakitLitre(80);
         
        System.out.println("Marka: "+dizelMercedes.getAracMarka());
        System.out.println("Model: "+dizelMercedes.getAracModel());
        System.out.println("Yakıt Türü: "+dizelMercedes.getYakitTuru());
        System.out.println("Araç Yıl: "+dizelMercedes.getAracYil());
        System.out.println("Yakıt Depo Kapasite: "+dizelMercedes.getDepoYakitLitre());
        
    }
 
    void aracCalistir() 
    {
        System.out.println("Dizel Araç Çalışıyor..");
    }
    
}
