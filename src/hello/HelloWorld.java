package hello;

public class HelloWorld {
  public static void main(String[] args) {
	MensajeCadena mensaje=MensajeCadena.link(new ProfesorCadena(), new NicoleCadena());
	System.out.println(mensaje.agregarMensaje("prueba"));
  }
}
