package hello;

public class HelloWorld {
  public static void main(String[] args) {
	MensajeCadena mensaje=MensajeCadena.link(new ProfesorCadena(),new AlejandroA(),new Paulo(),new Jonh(), new OrlandoA());
	System.out.println(mensaje.agregarMensaje("prueba"));
  }
}
