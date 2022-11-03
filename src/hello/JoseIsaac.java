package hello;
public class JoseIsaac extends MensajeCadena{

  public String agregarMensaje(String mensaje){
    mensaje+= "Jose Isaac:hola";
    System.out.println("mensaje Jose Isaac");
    return siguienteCadena(mensaje);
  }
}
