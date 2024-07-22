/*
yigit2
 */
package hafta5uygulama;


public class postfixeCevir {
  boolean buyukEsitMi(char o1,char o2){
      if(o1=='*' && o1=='/'){
              return true;//o1 böyleyse in önceliği o2 den büyük veya eşittir.
      }else if(o2=='+' && o2=='-'){
               return true;
      }
      return false;
  }
  String postfixDonusturme(String infix){
      String postfix=" ";
      yigit2 yigit=new yigit2();
      char karakter=' ';
      for (int i = 0; i < infix.length(); i++) {
          karakter=infix.charAt(i);
          if(karakter<='9'&&karakter>='0'){
              postfix+=infix.charAt(i);
              i++;
              while(infix.charAt(i)<='9'&&infix.charAt(i)>='0'){
                  postfix+=infix.charAt(i);
                  i++;
              }
              i--;
              postfix+=" ";
          }
          else if(karakter=='*'||karakter=='/'||karakter=='+'||karakter=='-'){
              while(!yigit.bosMu()&&yigit.top()!='('){
                  if(buyukEsitMi(yigit.top(),karakter )){
                      postfix+=yigit.top();
                      postfix+=" ";
                      yigit.pop();
                  }
                  else break;
                 
          }
              yigit.push(karakter);}
          else if(karakter=='('){
              yigit.push(karakter);
          }
          else if(karakter==')'){
              while(!yigit.bosMu()){
                  if(yigit.top()=='('){//yığıt başında aç parantez varsa çıkart
                      yigit.pop();
                      break;
                  }
                  postfix+=yigit.top();//yoksa aç parantez görülene kadar postfixe ekle
                  postfix+=" ";
                  yigit.pop();
              }
          }
      }
      
      while(!yigit.bosMu()){//en son yigiti kontrol ediyoruz
          postfix+=yigit.top();
          postfix+=" ";
          yigit.pop();
      }
      return postfix;
  }  
}
