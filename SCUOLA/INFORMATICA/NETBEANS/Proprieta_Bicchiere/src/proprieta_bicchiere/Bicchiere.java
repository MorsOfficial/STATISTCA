package proprieta_bicchiere;

public class Bicchiere {
    String materiale,forma,colore,liquido;
    int durezza;
    double resistenza,capienza,livello;
    boolean rotto;
    
    
    double riempi(String liq, double l){
        if(liquido==null||liquido==liq)liquido=liq;
        else liquido="mix";
        livello+=l;
        double strabordo=livello-capienza;
        if(strabordo>0){
            livello=capienza;
            return strabordo;
        }
        return 0;
    }
    
    double lancia(double forza){
        if (forza>resistenza){
            rotto=true;
            capienza=0;
            double cont=livello;
            livello=0;
            return cont;
        }
        return 0;
    }
    
    double svuota(double quantita){
        if(livello>=quantita){
            livello-=quantita;
            return quantita;
        }
        quantita=livello;
        livello=0;
        liquido=null;
        return quantita;
    }
    
    public String toString(){
        if(liquido==null)return forma + " di " + materiale + " è vuoto";
        return forma + " di " + materiale +
               " contiene " + livello + "cc di " + liquido;
        }
    }

