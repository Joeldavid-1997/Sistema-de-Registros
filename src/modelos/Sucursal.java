
package modelos;

/**
 *
 * @author joarevalos
 */
public class Sucursal {
    
    private int idSucursal;
    private String direccion;
    private String telefono;
    
    //metodo constructor
    public Sucursal(int idSucursal, String direccion, String telefono){
    
        this.idSucursal = idSucursal;
        this.direccion = direccion;
        this.telefono = telefono;
        
    }
    //setter (cargar)
    public void setIdSucursal(int idSucursal){
        this.idSucursal = idSucursal;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    //getter
    public int getIdSucursal(){
        return this.idSucursal;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public String getTelefono(){
        return this.telefono;
    }
    
}
