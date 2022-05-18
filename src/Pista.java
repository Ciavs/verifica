import java.util.ArrayList;
import java.util.Collections;

public class Pista extends Thread{
    private long inizio;
    private long fine;
    private int temp;
    private ArrayList<Statistiche> lista;

    public Pista(){
        lista = new ArrayList<>();
    }

    public void entraInPista(String nome){
        
        System.out.println(nome + " : e' entrato in pista");
        inizio = System.nanoTime();
        
        for(int i = 0; i < 15; i++){
            
            try {
                Thread.sleep((long)(Math.random()) * 1000);
            }
            catch (Exception e) {}
        
        }

        fine = System.nanoTime();
        
        System.out.println(nome + " : ha finito la gara ");
        
        temp = (int)((fine - inizio)/1000000);
        Statistiche stats = new Statistiche(nome, temp);
        
        for(int i = 0; i < lista.size(); i++){
            
            if(stats.compareTo(lista.get(i)) < 0){
                
                lista.add(stats);
            
            }
        
        }lista.add(stats);

        Collections.sort(lista);
    }

    public synchronized void classifica(){
        
        int k = 1;
            
            for(int i = 0; i < lista.size(); i++){
                
                System.out.println(k + " posizione : " + lista.get(i).getNome() + " con tempo : " + lista.get(i).getTempo());
                k++;
            
            }
    }
}
