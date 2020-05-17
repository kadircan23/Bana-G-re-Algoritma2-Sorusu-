package algoritmasorum;
import java.util.Calendar;
 
public class MercedesTasit {

    private String aracMarka;
    private String aracModel;
    private int aracYil;
    private String yakitTuru;
    private int kmHarcananYakitLitre;
    private int depoYakitLitre;
    public int mevcutHiz;
    private String uretilenUlke="Almanya";
    private String vitesTuru;
    
     MercedesTasit()
     {  
        this.aracMarka="Mercedes"; 
        this.aracModel="Model Oluşturulmadı";
        this.depoYakitLitre=0;
        this.vitesTuru="Vites Belirlenmedi";
     } 
 
     MercedesTasit(String aracModel,int aracYil)
     {  
        this.aracMarka="Mercedes"; 
        this.aracModel=aracModel;
        this.aracYil=aracYil;
        this.depoYakitLitre=60;
     } 
 
    public String getAracMarka() {
        return aracMarka;
    }

    public void setAracMarka(String aracMarka) {
        this.aracMarka = aracMarka;
    }

    public String getAracModel() {
        return aracModel;
    }

    public void setAracModel(String aracModel) {
        this.aracModel = aracModel;
    }

    public int getAracYil() {
        return aracYil;
    }

    public void setAracYil(int aracYil) {
        this.aracYil = aracYil;
    }

    public String getYakitTuru() {
        return yakitTuru;
    }

    public void setYakitTuru(String yakitTuru) {
        this.yakitTuru = yakitTuru;
    }

    public int getKmHarcananYakitLitre() {
        return kmHarcananYakitLitre;
    }

    public void setKmHarcananYakitOrani(int kmHarcananYakitLitre) {
        this.kmHarcananYakitLitre = kmHarcananYakitLitre;
    }
  
    
    public int getDepoYakitLitre() {
        return depoYakitLitre;
    }

    public void setDepoYakitLitre(int depoYakitLitre) {
        this.depoYakitLitre = depoYakitLitre;
    }

    public int getMevcutHiz() {
        return mevcutHiz;
    }

    public void setMevcutHiz(int mevcutHiz) {
        this.mevcutHiz = mevcutHiz;
    }
    
   int yakitHarca(int alinanKm,int kmHarcananYakitLitre)
   {
       if (alinanKm >= 5) 
       {
           depoYakitLitre=2*kmHarcananYakitLitre;
       }
       else if (alinanKm < 5)
       {
        depoYakitLitre-=3*kmHarcananYakitLitre;
       }
       
       System.out.println("KALAN YAKIT LİTRE: "+depoYakitLitre);
       return depoYakitLitre;
   }
      
    /*OTOMATİK VİTES DEĞİŞTİR*/

    int vitesDegistir(int mevcutHiz,int vitesKonum)
   { 
        if (vitesKonum==1)
        {
            mevcutHiz+=10;
        }
        else if (vitesKonum==2)
        {
            mevcutHiz+=30;
        }
        else if (vitesKonum==3)
        {
            mevcutHiz+=10;
        }
        else if (vitesKonum==4)
        {
           mevcutHiz+=10;
        }
       else if (vitesKonum==5)
        {
            mevcutHiz+=10;
        }
       else if (vitesKonum==6)
       {
            mevcutHiz+=50;
       }
                
        return mevcutHiz;
        
   }
    
    /*DÜZ VİTES DEĞİŞTİR*/
    int vitesDegistir(int mevcutHiz,int vitesKonum,boolean debriajDurumu)
   {
      
         if (debriajDurumu==true)
        {
                 if (vitesKonum==1)
                {
                    mevcutHiz+=10;
                }
                 if (vitesKonum==2)
                {
                    mevcutHiz+=30;
                }
                  if (vitesKonum==3)
                {
                    mevcutHiz+=10;
                }
                  if (vitesKonum==4)
                {
                   mevcutHiz+=10;
                }
                 if (vitesKonum==5)
                {
                    mevcutHiz+=10;
                }
                 if (vitesKonum==6)
               {
                    mevcutHiz+=50;
               }   
        }
        else
        {
            System.out.println("Debriyaja Basılmadı");
        }
          return mevcutHiz;    

   }
    
    private void uretimUlkeGoruntule()
    {
        uretilenUlke="Almanya";
    }
  
}

