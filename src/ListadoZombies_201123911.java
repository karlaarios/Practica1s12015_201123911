
public class ListadoZombies_201123911 {
    public static Zombies_201123911 PrimerZombie=null;
    public Zombies_201123911 ZombieActual=null;
    public static Zombies_201123911 UltimoZombie=null;
    
    public ListadoZombies_201123911(){
     PrimerZombie=null;
     UltimoZombie=null;
     ZombieActual=PrimerZombie;
    }

    public void Agregar(Zombies_201123911 PlantasAgregar){
        Zombies_201123911 NodoAgregar= PlantasAgregar;
        if(this.PrimerZombie==null){
            this.PrimerZombie=NodoAgregar;
            this.PrimerZombie.EnlazarZombieAnterior(null);
            this.PrimerZombie.EnlazarZombieSiguiente(null);
        }
        else{
            Zombies_201123911 ZombieActual=this.PrimerZombie;
            while(ZombieActual.getZombieSiguiente()!=null){
                ZombieActual= ZombieActual.getZombieSiguiente();                
            }
           ZombieActual.EnlazarZombieSiguiente(NodoAgregar);
           NodoAgregar.EnlazarZombieAnterior(ZombieActual);
           NodoAgregar.EnlazarZombieSiguiente(null);
        }
    }
    //Retorna cual es el siguiente nodo 
    public void getZombieSiguiente(){
        if(ZombieActual!=null){
            if((ZombieActual.getZombieSiguiente())!=null){
            ZombieActual=ZombieActual.getZombieSiguiente();
            }
        }else{
            ZombieActual=PrimerZombie;
        }
    }
    //Retorna cual es el anterior nodo 
    public void getZombieAnterior(){
        if(ZombieActual!=null){
            if((ZombieActual.getZombieAnterior())!=null){
            ZombieActual=ZombieActual.getZombieAnterior();
            }
        }
        else{
            ZombieActual=PrimerZombie;
        }
    }

       
    public void ZombieSiguiente(){
        if(ZombieActual==null){
            ZombieActual=PrimerZombie;
        }else{
            if(ZombieActual.ZombieSiguiente==null){
                
            }else{
                ZombieActual=ZombieActual.ZombieSiguiente;
            }
        }
    }
    
    public void ZombieAnterior(){
        if(ZombieActual==null){
            ZombieActual=UltimoZombie;
        }else{
            if(ZombieActual.ZombieAnterior==null){
                
            }else{
                ZombieActual=ZombieActual.ZombieAnterior;
            }
        }

    }
}
