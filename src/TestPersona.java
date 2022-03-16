public class TestPersona {
	public static void main(String[] args) {
		Persona p1 = new Persona(1, "Mercedes López", 19);
		Persona p2 = new Persona(2, "Pedro Santos",40, "M");
		p1.setGenero("F");
		System.out.println(p1.getIdPersona()+"--"+p1.getNombre()+"--"+p1.getEdad()+"--"+p1.getGenero());
		System.out.println(p2.getIdPersona()+"--"+p2.getNombre()+"--"+p2.getEdad()+"--"+p2.getGenero());
	}
}