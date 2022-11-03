package hello;

public class JairoEBGCadena extends MensajeCadena{

  public String agregarMensaje(String mensaje){
    mensaje+= "Mensaje de Jairo ._.";
    System.out.println("mensaje profesor");
    return siguienteCadena(mensaje);
  }
}
