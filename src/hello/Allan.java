package hello;

public class allan extends MensajeCadena{

  public String agregarMensaje(String mensaje){
    mensaje+= "Allan:hola";
    System.out.println("mensaje Allan");
    return siguienteCadena(mensaje);
  }
}
