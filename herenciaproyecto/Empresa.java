/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaproyecto;

/**
 *
 * @author Dora
 */
import java.util.Scanner;
public class Empresa {
    String nombre;
    String propietario;
    
    public Empresa() {
    }
 
    public Empresa(String nombre, String propietario) {
    this.nombre = nombre;
    this.propietario = propietario;
    }
    
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
     
      public Producto(){
    }
     
     public Producto(String nombreProducto,String categoria, double precio, int cantidad) {
    this.nombreProducto = nombreProducto;
    this.categoria = categoria;
    this.precio = precio;
    this.cantidad = cantidad;
     }
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
     public Empleado(){
    }
     
     public Empleado(String nombre, String cargo,
                double salario, int edad) {
    this.nombre = nombre;
    this.cargo = cargo;
    this.salario = salario;
    this.edad = edad;
     }
     
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
    
         public Cliente(){
    }
     public Cliente(String telefono, int edad, boolean activo) {
        this.telefono = telefono;
        this.edad = edad;
        this.activo = activo;
     }
     public void mostrarCliente() {
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
    
    public Pedido(int numeroPedido,
              String fecha, double total) {
    this.numeroPedido = numeroPedido;
    this.fecha = fecha;
    this.total = total;
    }
   
    public void mostrarPedido(){
        System.out.println("Numero de Pedido: " + numeroPedido);
        System.out.println("Fecha: " + fecha);
        System.out.println("Total a pagar: " + total);
    }

}

class Principal{
    static  Scanner scanner = new Scanner(System.in);
   
    public static void main(String[] args) {
        
         Empresa empresa = new Empresa( "Empresa Tecnologia", "Juan Perez" );
         Producto producto = new Producto("Celular","Tecnologia",500.000,1);
        Empleado empleado = new Empleado("Carlos Herazo","Vendedor",15000000,31);
        
        
        Cliente cliente = new Cliente();
        cliente.nombre= "Valeria Ruiz";
        cliente.telefono= "3112567843";
        cliente.edad= 27;
        
        Pedido pedido = new Pedido();
            pedido.numeroPedido= 16;
            pedido.fecha= "15 de agosto";
            pedido.total= 15.000;
            
         empresa.mostrarDatos();
         producto.mostrarProducto();
        empleado.mostrarEmpleado();
        cliente.mostrarCliente();
        pedido.mostrarPedido();
        
        System.out.print("¿El cliente está activo? (1 = Sí, 2 = No): ");
        int opcion = scanner.nextInt();
        
        if (opcion == 1) {
            cliente.activo = true;
        } else {
            cliente.activo = false;
        }
        
        cliente.mostrarCliente();
        
        scanner.close();
 
            
        
    }
}
 
