 
package algoritmasorum;

 
public class AlgoritmaSorum {
 
    public static void main(String[] args) {
        
        
        BenzinliArac yeniBenzinliMercedes = new BenzinliArac("A180");
       
        yeniBenzinliMercedes.aracCalistir();
        yeniBenzinliMercedes.setMevcutHiz(20);
        
        System.out.println("BENZİNLİ ARAÇ "+yeniBenzinliMercedes.vitesDegistir(yeniBenzinliMercedes.getMevcutHiz(), 5,true) + " km/s Hızla İlerliyor..");
     
        System.out.println("-------------------------------------------");
        
        DizelArac yeniDizelMercedes = new DizelArac("C180"); 
        yeniDizelMercedes.aracCalistir();
        yeniDizelMercedes.setMevcutHiz(5);
        yeniDizelMercedes.setDepoYakitLitre(50);
        System.out.println("DİZEL ARAÇ "+yeniDizelMercedes.vitesDegistir(yeniDizelMercedes.getMevcutHiz(), 2) + " km/s Hızla İlerliyor..  Kalan Yakıt:"+ yeniDizelMercedes.yakitHarca(5,5));
     
        
    }
    
}
