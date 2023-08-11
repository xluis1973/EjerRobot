
package ejerrobot;

public class Bateria {
    private String tipoBateria;
    private int carga;
    
    public Bateria(){    
        this.carga=1000;         
    }
    
    public void avanza(int pasos){
        this.carga -= pasos;
    }
    
    public void carga(){
        this.carga = 1000;
    }
    
    
    

    public String getTipoBateria() {
        return tipoBateria;
    }

    public void setTipoBateria(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

   
    
    
}
