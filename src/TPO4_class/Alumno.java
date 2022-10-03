/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPO4_class;

import static TPO4_class.TPO4Grupo8Lab1.listaMaterias;
import java.util.HashSet;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author Santi
 */
public class Alumno {

    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias = new HashSet();

    public HashSet<Materia> getMaterias() {
        return materias;
    }

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public Alumno() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.legajo;
        hash = 79 * hash + Objects.hashCode(this.apellido);
        hash = 79 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.legajo != other.legajo) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        return "Alumno: " + nombre + " " + apellido + ", legajo: " + legajo + ", Materias Inscripto: " + materias+" \n";
    }

    public int getLegajo() {
        return legajo;
    }

    public void agregarMateria(Materia materia) {

        if (this.materias == null) {
            materias.add(materia);
            JOptionPane.showMessageDialog(null, "Alumno inscripto satisfactoriamente.");
        } else if (this.materias.contains(materia)) {
            JOptionPane.showMessageDialog(null, "El alumno ya se encontraba inscripto en esa materia.");
        } else {
            materias.add(materia);
            JOptionPane.showMessageDialog(null, "Alumno inscripto satisfactoriamente.");
        }
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public int cantidadMaterias() {
        return listaMaterias.size();
    }

}
