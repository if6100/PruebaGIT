package hello;

public class BlasAstrid extends MensajeCadena{
  
  public String agregarMensaje(String mensaje){
    mensaje+= "Probando: Hola";
    System.out.println("Mensaje");
    return siguienteCadena(mensaje);
  }
}
