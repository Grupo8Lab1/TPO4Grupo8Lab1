package TPO4_class;

import Vistas.FormularioDeAlumnos;
import java.util.HashMap;

public class TPO4Grupo8Lab1 {

    public static void main(String[] args) {

        HashMap<Integer, Materia> listaMaterias = new HashMap();
        HashMap<Integer, Alumno> listaAlumnos = new HashMap();

        Materia m1 = new Materia(1, "Ingles 1", 1);
        Materia m2 = new Materia(2, "Matematicas", 1);
        Materia m3 = new Materia(3, "Laboratorio 1", 1);

        listaMaterias.put(m1.getIdMateria(), m1);
        listaMaterias.put(m2.getIdMateria(), m2);
        listaMaterias.put(m3.getIdMateria(), m3);

        Alumno a1 = new Alumno(1001, "Lopez", "Martin",listaMaterias);
        Alumno a2 = new Alumno(1002, "Martinez", "Brenda",listaMaterias);

        listaAlumnos.put(a1.getLegajo(), a1);
        listaAlumnos.put(a2.getLegajo(), a2);

        System.out.println(listaAlumnos);

        System.out.println(listaMaterias);

        FormularioDeAlumnos form = new FormularioDeAlumnos(listaAlumnos, listaMaterias);

        form.setVisible(true);

    }

}
