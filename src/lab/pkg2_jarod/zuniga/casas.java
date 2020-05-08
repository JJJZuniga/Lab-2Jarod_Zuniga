
package lab.pkg2_jarod.zuniga;

/**
 *
 * @author Jhon Zuniga
 */
public class casas {
    private int num_casa;
    private int num_bloque;
    private String color;
    private int largo;
    private int ancho;
    private boolean comprada;
    private int num_pisos;
    private int num_baños;
    private int num_cuartos;
    private String dueño;
    private String estado;
    private String ingcargo;

    public casas() {
    }

    public casas(int num_casa, int num_bloque, String color, int largo, int ancho, boolean comprada, int num_pisos, int num_baños, int num_cuartos, String dueño, String estado, String ingcargo) {
        this.num_casa = num_casa;
        this.num_bloque = num_bloque;
        this.color = color;
        this.largo = largo;
        this.ancho = ancho;
        this.comprada = comprada;
        this.num_pisos = num_pisos;
        this.num_baños = num_baños;
        this.num_cuartos = num_cuartos;
        this.dueño = dueño;
        this.estado = estado;
        this.ingcargo = ingcargo;
    }

    public int getNum_casa() {
        return num_casa;
    }

    public void setNum_casa(int num_casa) {
        this.num_casa = num_casa;
    }

    public int getNum_bloque() {
        return num_bloque;
    }

    public void setNum_bloque(int num_bloque) {
        this.num_bloque = num_bloque;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public boolean getComprada() {
        return comprada;
    }

    public void setComprada(boolean comprada) {
        this.comprada = comprada;
    }

    public int getNum_pisos() {
        return num_pisos;
    }

    public void setNum_pisos(int num_pisos) {
        this.num_pisos = num_pisos;
    }

    public int getNum_baños() {
        return num_baños;
    }

    public void setNum_baños(int num_baños) {
        this.num_baños = num_baños;
    }

    public int getNum_cuartos() {
        return num_cuartos;
    }

    public void setNum_cuartos(int num_cuartos) {
        this.num_cuartos = num_cuartos;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIngcargo() {
        return ingcargo;
    }

    public void setIngcargo(String ingcargo) {
        this.ingcargo = ingcargo;
    }

    @Override
    public String toString() {
        return "numero de casa=" + num_casa + ", numero de bloque=" + num_bloque + ", color=" + color + ", largo=" + largo + ", ancho=" + ancho + ", comprada=" + comprada + ", numeros de pisos=" + num_pisos + ", numperos de baños=" + num_baños + ", numero de cuartos=" + num_cuartos + ", dueño=" + dueño + ", estado=" + estado + ", ingeniero encargado=" + ingcargo;
    }
    
    
    
           
            }
