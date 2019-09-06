package es.alejandro.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.DatabaseMetaData;
import java.util.Date;


@Entity
@Table(name = "USUARIOS")
public class Usuarios implements Serializable {

    @Column(name = "CREATE_TIME")
    private Date create_time;

    @Column(name = "DIRECCION")
    private String direccion;

    @Column(name = "DNI")
    private String dni;

    @Column(name = "EMAIL")
    private String email;

    @Id
    @Column(name = "IDUSUARIOS")
    private int idUsuarios;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "TELEFONO")
    private String telefono;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "APELLIDO")
    private String apellido;

    public Usuarios(){

    }
    public Usuarios(Date create_time, String direccion, String dni, String email, int idUsuarios, String nombre, String password, String telefono, String username, String apellido){
        this.create_time= create_time;
        this.direccion= direccion;
        this.dni= dni;
        this.email= email;
        this.idUsuarios = idUsuarios;
        this.nombre= nombre;
        this.password= password;
        this.telefono= telefono;
        this.username= username;
        this.apellido= apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuario(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
