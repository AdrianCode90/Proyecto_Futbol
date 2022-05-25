
package futbol;

import java.util.ArrayList;
import java.util.Scanner;


public class Principal {

      
    public static void main(String[] args) {
        
        ArrayList<Persona> persona = new ArrayList<>(); //ALMACENO TODAS LAS PERSONAS EN ESTE ARRAYLIST
    
        Persona futbolista_uno = new Futbolista(9, "Delantero", "Gonzalo", "Higuain", 29);
        Persona futbolista_dos = new Futbolista(21, "Delantero", "Paulo", "Dybala", 23);
        Persona entrenador = new Entrenador("Defensiva", "Maximiliano", "Allegri", 50);
        Persona medico = new Medico("Licenciado en Fisioterapia", 25, "Alex", "Marrone", 55);
     
        persona.add(futbolista_uno);
        persona.add(futbolista_dos);
        persona.add(entrenador);
        persona.add(medico);
    
        Scanner entrada = new Scanner(System.in);
        
        int opcion;
        
        do {            
            
            System.out.println("\t--------MENU--------");
            System.out.println();
            System.out.println("1. ViAJE DE EQUIPO");
            System.out.println("2. ENTRENAMIENTO");
            System.out.println("3. PARTIDO DE FUTBOL");
            System.out.println("4. MODIFICAR ENTRENAMIENTO");
            System.out.println("5. ENTREVISTA");
            System.out.println("6. CURAR LESION");
            System.out.println("7. SALIR");
            System.out.println();
            
            System.out.print("Digite la opcion: ");
            opcion = entrada.nextInt();
            
            
            
            switch(opcion){
                
                case 1:
                    
                    
                    /*for (int i = 0; i < persona.size(); i++) {   //OTRA FORMA DE HACERLO
            
                     Persona pers = persona.get(i);
            
                     System.out.print(pers.getNombre()+ " " + pers.getApellido() + " -> ");
                     pers.viajar();
                   }*/
                    
                    System.out.println();
                    
                    for (Persona equipo : persona) {
                
                        System.out.print(equipo.getNombre()+ " " +equipo.getApellido()+ " -> ");
                        equipo.viajar();
        }
                    break;
                
                case 2:
                
                    System.out.println();
                    
                    for (Persona equipo : persona) {
            
                    System.out.print(equipo.getNombre()+ " " +equipo.getApellido()+ " -> ");
                    equipo.entrenamiento();
        }
                    break;
                
                case 3:
                    
                    System.out.println();
                    for (Persona equipo : persona) {
            
                    System.out.print(equipo.getNombre()+ " " +equipo.getApellido()+ " -> ");
                    equipo.partidoFutbol();
        }
                    break;
                
                case 4:
                    
                    System.out.println();
                    System.out.print(entrenador.getNombre()+ " "+entrenador.getApellido()+ " -> ");
                    Entrenador e = (Entrenador) entrenador; //ENTRENADOR ES UNA PERSONA Y NO PUEDO ACCEDER AL METODO planificarEntrenamiento POR ESO LO TRANSFORMO NUEVAMENTE EN OBJERO ENTRENADOR
                    e.planificarEntrenamiento();
                    
                    break;
               
                case 5:
                    
                    System.out.println();
                    System.out.print(futbolista_uno.getNombre()+" "+futbolista_uno.getApellido()+" -> ");
                    Futbolista q = (Futbolista) futbolista_uno;
                    q.entrevista();
                    System.out.print(futbolista_dos.getNombre()+" "+futbolista_dos.getApellido()+" -> ");
                    Futbolista f = (Futbolista) futbolista_dos;
                    f.entrevista();
                    break;
               
                case 6:
                    
                    System.out.println();
                    System.out.print(medico.getNombre()+" "+medico.getApellido()+" -> ");
                    Medico m = (Medico) medico;
                    m.curarLesion();
                    break;
               
                case 7:
                   
                    System.out.println("Saliste del menu");
                    
                    break;
                    
                default:
                       
                    System.out.println("ERROR, se equivoco de opcion de menu");
                        
                    break;
            }
            
            System.out.println();
            
        } while (opcion != 7);
        
    }
    
}
