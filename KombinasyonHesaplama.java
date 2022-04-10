package kombinasyonhesaplama;
import java.util.*;
public class KombinasyonHesaplama {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Kombinasyon formülü C(n,r) biçiminde gösterilir.");
       System.out.println("C(n,r)=n!/(r!*(n-r)!)");
       System.out.print("n değerini giriniz:");
       int n = input.nextInt();
       System.out.print("r değerini giriniz:");
       int r = input.nextInt();
       
       int toplamN=1;
       int toplamR=1;
       int toplamNeksiR=1;
       
       for(int i=1; i<=n; i++){
           toplamN = toplamN*i;
       }
       System.out.println("n!=" + toplamN);
       
       for(int k=1; k<=r; k++){
           toplamR = toplamR*k;
       }
       System.out.println("r!:" + toplamR);
       
       for(int j=1; j<=(n-r); j++){
           toplamNeksiR = toplamNeksiR*j;
       }
       
       System.out.println("(n-r)!:" + toplamNeksiR);
       double sonuc = toplamN/(toplamR*toplamNeksiR);
       System.out.println(sonuc);
       
    }
    
}
