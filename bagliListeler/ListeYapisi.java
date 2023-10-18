/*sürekli değişken tanımlayıp birbirine bağlamakla uğraşmak yerine
bir liste() yapısı oluşturulur.*/ 
class eleman{
    int icerik;
    eleman ileri;
    eleman(int icerik){
        this.icerik=icerik;
        ileri=null;
    }
}
public class Liste {
   eleman bas;
   eleman son;
   Liste(){
    bas=null;
    son=null;
   } 
}
