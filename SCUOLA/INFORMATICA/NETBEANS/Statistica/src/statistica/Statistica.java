
package statistica;

public class Statistica {

    public static void main(String[] args) {
       String s="trentatre trentini andarono a trento tutti 33 trotterellando";
       int contavocali=0,contaconsonanti=0,contasegni=0,contaspazi=0;
       for(int i=0;i<s.length();i++){
           char c=s.charAt(i);
           switch(c){
               case 'a': contavocali++;break;
               case 'A': contavocali++;break;
               case 'e': contavocali++;break;
               case 'E': contavocali++;break;
               case 'i': contavocali++;break;
               case 'I': contavocali++;break;
               case 'o': contavocali++;break;
               case 'O': contavocali++;break;
               case 'u': contavocali++;break;
               case 'U': contavocali++;break;
               case ' ': contaspazi++;break;
               default: {
                    if(c>=65&&c<=90||c>=97&&c<=122)contaconsonanti++;
                    else contasegni++;
               }break;
           }
       }
       System.out.println("lunghezza totale inclusi spazi="+s.length());
       System.out.println("lunghezza totale esclusi spazi="+(s.length()-contaspazi));
       System.out.println("vocali="+contavocali);
       System.out.println("consonanti="+contaconsonanti);
       System.out.println("altro="+contasegni);
    }
}
