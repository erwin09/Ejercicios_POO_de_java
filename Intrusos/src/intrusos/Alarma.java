
package intrusos;

import java.util.ArrayList;
import java.util.List;

public class Alarma {
    
    int totalSensores = 3;
    private List<Sensor> sensores;

    public Alarma() {
        sensores = new ArrayList<>();
        for (int i = 1; i <= totalSensores; i++) {
            sensores.add(new Sensor(i));
        }
    }
    
    public boolean activarSensor(int num){
         if (num >= 1 && num <= sensores.size()) {
            Sensor sensor = sensores.get(num -1);
            return sensor.activar();
        }
        return false;
    }
    
    public void mostrarMensaje(){
        
        int contador = 0;
        
        for (Sensor sensor : sensores) {
            if (sensor.isAct()== true  ) {
                contador++;
            }
        }
        if (contador >=2 ){
            System.out.println("¡INTRUSO! ¡INTRUSO!");
        }else{
            System.out.println("Sensores en linea, sin novedad");
        }
    }
}
