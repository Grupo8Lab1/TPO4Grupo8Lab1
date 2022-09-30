package TPO4_class;

import Vistas.FormularioDeAlumnos;
import java.util.HashSet;

public class TPO4Grupo8Lab1 {

    public static HashSet<Materia> listaMaterias = new HashSet();
    public static HashSet<Alumno> listaAlumnos = new HashSet();

    public static void main(String[] args) {

        FormularioDeAlumnos form = new FormularioDeAlumnos();
        form.setVisible(true);

        Materia m1 = new Materia(1, "Ingles 1", 1);
        Materia m2 = new Materia(2, "Matematicas", 1);
        Materia m3 = new Materia(3, "Laboratorio", 1);

        listaMaterias.add(m1);
        listaMaterias.add(m2);
        listaMaterias.add(m3);

        Alumno a1 = new Alumno(1001, "Lopez", "Martin");
        Alumno a2 = new Alumno(1002, "Martinez", "Brenda");
        listaAlumnos.add(a1);
        listaAlumnos.add(a2);

    }

}
