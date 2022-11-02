package hello;

public class Jearag extends MensajeCadena{

  public String agregarMensaje(String mensaje){
    mensaje+= "Jearag:hola";
    //System.out.println("mensaje profesor");
    return siguienteCadena(mensaje);
  }
}
