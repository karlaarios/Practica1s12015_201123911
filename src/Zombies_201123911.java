//Este es el constructor de la clase

public class Zombies_201123911 {
    public static int PosX, PosY,Tipo;
    public Zombies_201123911 ZombieAnterior;
    public Zombies_201123911 ZombieSiguiente;
    
    public Zombies_201123911(int PosX,int PosY, int Tipo ){
        this.PosX=PosX;
        this.PosY=PosY;
        this.Tipo=Tipo;
        
    }
    
    public void ActualizarDatos(int PosX,int PosY, int Tipo){
        this.PosX=PosX;
        this.PosY=PosY;
        this.Tipo=Tipo;
    }
    //Retorna cual es el siguiente nodo 
    
public Zombies_201123911 getZombieSiguiente(){
        return this.ZombieSiguiente;
    }
    //Retorna cual es el anterior nodo 
    public Zombies_201123911 getZombieAnterior(){
        return this.ZombieAnterior;
    }      
    //Enlaza la actual con el siguiente
    public void EnlazarZombieSiguiente(Zombies_201123911 PlantaSiguiente){
        this.ZombieSiguiente=PlantaSiguiente;                
    }    
    //Enlaza la planta actual con el anterior
    public void EnlazarZombieAnterior(Zombies_201123911 PlantaAnterior){
        this.ZombieSiguiente=PlantaAnterior;                
    }    
    public int getTipo(){
        return Tipo;
    }
   public int getPosX(){
       return PosX;
   }
    

    /**
     * @return the Apellido
     */
    public int PosY() {
        return PosY;
    }

}
