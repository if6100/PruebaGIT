package hello;

public class HelloWorld {
  public static void main(String[] args) {
	MensajeCadena mensaje=MensajeCadena.link(new ProfesorCadena(), new BrihanArrietaCadena());
	System.out.println(mensaje.agregarMensaje("prueba"));

  MensajeCadena mensajeAlejandro=MensajeCadena.link(new AlejandroA());
	System.out.println(mensajeAlejandro.agregarMensaje("prueba"));
  }
}
