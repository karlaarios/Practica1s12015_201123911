//Este es el constructor de la clase

public class Zombies_201123911 {
    public static int Punteo;
    public static String NombreZ, Tipo;
    public Zombies_201123911 ZombieAnterior;
    public Zombies_201123911 ZombieSiguiente;
    
    public Zombies_201123911(String NombreP, String Tipo, int Punteo ){
        this.NombreZ=NombreP;
        this.Tipo=Tipo;
        this.Punteo=Punteo;
        
    }
    
    public void ActualizarDatos(String NombreZ, String Tipo, int Punteo){
        this.NombreZ=NombreZ;
        this.Tipo=Tipo;
        this.Punteo=Punteo;
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
    public String getTipo(){
        return Tipo;
    }
   public int getPunteo(){
       return Punteo;
   }
    

    /**
     * @return the Apellido
     */
    public String NombreZ() {
        return NombreZ;
    }

}
