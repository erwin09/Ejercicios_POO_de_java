package calculadorasimple;

public class Operaciones extends Numero{

    public Operaciones(int numero1, int numero2) {
        super(numero1, numero2);
    }   

    
    public int suma() {
        int aux = getNumero1() + getNumero2();
        return aux;
    }

    public int resta() {
        int aux = getNumero1() - getNumero2();
        return aux;
    }
    
    public int multiplicacion() {
        int aux = getNumero1() * getNumero2();
        return aux;
    }
    
    public int division() {
        int aux = getNumero1() / getNumero2();
        return aux;
    }
    
}
