
package sistemadereservas;


public class Persona {
    
    private String Nombre;
    private int Documento;

    public Persona(String datoNombre, int datoDocumento) {
        this.Nombre = datoNombre;
        this.Documento = datoDocumento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDocumento() {
        return Documento;
    }

    public void setDocumento(int Documento) {
        this.Documento = Documento;
    }
    
}
