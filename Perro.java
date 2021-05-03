/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perro;
import javax.swing.JOptionPane;
/**
 *
 * @author pc15
 */
public class Perro {
    int a = 1;
    private String nombre;
    private int edad;
    private String raza;
    
    public Perro (String nombre, int edad, String raza){
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    Perro Labrador[] = new Perro [a];
    for (int i=0; i<labrador.lenght; i++){
        Labrador[i]=new Labrador();
        Labrador[i].setNombre(JOptionPane.showInputDialog("Ingrese el nombre del canino"));
        Labrador[i].setEdad(Integer.valueOf(JOptionPane.showInputDialog("Ingrese la edad del canino")));
        Labrador[i].setRaza(JOptionPane.showInputDialog("Ingrese la raza del canino"));
        }
    
    }

    

