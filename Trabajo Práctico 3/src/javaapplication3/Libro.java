/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

public class Libro {
    
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    private String getTitulo(){
        return titulo;   
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    private String getAutor(){
        return autor;   
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }    
    
    public int getAnioPublicacion(){
        return anioPublicacion;
    }
    
    public void setAnioPublicacion(int anioPublicacion){
        if (anioPublicacion >= 1500 && anioPublicacion <= 2025) {
        this.anioPublicacion = anioPublicacion;
        System.out.println("Año de publicación actualizado correctamente: " + anioPublicacion);
        }else{
        System.out.println("El año ingresado no es válido!");
        }
    }
    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);   
        System.out.println("Año de publicación: " + anioPublicacion);        
    }
}
