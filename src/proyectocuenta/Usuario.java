package proyectocuenta;

import javax.swing.JOptionPane;

public class Usuario {

    // Atributos
    private String name;
    private String apellidos;
    private String cedula;
    private String correo;

    // Constructor

    public Usuario(String name, String apellidos, String cedula, String correo) {
        this.name = name;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.correo = correo;
    }
    
    // Get && Set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public void despliegaInfo(){
        JOptionPane.showMessageDialog(null,"Eggs are not supposed to be green.","Informacion de usuario",JOptionPane.PLAIN_MESSAGE);
    }

}
