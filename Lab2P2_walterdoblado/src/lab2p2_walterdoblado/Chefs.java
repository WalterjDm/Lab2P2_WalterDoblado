/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_walterdoblado;

/**
 *
 * @author walter
 */
public class Chefs {

    private String nomChef;
    private int edadChef;
    private String turno;

    private int numMichelin;
    private int sueldoChef;

    public Chefs(String nomChef, int edadChef, String turno, int numMichelin, int sueldoChef) {
        this.nomChef = nomChef;
        this.edadChef = edadChef;
        this.turno = turno;

        this.numMichelin = numMichelin;
        this.sueldoChef = sueldoChef;
    }

    public String getNomChef() {
        return nomChef;
    }

    public void setNomChef(String nomChef) {
        this.nomChef = nomChef;
    }

    public int getEdadChef() {
        return edadChef;
    }

    public void setEdadChef(int edadChef) {
        this.edadChef = edadChef;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    

    public int getNumMichelin() {
        return numMichelin;
    }

    public void setNumMichelin(int numMichelin) {
        this.numMichelin = numMichelin;
    }

    public int getSueldoChef() {
        return sueldoChef;
    }

    public void setSueldoChef(int sueldoChef) {
        this.sueldoChef = sueldoChef;
    }

    @Override
    public String toString() {
        return "Chefs{" + "nombre del chef es: " + nomChef + ""
                + "\n edad del chef es: " + edadChef + ""
                + "\n su turno es: " + turno + ""
                + "\n su numero de estrellas es: " + numMichelin + ","
                + "\nsueldoChef=" + sueldoChef + '}';
    }
    

}
