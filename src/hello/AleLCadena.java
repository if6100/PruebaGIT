
package hello;

public class AleLCadena extends MensajeCadena{

  public String agregarMensaje(String mensaje){
    mensaje+= "Alejandro:Soy un alumno";
    System.out.println("mensaje alumno");
    return siguienteCadena(mensaje);
  }
}
