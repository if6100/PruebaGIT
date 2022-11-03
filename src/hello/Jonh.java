package hello;

public class Jonh extends MensajeCadena{

  public String agregarMensaje(String mensaje){
    mensaje+= "Profesor:hola";
    System.out.println("Que tal esta todo profe?");
    return siguienteCadena(mensaje);
  }
}
