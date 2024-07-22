/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hash;

class Pair {
   private int key,value;

    public Pair(int key, int value) {//hash ekleme key değerine göre olacak
        this.key = key;
        this.value = value;
    }
     public int getKey(){
         return key;
     }

    public int getValue() {
        return value;
    }
   
}

class HashtableException extends RuntimeException{//oluşan hatalar için bir exp tanımladık. aldığı hayatı ekrana yazacak

    public HashtableException(String mesaj) {
        super(mesaj);
    }
    
}


public class hashTable {
    int n;
    Pair[] map=null;

    public hashTable(int n) {
        map =new Pair[n];
        this.n = n;
        for (int i = 0; i < n; i++) {
            map[i]=null;
        }
    }
    
   public void put(int key,int value) throws HashtableException{//exp ifadesini çağırdık,
       int hash =key%n;
       int count=0;//diziyi aşıp aşmadığını kontrol etmemizi sağlayacak
       //16,5,n=10 girilirse---> 16%10=6 5. değere 6 değerini atar.
       //6%10=6 olduğunda çakışır. bu kontrol edilmeli
       while(map[hash]!=null&&map[hash].getKey()!=key){
           hash=(hash+1)%n;//gezerek ilk boş yeri bulmaya çalışıyor.oraya çakışan değeri atayacak
           if(count==n){
               throw new HashtableException("tablo dolu!..");
              
           }
            count++;
       }
       map[hash]=new Pair(key, value);
       
       
   }
    public int get(int key) throws HashtableException{//exp ifadesini çağırdık,
       int hash =key%n;
       int count=0;//diziyi aşıp aşmadığını kontrol etmemizi sağlayacak
       //16,5,n=10 girilirse---> 16%10=6 5. değere 6 değerini atar.
       //6%10=6 olduğunda çakışır. bu kontrol edilmeli
       while(map[hash]!=null&&map[hash].getKey()!=key){
           hash=(hash+1)%n;//gezerek ilk boş yeri bulmaya çalışıyor.oraya çakışan değeri atayacak
           if(count==n){
               throw new HashtableException("tablo dolu!..");
              
           }
            count++;
            if(map[hash]==null){
               throw new HashtableException("eşleşme bulunmadı!..");
            }
           
       }
        return map[hash].getValue();
    }
    public static void main(String[] args) {
        hashTable t=new hashTable(10);
        t.put(1, 5);
        t.put(14, 28);
        t.put(12, 23);
        t.put(22, 33);
       //0,1,2,3...9 kalan max 9 olabilir. çünkü 10 elemanlı bir tablo tanımladık 
       //1%10=1  1.indise=5 atanacak.
       //14%10=4  4.indise=28 atanacak
       //12%10=2  2. indise=23
       //22%10=12 12%10=2 2. indis dolu,  boş olan indise=33 atanacak.
       //
        for (int i = 0; i < t.map.length; i++) {
            if(t.map[i]!=null){
                System.out.println(i+"."+t.map[i].getKey()+"-"+t.map[i].getValue());  
            }
            System.out.println(t.get(12));
        }
    }
}
