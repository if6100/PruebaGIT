package hello;

public abstract class MensajeCadena{
  private MensajeCadena siguiente;
   
  public abstract String agregarMensaje(String mensaje);
   
  protected String siguienteCadena(String mensaje) {
        if (siguiente == null) {
            return mensaje;
        }
        return next.agregarMensaje(mensaje);
    }
  
}
