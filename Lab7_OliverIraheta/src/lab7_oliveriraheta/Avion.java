
package lab7_oliveriraheta;


public class Avion {
    public String[] modelo = new String[3];
    public String[] codigo = new String[3];
    public int[] anio = new int[3];
    public int[] cap = new int[3];
    public int[] peso = new int[3];
    public String[] aero = new String[3];

    public String getModelo(int x) {
        return modelo[x];
    }

    public void setModelo(String[] modelo,int x) {
        this.modelo[x] = modelo[x];
    }

    public String[] getCodigo() {
        return codigo;
    }

    public void setCodigo(String[] codigo) {
        this.codigo = codigo;
    }

    public int[] getAnio() {
        return anio;
    }

    public void setAnio(int[] anio) {
        this.anio = anio;
    }

    public int[] getCap() {
        return cap;
    }

    public void setCap(int[] cap) {
        this.cap = cap;
    }

    public int[] getPeso() {
        return peso;
    }

    public void setPeso(int[] peso) {
        this.peso = peso;
    }

    public String[] getAero() {
        return aero;
    }

    public void setAero(String[] aero) {
        this.aero = aero;
    }

   
   
}
