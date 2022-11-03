package hello;

public class BrihanArrietaCadena extends MensajeCadena{

  public String agregarMensaje(String mensaje){
    mensaje+= "Brihan:hola";
    System.out.println("mensaje brihan");
    return siguienteCadena(mensaje);
  }
}
