package hello;

public class AlejandroA extends MensajeCadena{

  public String agregarMensaje(String mensaje){
    mensaje+= "Alejandro: hola";
    System.out.println("mensaje Alejandro");
    return siguienteCadena(mensaje);
  }
}