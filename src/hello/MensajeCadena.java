package hello;

public abstract class MensajeCadena{
  private MensajeCadena siguiente;
   
  public static MensajeCadena link(MensajeCadena first, MensajeCadena... chain) {
        MensajeCadena head = first;
        for (MensajeCadena nextInChain: chain) {
            head.siguiente = nextInChain;
            head = nextInChain;
        }
        return first;
   }
  
  public abstract String agregarMensaje(String mensaje);
   
  protected String siguienteCadena(String mensaje) {
        if (siguiente == null) {
            return mensaje;
        }
        return siguiente.agregarMensaje(mensaje);
    }
  
}
