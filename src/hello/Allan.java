package hello;

public class Allan extends MensajeCadena{

  public String agregarMensaje(String mensaje){
    mensaje+= "Allan:hola";
    System.out.println("mensaje Allan");
    return siguienteCadena(mensaje);
  }
}
