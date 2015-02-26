
public class ListadoPlantas_201123911 {
    public static Plantas_201123911 PrimerPlanta=null;
    public Plantas_201123911 PlantaActual=null;
    public static Plantas_201123911 UltimaPlanta=null;
    
    public ListadoPlantas_201123911(){
     PrimerPlanta=null;
     UltimaPlanta=null;
     PlantaActual=PrimerPlanta;
    }

    public void Agregar(Plantas_201123911 PlantasAgregar){
        Plantas_201123911 NodoAgregar= PlantasAgregar;
        if(this.PrimerPlanta==null){
            this.PrimerPlanta=NodoAgregar;
            this.PrimerPlanta.EnlazarPlantaAnterior(null);
            this.PrimerPlanta.EnlazarPlantaSiguiente(null);
        }
        else{
            Plantas_201123911 PlantaActual=this.PrimerPlanta;
            while(PlantaActual.getPlantaSiguiente()!=null){
                PlantaActual= PlantaActual.getPlantaSiguiente();                
            }
           PlantaActual.EnlazarPlantaSiguiente(NodoAgregar);
           NodoAgregar.EnlazarPlantaAnterior(PlantaActual);
           NodoAgregar.EnlazarPlantaSiguiente(null);
        }
    }
    //Retorna cual es el siguiente nodo 
    public void getPlantaSiguiente(){
        if(PlantaActual!=null){
            if((PlantaActual.getPlantaSiguiente())!=null){
            PlantaActual=PlantaActual.getPlantaSiguiente();
            }
        }else{
            PlantaActual=PrimerPlanta;
        }
    }
    //Retorna cual es el anterior nodo 
    public void getPlantaAnterior(){
        if(PlantaActual!=null){
            if((PlantaActual.getPlantaAnterior())!=null){
            PlantaActual=PlantaActual.getPlantaAnterior();
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
            if(PlantaActual.PlantaSiguiente==null){
                
            }else{
                PlantaActual=PlantaActual.PlantaSiguiente;
            }
        }
    }
    
    public void PlantaAnterior(){
        if(PlantaActual==null){
            PlantaActual=UltimaPlanta;
        }else{
            if(PlantaActual.PlantaAnterior==null){
                
            }else{
                PlantaActual=PlantaActual.PlantaAnterior;
            }
        }

    }
}
