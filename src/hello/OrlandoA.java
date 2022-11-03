package hello;
public class OrlandoA extends MensajeCadena{

  public String agregarMensaje(String mensaje){
    mensaje+= "Profesor:hola";
    System.out.println("Hola pura vida!");
    return siguienteCadena(mensaje);
  }
}
