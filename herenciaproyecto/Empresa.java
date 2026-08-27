/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaproyecto;

/**
 *
 * @author Dora
 */
public class Empresa {
    String nombre;
    String propietario;
    
    public void mostrarDatos(){
        System.out.println("Nombre:" + nombre);
        System.out.println("Propietario:" + propietario);
    }
        
    }
 class Producto extends Empresa {
    
     String nombreProducto;
     String categoria;
     double precio;
     int cantidad;
     
     public void mostrarProducto(){
         System.out.println("Product: " + nombreProducto);
         System.out.println("Categoria: " + categoria);
         System.out.println("Precio: " + precio);
         System.out.println("Cantidad: " + cantidad);
     }
 }
 class Empleado extends Empresa{
     String cargo;
     double salario;
     int edad;
     
     public void mostrarEmpleado(){
         System.out.println("Nombre: " + nombre);
         System.out.println("Cargo: " + cargo);
         System.out.println("Salario: " + salario);
         System.out.println("Edad: " + edad);    
     }
     
     
 }
 
