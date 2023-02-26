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
        private int newChannel1 = this.canal;
        private boolean state3 = this.estado;
        if (newChannel1 < 121 && state3 == true){
            this.canal++;
        }
    }
    public void canalDown(){
        private int newChannel2 = this.canal;
        private boolean state3 = this.estado;
        if (newChannel2 > 0 && state3 == true){
            this.canal--;
        }
    }
//++++++++++metodo para cambiar volumen+++++++++++++
    public void volumenUp(){
        private int newNumber1 = this.volumen;
        private boolean state1 = this.estado;
        if (newNumber1 <= 7  && state1 == true){
            this.volumen++;
        }
    }
    public void volumenDown(){
        private int newNumber2 = this.volumen;
        private boolean state2 = this.estado;
        if (newNumber2 >= 0 && state2 == true){
            this.volumen--;
        }
    }
}
//+++++++++++++++++++++++++++++++++++++++++++++++++
