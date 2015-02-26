//Este es el constructor de la clase

public class Plantas_201123911 {
    public static int PosX, PosY,Tipo;
    public Zombies_201123911 PlantaAnterior;
    public Zombies_201123911 PlantaSiguiente;
    
    public Plantas_201123911(int PosX,int PosY, int Tipo ){
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
    
public Zombies_201123911 getPlantaSiguiente(){
        return this.PlantaSiguiente;
    }
    //Retorna cual es el anterior nodo 
    public Zombies_201123911 getPlantaAnterior(){
        return this.PlantaAnterior;
    }      
    //Enlaza la actual con el siguiente
    public void EnlazarPlantaSiguiente(Zombies_201123911 PlantaSiguiente){
        this.PlantaSiguiente=PlantaSiguiente;                
    }    
    //Enlaza la planta actual con el anterior
    public void EnlazarPlantaAnterior(Zombies_201123911 PlantaAnterior){
        this.PlantaSiguiente=PlantaAnterior;                
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
