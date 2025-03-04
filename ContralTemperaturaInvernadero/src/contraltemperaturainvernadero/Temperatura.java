
package contraltemperaturainvernadero;

public class Temperatura {
    
    private double temp ;

    public Temperatura(double temp) {
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
    
    public void mostrarMensaje(){
        System.out.println("La temperatura registrada es: " + temp);
    }
    
    
}
