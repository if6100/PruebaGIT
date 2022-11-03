package hello;

public class KendalSoto extends MensajeCadena{

  public String agregarMensaje(String mensaje){
    mensaje+= "Kendal says:FC Barcelona";
    //System.out.println("mensaje profesor");
    return siguienteCadena(mensaje);
  }
}
