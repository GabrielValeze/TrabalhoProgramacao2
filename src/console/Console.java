// Trabalho apresentado por Fernando Masuda RA 120074 e Gabriel Valeze RA 120138

package console;

public class Console {

    private boolean isOn;
    private boolean estaAberta;
    private boolean memory;
    private boolean controleUm;
    
    public Console(boolean isOn, boolean estaAberta, boolean memory, boolean controleUm){
        this.isOn = isOn;
        this.estaAberta = estaAberta;
        this.memory = memory;
        this.controleUm = controleUm;
    }

    public Console() {
        this.isOn = false;
        this.estaAberta = false;
        this.memory = false;
        this.controleUm = false;
    }

//    Console console1;
    public void ligar() {

        if (IsOn() == false) {
            // vai ligar
            setLigar(true);
        } else if (IsOn() == true) {
            // vai desligar
            setLigar(false);
        }
    }
    
    public void inserirMemoria(){
        if(memory() == false){
            setMemoryCard(true);
        } else if(memory() == true){
            setMemoryCard(false);
        }
    }
    
    
    public void abrirTampa(){
        if(estaAberta() == false){
            //vai abrir
            setTampaDoDisco(true);
        } else if(estaAberta()== true){
            // vai fechar
            setTampaDoDisco(false);
        }
    }
    
    public void inserirControle(){
        if(controleUm() == false){
            setControle(true);
        } else if(controleUm() == true){
            setControle(false);
        }
    }
    
    public boolean memory(){
        return memory;
    }
    
    public boolean IsOn() {
        return isOn;
    }
    
    public boolean estaAberta(){
        return estaAberta;
    }
    
    public boolean controleUm(){
        return controleUm;
    }
    
    public boolean tampaDoDisco(){
        return estaAberta;
    }

    public void setLigar(boolean ligar) {
        this.isOn = ligar;
    }

    public boolean isTampaDoDisco() {
        return estaAberta;
    }

    public void setTampaDoDisco(boolean tampaDoDisco) {
        this.estaAberta = tampaDoDisco;
    }

    public boolean isMemoryCard() {
        return memory;
    }

    public void setMemoryCard(boolean MemoryCard) {
        this.memory = MemoryCard;
    }

    public boolean isControle() {
        return controleUm;
    }

    public void setControle(boolean controle) {
        this.controleUm = controle;
    }
    
}
