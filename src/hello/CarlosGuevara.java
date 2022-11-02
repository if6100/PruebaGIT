package hello;

public class CarlosGuevara extends MensajeCadena{

  public String agregarMensaje(String mensaje){
    mensaje+= "Profesor:hola";
    System.out.println("mensaje profesor");
    return siguienteCadena(mensaje);
  }
}
