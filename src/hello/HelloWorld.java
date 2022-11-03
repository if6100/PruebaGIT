package hello;

public class HelloWorld {
  public static void main(String[] args) {
	MensajeCadena mensaje=MensajeCadena.link(new ProfesorCadena());
	System.out.println(mensaje.agregarMensaje("prueba"));

  MensajeCadena mensajeAlejandro=MensajeCadena.link(new ProfesorCadena(),new AlejandroA(),new Paulo(), new Carlos());
	System.out.println(mensajeAlejandro.agregarMensaje("prueba"));
  }
}
