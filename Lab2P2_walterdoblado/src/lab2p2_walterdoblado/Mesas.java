
package lab2p2_walterdoblado;


public class Mesas {
    
    private int numPlat;
    private int numUtil;
    private int precio;

    public Mesas(int numPlat, int numUtil, int precio) {
        this.numPlat = numPlat;
        this.numUtil = numUtil;
        this.precio = precio;
    }

    public int getNumPlat() {
        return numPlat;
    }

    public void setNumPlat(int numPlat) {
        this.numPlat = numPlat;
    }

    public int getNumUtil() {
        return numUtil;
    }

    public void setNumUtil(int numUtil) {
        this.numUtil = numUtil;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "en la mesa hay: " + "platos: " + numPlat + ""
                + "\n " + numUtil + "utensilios"
                + "\n y el precio " + precio ;
    }
    
    
    
    
    
    
    
    
}
