package hello;

public class Nicole extends MensajeCadena{

  public String agregarMensaje(String mensaje){
    mensaje+= "Nicole:hola";
    System.out.println("mensaje estudiante");
    return siguienteCadena(mensaje);
  }
}
