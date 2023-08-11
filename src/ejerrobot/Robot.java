
package ejerrobot;

public class Robot {
    
    private Bateria bateria;
    private int numeroSerie;
    private boolean despierto;

    public Robot(int numeroSerie) {
        this.numeroSerie = numeroSerie;
        this.bateria = new Bateria();
        this.despierto = true;
    }    
    
    public void robotAvanzar(int pasos){
        if (this.despierto){
            this.bateria.avanza(pasos);
        }                
    }
    
    public void robotRetroceder(int pasos){
        if (this.despierto){
            this.bateria.avanza(pasos);
        }       
    }
    
    public void dormir(){
        this.despierto = false;
    }
    
    public void despertar(){
        this.despierto = true;        
    }
    
    public void recargar(){
        this.bateria.carga();
    }  
    
    
    
    
}
