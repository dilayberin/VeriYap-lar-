import java.util.Scanner;
public class ikiliArama {
  Scanner s=new Scanner(System.in);  
    int ikili(int d[],int arama){
        int bas=0;
        int son=d.length-1;
        int orta;
        int aranan=s.nextInt();
        while(bas<=son){
            orta=(bas+son)/2;
            if(aranan==d[orta]){
              return orta;
            }
            else if(aranan<d[orta]){
                son=orta-1;
            }
            else{
                bas=orta+1;
            }
            
        }return -1;
    }
    
    public static void main(String[] args) {
       
    }
}
