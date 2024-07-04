package Vista;

public class Cliente {

    private String dni;
    private String apellidos;
    private String direccion;
    private String fecha_nacimiento;
    private CuentaBancaria[] cuentas = new CuentaBancaria[5];

    // constructor vacio
    public Cliente() {
        
    }

    // constructor parametrizado sobrecargado
    public Cliente(String dni, String apellidos) {
        
        this.dni = dni;
        this.apellidos = apellidos;
    }
    
    // constructor completo
    public Cliente(String dni, String apellidos, String direccion, String fecha_nacimiento, CuentaBancaria[] cuentas) {        
        
        this.dni = dni;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.fecha_nacimiento = fecha_nacimiento;
        this.cuentas = cuentas;        
    }

    public void AgregarCuenta(CuentaBancaria nuevaCuenta) throws Exception {
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i] == null) {
                cuentas[i] = nuevaCuenta;
                return;
            }
            throw new Exception("Ya no hay espacio... FIN");
        }
    }
    
    public String MostrarCuenta () {
        String relacionCuentas = "";
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas [i] != null) {
                relacionCuentas += cuentas[i].getNumero_cuenta()+"\n";
            }
        }
        return relacionCuentas;
    }
    
    @Override
    public String toString () {
        return dni + " - " + apellidos + ", " + direccion + "[" + MostrarCuenta() + "]" ;
    }
    
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public CuentaBancaria[] getCuentas() {
        return cuentas;
    }
    public void setCuentas(CuentaBancaria[] cuentas) {
        this.cuentas = cuentas;
    }
}
