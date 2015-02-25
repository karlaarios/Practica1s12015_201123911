


import java.util.logging.Level;
import java.util.logging.Logger;


public class Proceso_201123911 extends Thread{
    
    @Override
    public void run(){
            
        for(int x=Tablero_201123911.posA;x<Tablero_201123911.posicionesMov;x++){
                Tablero_201123911.JugadorA.setLocation(x, Tablero_201123911.JugadorA.getY());
                try {
                    sleep(20);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Proceso_201123911.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        for(int y=0;y<Tablero_201123911.y;y++){
                Tablero_201123911.JugadorA.setLocation(Tablero_201123911.JugadorA.getX(), y);
                try {
                    sleep(35);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Proceso_201123911.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    
}
