package hello;

public class RoibinCadena extends MensajeCadena{

  public String agregarMensaje(String mensaje){
    mensaje+= "Profesor:hola";
    System.out.println("mensaje roibin");
    return siguienteCadena(mensaje);
  }
}
