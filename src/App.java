public class App {
    public static void main(String[] args) throws Exception {
        
        Semaforo sem = new Semaforo(2);
        Pista pista = new Pista();
        Spogliatoio spogliatoio = new Spogliatoio();
        Semaforo semPista = new Semaforo(4);
        

        Pilota p1 = new Pilota("lorenzo", sem, pista, spogliatoio, semPista);
        Pilota p2 = new Pilota("antonio", sem, pista, spogliatoio, semPista);
        Pilota p3 = new Pilota("cesare", sem, pista, spogliatoio, semPista);
        Pilota p4 = new Pilota("duilio", sem, pista, spogliatoio, semPista);
        Pilota p5 = new Pilota("emma", sem, pista, spogliatoio, semPista);
        Pilota p6 = new Pilota("ilaria", sem, pista, spogliatoio, semPista);
        Pilota p7 = new Pilota("alessia", sem, pista, spogliatoio, semPista);
        Pilota p8 = new Pilota("irene", sem, pista, spogliatoio, semPista);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();

        p1.join();
        p2.join();
        p3.join();
        p4.join();
        p5.join();
        p6.join();
        p7.join();
        p8.join();

        pista.classifica();
    }
}
