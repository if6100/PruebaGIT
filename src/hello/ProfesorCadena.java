package hello;

public class ProfesorCadena extends MensajeCadena{

  public String agregarMensaje(String mensaje){
    mensaje+= "Profesor:hola";
    System.out.println("mensaje issac");
    return siguienteCadena(mensaje);
  }
}
