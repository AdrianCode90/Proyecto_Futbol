
package futbol;


public class Medico extends Persona{
    
    private String titulacion;
    private int años_experiencia;

    public Medico(String titulacion, int años_experiencia, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.años_experiencia = años_experiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAños_experiencia() {
        return años_experiencia;
    }
    
    @Override
    public void partidoFutbol(){
        
        System.out.println("Da asistencia en un partido de futbol");
    }
    
    @Override
    public void entrenamiento(){
        
        System.out.println("Da asistencia en un entrenamiento");
    }
    
    public void curarLesion(){
        
        System.out.println("Curar lesion");
    }
}
