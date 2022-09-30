package TPO4_class;

import Vistas.FormularioDeAlumnos;
import java.util.ArrayList;

public class TPO4Grupo8Lab1 {

    public static void main(String[] args) {
        FormularioDeAlumnos form = new FormularioDeAlumnos();
        form.setVisible(true);
        
        Materia m=new Materia(1,"Ingles 1", 1);
        Materia n=new Materia(2,"Matematicas", 1);
        Materia o=new Materia(3,"Laboratorio", 1);
        
        ArrayList<Materia> List = new ArrayList();
        List.add(m);
        List.add(n);
        List.add(o);
        
        Alumno a=new Alumno(1001, "Lopez", "Martin");
        Alumno b=new Alumno(1002, "Martinez", "Brenda");
        
       
        
    }
    
}
