package proprieta_bicchiere;

public class Proprieta_Bicchiere {
    
    public static void main(String[] args) {
      Bicchiere b = new Bicchiere();
      b.forma="il calice";
      b.resistenza=6.0;
      b.durezza=7;
      b.capienza=40;
      b.livello=0;
      b.colore="trasparente";
      b.materiale="vetro";
      System.out.println(b);
      b.riempi("coca cola",30);
      System.out.println(b);
      b.riempi("birra",30);
      System.out.println(b);
      b.svuota(100);
      System.out.println(b);
    }
    
}
