package br.edu.ifpr.paranavai.armarios;

public class Bibliotecario {
    private String siape;
    
    public Bibliotecario(){
    
    }
    public Bibliotecario(String siape){
        this.siape = siape;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }
}
