package hello;

public class Paulo extends MensajeCadena{

  public String agregarMensaje(String mensaje){
    mensaje+= "Paulo:hola";
    System.out.println("mensaje Paulo");
    return siguienteCadena(mensaje);
  }
}
