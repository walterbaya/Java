
import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Persona implements Serializable {

    @Column(name = "codigo")
    @Id
    private int codigo;
    private String nombre;
    private String apellido;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

}
