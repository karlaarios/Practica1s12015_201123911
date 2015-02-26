
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Casillas_201123911 extends JLabel{

    String Posicion="";
    int IntNumero = 0;
    ImageIcon icono;
    public Casillas_201123911(){

    }

    public Casillas_201123911(String Posicion, int intNumero){

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
