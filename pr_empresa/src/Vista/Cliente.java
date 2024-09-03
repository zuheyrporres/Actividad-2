/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author zuhey
 */
public class Cliente extends Personas {
    private String nit;

    public Cliente() {}
     
    public Cliente(String nit, String nombres, String apellidos,String direccion, String telefono, String fecha){
        super(nombres, apellidos, direccion, telefono, fecha);
        this.nit = nit;
        
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    @Override
 
    protected String [] crear() {
        try {
            // todo el codigo
            String datos[] = new String[6];
            datos[0] = this.getNit();
            datos[0] = this.getNombres();
            datos[0] = this.getApellidos();
            datos[0] = this.getDireccion();
            datos[0] = this.getTelefono(); 
            datos[0] = this.getFecha();
            return datos; // para devolver el array de datos
        }catch (Exception ex) {
                // mensaje de error
                System.out.println("Hay un problema: " + ex.getMessage());
                return null;
                }
    }
}
