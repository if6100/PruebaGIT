package hello;

public class NicoleCadena extends MensajeCadena{

  public String agregarMensaje(String mensaje){
    mensaje+= "Nicole:hola";
    System.out.println("mensaje estudiante");
    return siguienteCadena(mensaje);
  }
}
