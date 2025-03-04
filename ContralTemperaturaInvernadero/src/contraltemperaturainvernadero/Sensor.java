package contraltemperaturainvernadero;

public class Sensor extends Temperatura {

    public Sensor(double temp) {
        super(temp);
    }

    public void cuentaRegresiva() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "...");

        }

    }

    public void validarTemperatura() {

        if (getTemp() <= 10) {
            System.out.println("¡Se activo el calefactor!");
        } else if (getTemp() > 10 && getTemp() <=25) {
            System.out.println("¡Sistema desactivado!");
        } else {
            System.out.println("¡Se activo el ventilador!");
        }
    }

}
