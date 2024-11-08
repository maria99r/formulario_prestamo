
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author PC
 */
public class Registro {

    String nom;
    String tel;
    String dni;
    String isbn;
    String tit;
    String autor;
    String edit;
    String encuadernacion;
    String mat;
    String topics;
    String prestamo;
    String entrega;

    public Registro(String name, String telefono, String dni, String isbn, String titulo, String autor, String editorial,
            String encuadernacion, String materias, String topics, String prestamo, String entrega) {
        nom = name;
        tel = telefono;
        this.dni = dni;
        this.isbn = isbn;
        this.tit = titulo;
        this.autor = autor;
        this.edit = editorial;
        this.encuadernacion = encuadernacion;
        this.mat = materias;
        this.topics = topics;
        this.prestamo = prestamo;
        this.entrega = entrega;
    }
}
