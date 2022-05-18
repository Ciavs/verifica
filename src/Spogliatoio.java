public class Spogliatoio extends Thread{
    
    public void spogliati(String nome){       
        
        System.out.println(nome + " :  e' entrato nello spogliatoio");

        try {
            
            Thread.sleep((long)(Math.random() * 1000));
        
        }
        catch (Exception e) {}
        System.out.println(nome + " :  ha finito di cambiarsi");
    
    }

}
