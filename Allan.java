package hello;

public class allan extends MensajeCadena{

  public String agregarMensaje(String mensaje){
    mensaje+= "Profesor:hola";
    System.out.println("mensaje profesor");
    return siguienteCadena(mensaje);
  }
}
