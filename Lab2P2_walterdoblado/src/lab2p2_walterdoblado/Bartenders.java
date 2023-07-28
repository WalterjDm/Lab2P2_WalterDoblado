package lab2p2_walterdoblado;

public class Bartenders {

    private String nomBart;
    private int edadBart;
    private String turno;

    private double sueldoBart;
    private int numLic;

    public Bartenders(String nomBart, int edadBart, String turno, double sueldoBart, int numLic) {
        this.nomBart = nomBart;
        this.edadBart = edadBart;
        this.turno = turno;
        this.sueldoBart = sueldoBart;
        this.numLic = numLic;
    }

    public String getNomBart() {
        return nomBart;
    }

    public void setNomBart(String nomBart) {
        this.nomBart = nomBart;
    }

    public int getEdadBart() {
        return edadBart;
    }

    public void setEdadBart(int edadBart) {
        this.edadBart = edadBart;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getSueldoBart() {
        return sueldoBart;
    }

    public void setSueldoBart(double sueldoBart) {
        this.sueldoBart = sueldoBart;
    }

    public int getNumLic() {
        return numLic;
    }

    public void setNumLic(int numLic) {
        this.numLic = numLic;
    }

    @Override
    public String toString() {
        return "-Bartenders son : " + ""
                + "\n nombre: " + nomBart + ""
                + "\n su edad es: " + edadBart + ""
                + "\n su turno es: " + turno + ""
                + "\n su sueldo es: " + sueldoBart + ""
                + "\n y la cantidad de licor disponible es: " + numLic
                + "\n\n ";
    }

}
