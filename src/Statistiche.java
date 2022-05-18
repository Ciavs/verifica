
public class Statistiche extends Thread implements Comparable<Statistiche>{
    
    private String nome;
    private int tempo;

    public Statistiche(String nome, int tempo ){
        this.tempo = tempo;
        this.nome = nome;
    }

    public int getTempo() {
        return tempo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Statistiche o) {
        if(this.getTempo() > o.getTempo()) return 1;
        if(this.getTempo() < o.getTempo())return -1;
        return 0;
    }

    
}