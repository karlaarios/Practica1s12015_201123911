
import javax.swing.JLabel;

public class Casillas_2011239111 extends JLabel{

    String Posicion="";
    int IntNumero = 0;

    public Casillas_2011239111(){

    }

    public Casillas_2011239111(String Posicion, int intNumero){

        this.IntNumero = intNumero;
        this.Posicion = Posicion;

    }

    public void setNumero(String Posicion){
        this.Posicion = Posicion;
    }

    public int getNumero(){
        return IntNumero;
    }

    /**
     * descripipcion del metodo
     * @return strNombre, algo mas
     */
    public String getPosicion(){
        return Posicion;
    }


}
