
package edtarea6;

public class Tarea6EDClase {
    private static final double DESCUENTO_CANTIDAD = 0.8;
    private static final double DESCUENTO_SIMPLE = 0.95;
    
 public void aplicarDescuento(double precioProducto, int numProductos){     double total;
    if(numProductos>3)
        precioProducto-=5;
            if (numProductos!=0){
            total = precioProducto*DESCUENTO_CANTIDAD;
            mostrarTotal(total);
        }else {
            total = precioProducto*DESCUENTO_SIMPLE;
            mostrarTotal(total);
        }   
    }

    private void mostrarTotal(double total) {
        System.out.println("El total a pagar es:"+total);
        System.out.println("Enviado");
    }

    

}
