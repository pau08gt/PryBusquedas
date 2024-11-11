public class Jugador {
    private int codigo;
    private String nombre;
    private float rendimiento;
    private String posicion;
    private float sueldo;

    public Jugador(int codigo, String nombre, float rendimiento, String posicion, float sueldo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.rendimiento = rendimiento;
        this.posicion = posicion;
        this.sueldo = sueldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(float rendimiento) {
        this.rendimiento = rendimiento;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Jugador " +
                "Codigo: " + codigo +
                "Nombre: " + nombre +
                "Rendimiento: " + rendimiento +
                "Posicion: " + posicion +
                "Sueldo: " + sueldo+"\n";
    }
}
