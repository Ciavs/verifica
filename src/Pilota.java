public class Pilota extends Thread{
    private String nome;
    private Semaforo sem;
    private Pista p1;
    private Spogliatoio s1;
    private Semaforo semPista;

    public Pilota(String nome, Semaforo semaforo, Pista pista, Spogliatoio spogliatoio, Semaforo semPista){
        this.nome = nome;
        this.p1 = pista;
        this.sem = semaforo;
        this.s1 = spogliatoio;
        this.semPista = semPista;
    }

    public void run(){
        sem.P();
        s1.spogliati(nome);
        sem.V();
        semPista.P();
        p1.entraInPista(nome);
        semPista.V();
        sem.P();
        s1.spogliati(nome);
        sem.V();
        
    }
}
