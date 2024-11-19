package persona;

public class Persona{
    private String nome;
    private String indirizzo;

    public String getNome(){
        return nome;
    }
    public String getIndirizzo(){
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo){
        this.indirizzo=indirizzo;
    }

    public void visualizza(){
        System.out.print("\nnome: "+nome+" - indirizzo: "+indirizzo);
    }

    public Persona(){}
    
    public String toString(){
        return "nome: "+nome+" - indirizzo: "+indirizzo;
    }

    public Persona(String nome, String indirzzo){
        this.nome=nome;
        this.indirizzo=indirzzo;
    }
}