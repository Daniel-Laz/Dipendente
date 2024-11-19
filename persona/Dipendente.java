package persona;
public class Dipendente extends Persona{
    private int annoAssunzione;
    private int stipendio;
    
    public Dipendente(){}
    public Dipendente(String nome, String indirizzo, int annoAssunzione, int stipendio){
        super(nome,indirizzo);
        this.annoAssunzione=annoAssunzione;
        this.stipendio=stipendio;
    }

    public void setAnnoAssunzione(int annoAssunzione){
        this.annoAssunzione=annoAssunzione;
    }
    public void setStipendio(int stipendio){
        this.stipendio=stipendio;
    }

    public int getAnnoAssunzione(){
        return annoAssunzione;
    }
    public int getStipendio(){
        return stipendio;
    }

    public boolean guadagnaDiPiu(Dipendente d){
        if (d.getStipendio()>this.stipendio){
            return false;
        }else return true;
    }

    public boolean equals(Object o){
        if (o instanceof Dipendente){
            Dipendente d = (Dipendente) o;
            if (super.equals(d)&&this.annoAssunzione==d.annoAssunzione&&this.stipendio==d.stipendio){
                return true;
            }
        }
        return false;
    }
    public String toString(){
        return super.toString()+" - stipendio: "+stipendio+" - anno di assunzione: "+annoAssunzione;
    }
}