package hello;

public class HelloWorld {
  public static void main(String[] args) {

	MensajeCadena mensaje=MensajeCadena.link(new ProfesorCadena(), new BlasAstrid(), new AlejandroA(),new Paulo(),new ISB(), new BrihanArrietaCadena(),new Jonh(), new BaironCadena(), new OrlandoA(),new JuanDiego());

	System.out.println(mensaje.agregarMensaje("prueba"));
  }
}
