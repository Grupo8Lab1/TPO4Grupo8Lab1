/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPO4_class;

import java.util.ArrayList;
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
    private ArrayList<Materia> materias;

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public Alumno() {
    }

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
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

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "legajo=" + legajo + ", apellido=" + apellido + ", nombre=" + nombre + ", materias=" + materias + '}';
    }

    public void agregarMateria(Materia materia) {

        if (this.materias.contains(materia)) {
            JOptionPane.showMessageDialog(null, "El alumno ya se encontraba inscripto en esa materia.");
        } else {
            JOptionPane.showMessageDialog(null, "Alumno inscripto satisfactoriamente.");
            materias.add(materia);
        }
    }

    public int cantidadMaterias() {
        return materias.size();
    }

}
