package lab2p2_walterdoblado;

public class Meseros {

    private String nomMese;
    private int edadMes;
    private String turno;

    private double sueldomese;
    private double propmese;

    public Meseros(String nomMese, int edadMes, String turno, double sueldomese, double propmese) {
        this.nomMese = nomMese;
        this.edadMes = edadMes;
        this.turno = turno;
        this.sueldomese = sueldomese;
        this.propmese = propmese;
    }

    public String getNomMese() {
        return nomMese;
    }

    public void setNomMese(String nomMese) {
        this.nomMese = nomMese;
    }

    public int getEdadMes() {
        return edadMes;
    }

    public void setEdadMes(int edadMes) {
        this.edadMes = edadMes;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getSueldomese() {
        return sueldomese;
    }

    public void setSueldomese(double sueldomese) {
        this.sueldomese = sueldomese;
    }

    public double getPropmese() {
        return propmese;
    }

    public void setPropmese(double propmese) {
        this.propmese = propmese;
    }

    @Override
    public String toString() {
        return "Meserosson :" + ""
                + "\nomMese=" + nomMese + ""
                + "\n edadMes=" + edadMes + ""
                + "\n turno=" + turno + ""
                + "\n sueldomese=" + sueldomese + ""
                + "\n propmese=" + propmese ;
    }

}
