//Este es el constructor de la clase

public class Plantas_201123911 {
    public static int Punteo;
    public static String NombreP, Tipo;
    public Plantas_201123911 PlantaAnterior;
    public Plantas_201123911 PlantaSiguiente;
    
    public Plantas_201123911(String NombreP, String Tipo, int Punteo ){
        this.NombreP=NombreP;
        this.Tipo=Tipo;
        this.Punteo=Punteo;
        
    }
    
    public void ActualizarDatos(String NombreP, String Tipo, int Punteo){
       this.NombreP=NombreP;
        this.Tipo=Tipo;
        this.Punteo=Punteo;
    }
    //Retorna cual es el siguiente nodo 
    
public Plantas_201123911 getPlantaSiguiente(){
        return this.PlantaSiguiente;
    }
    //Retorna cual es el anterior nodo 
    public Plantas_201123911 getPlantaAnterior(){
        return this.PlantaAnterior;
    }      
    //Enlaza la actual con el siguiente
    public void EnlazarPlantaSiguiente(Plantas_201123911 PlantaSiguiente){
        this.PlantaSiguiente=PlantaSiguiente;                
    }    
    //Enlaza la planta actual con el anterior
    public void EnlazarPlantaAnterior(Plantas_201123911 PlantaAnterior){
        this.PlantaSiguiente=PlantaAnterior;                
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
    public String NombreP() {
        return NombreP;
    }

}
