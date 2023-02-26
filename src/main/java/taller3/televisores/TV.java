package taller3.televisores; 

public class TV{
    Marca marca; private int canal = 1; 
    private int precio = 500; private boolean estado;
    private int volumen = 1; Control control;

    private static int numTV;

    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        TV.numTV++;
    }
//+++++++++metodos de acceso a atributos++++++++
    public Marca getMarca(){
        return this.marca;
    }
    public void setMarca(Marca marca){
        this.marca = marca;
    }
//+++++++++++++++++++++++++++++++++++++++++++++++
    public Control getControl(){
        return this.control;
    }
    public void setControl(Control control){
        this.control = control;
    }
//++++++++++++++++++++++++++++++++++++++++++++++
    public int getPrecio(){
        return this.precio;
    }
    public void setPrecio(int num1){
        this.precio = num1;
    }
//+++++++++++++++++++ Volumen ++++++++++++++++++++++++    
    public int getVolumen(){
        return this.volumen;
    }
    public void setVolumen(int num2){
        if (this.estado == true && num2 >= 0 && num2 <= 7){
                this.volumen = num2;
        }
    }
        
    
//++++++++++++++++++++++Canal ++++++++++++++++++++++++++
    public int getCanal(){
        return this.canal;
    }
    public void setCanal(int num3){
        if (this.estado == true && num3 > 0 && num3 < 121){
                this.canal = num3;
        }
    }
        
    
//++++++++++Encendido y apagado +++++++++++++++++++++
    public void turnOn(){
        if (this.estado == false){
            this.estado = true;
        }
    }
    public void turnOff(){
        if (this.estado == true){
            this.estado = false;
        }
    }
    public boolean getEstado(){
        return this.estado;
    }
//++++++++++++metodo para cambiar canal ++++++++++++
    public void canalUp(){
        if (this.canal < 121 && this.estado == true){
            this.canal++;
        }
    }
    public void canalDown(){

        if (this.canal > 0 && this.estado == true){
            this.canal--;
        }
    }
//++++++++++metodo para cambiar volumen+++++++++++++
    public void volumenUp(){

        if (this.volumen <= 7  && this.estado == true){
            this.volumen++;
        }
    }
    public void volumenDown(){

        if (this.volumen >= 0 && this.estado == true){
            this.volumen--;
        }
    }
}
//+++++++++++++++++++++++++++++++++++++++++++++++++
