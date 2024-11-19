package persona;

public class UsaDipendente{
    public static void main(String[] args){
        Dipendente temp;
        Dipendente[] dipendenti = new Dipendente[3];
        dipendenti[0] = new Dipendente("mauro","bergamo",2016,1950);
        dipendenti[1] = new Dipendente("mirko","spino",2007,2000);
        dipendenti[2] = new Dipendente("marco","algua",1999,2100);
        for (int i = 0; i<dipendenti.length-1;i++){
            for (int j = 0; j< dipendenti.length-1-i;j++){
                if (dipendenti[j+1].guadagnaDiPiu(dipendenti[j])){
                    temp=dipendenti[j];
                    dipendenti[j]=dipendenti[j+1];
                    dipendenti[j+1]=temp;
                }
            }
        }
        for (int i = 0; i<dipendenti.length;i++){
            System.out.println(dipendenti[i].toString());
        }

    }
}