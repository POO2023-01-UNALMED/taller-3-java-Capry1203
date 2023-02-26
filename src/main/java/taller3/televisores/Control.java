package taller3.televisores;

public class Control{
    private TV tv;

    public TV getTv(){
        return this.tv;
    }
    public void setTv(TV tv){
        this.tv = tv;
    }

    public void canalUp(){
        tv.canalUp();
    }
    public void canalDown(){
        tv.canalDown();
    }
//++++++++++ Volumen++++++++++
    public void volumenUp(){
        tv.volumenUp();
    }
    public void volumenDown(){
        tv.volumenDown();
    }
//+++++++++ Encendido y apagado++++++

    public void turnOn(){
        tv.turnOn();
    }
    public void turnOff(){
        tv.turnOff();
    }
//++++++++++ set Canal +++++++++

    public void setCanal(int canal){
        tv.setCanal(canal);
    }
//++++++++ Enlace +++++++++++++++

    public void enlazar(TV tv){
        this.tv = tv;
        tv.setControl(this);
    }
    
}