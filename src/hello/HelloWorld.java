package hello;

public class HelloWorld {
  public static void main(String[] args) {

	MensajeCadena mensaje=MensajeCadena.link(new ProfesorCadena(),new AlejandroA(),new Paulo(), new BrihanArrietaCadena(),	

  new Jonh(), new BaironCadena(), new OrlandoA(),new JuanDiego(), new DanielCadena(), new NicoleCadena(), new KendalSoto(),new BlasAstrid(), new CarlosGuevara());	

	System.out.println(mensaje.agregarMensaje("prueba"));
  }
}
