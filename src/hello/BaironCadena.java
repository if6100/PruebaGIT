package hello;

public class BaironCadena extends MensajeCadena{

  public String agregarMensaje(String mensaje){
    mensaje+= "Hola, buenas noches";
    System.out.println("mensaje: Bairon");
    return siguienteCadena(mensaje);
  }
}
