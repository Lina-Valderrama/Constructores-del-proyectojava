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

class Cliente extends Empresa{
    String telefono;
    int edad;
    boolean activo;
    
    public void mostrarCliente(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Telefono: " + telefono);
        System.out.println("Edad: " + edad);
        System.out.println("Activo: " + activo);
    }
    
}
class Pedido extends Empresa{
    int numeroPedido;
    String fecha;
    double total;
   
    public void mostrarPedido(){
        System.out.println("Numero de Pedido: " + numeroPedido);
        System.out.println("Fecha: " + fecha);
        System.out.println("Total a pagar: " + total);
    }
    
}

class Principal{
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        Producto producto = new Producto();
        producto.nombreProducto= "Celular";
        producto.categoria= "Tecnologia";
        producto.precio= 500.000;
        producto.cantidad= 1;
 
 
 
}
}
