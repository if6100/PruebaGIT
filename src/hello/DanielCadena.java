package hello;

public class DanielCadena extends MensajeCadena{

  public String agregarMensaje(String mensaje){
    mensaje+= "Daniel:jelou";
    System.out.println("mensaje daniel");
    return siguienteCadena(mensaje);
  }
}
