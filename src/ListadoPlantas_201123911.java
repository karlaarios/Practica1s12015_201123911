
public class ListadoPlantas_201123911 {
    public static Zombies_201123911 PrimerPlanta=null;
    public Zombies_201123911 PlantaActual=null;
    public static Zombies_201123911 UltimaPlanta=null;
    
    public ListadoPlantas_201123911(){
     PrimerPlanta=null;
     UltimaPlanta=null;
     PlantaActual=PrimerPlanta;
    }

    public void Agregar(Zombies_201123911 PlantasAgregar){
        Zombies_201123911 NodoAgregar= PlantasAgregar;
        if(this.PrimerPlanta==null){
            this.PrimerPlanta=NodoAgregar;
            this.PrimerPlanta.EnlazarZombieAnterior(null);
            this.PrimerPlanta.EnlazarZombieSiguiente(null);
        }
        else{
            Zombies_201123911 PlantaActual=this.PrimerPlanta;
            while(PlantaActual.getZombieSiguiente()!=null){
                PlantaActual= PlantaActual.getZombieSiguiente();                
            }
           PlantaActual.EnlazarZombieSiguiente(NodoAgregar);
           NodoAgregar.EnlazarZombieAnterior(PlantaActual);
           NodoAgregar.EnlazarZombieSiguiente(null);
        }
    }
    //Retorna cual es el siguiente nodo 
    public void getPlantaSiguiente(){
        if(PlantaActual!=null){
            if((PlantaActual.getZombieSiguiente())!=null){
            PlantaActual=PlantaActual.getZombieSiguiente();
            }
        }else{
            PlantaActual=PrimerPlanta;
        }
    }
    //Retorna cual es el anterior nodo 
    public void getPlantaAnterior(){
        if(PlantaActual!=null){
            if((PlantaActual.getZombieAnterior())!=null){
            PlantaActual=PlantaActual.getZombieAnterior();
            }
        }
        else{
            PlantaActual=PrimerPlanta;
        }
    }

       
    public void PlantaSiguiente(){
        if(PlantaActual==null){
            PlantaActual=PrimerPlanta;
        }else{
            if(PlantaActual.ZombieSiguiente==null){
                
            }else{
                PlantaActual=PlantaActual.ZombieSiguiente;
            }
        }
    }
    
    public void PlantaAnterior(){
        if(PlantaActual==null){
            PlantaActual=UltimaPlanta;
        }else{
            if(PlantaActual.ZombieAnterior==null){
                
            }else{
                PlantaActual=PlantaActual.ZombieAnterior;
            }
        }

    }
}
