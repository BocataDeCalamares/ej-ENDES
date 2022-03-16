
public class Persona {
//Atributos
private int idPersona;
private String nombre;
private int edad;
private String genero;
//Constructores
public Persona(int id, String nombre, int edad){
setIdPersona(id);
setNombre(nombre);
setEdad(edad);
}
public Persona(int id, String nombre, int edad, String genero){
this(id,nombre,edad);
setGenero(genero);
}
//Métodos set
public void setIdPersona(int valor){
this.idPersona=valor;
}
public void setNombre(String valor){
this.nombre=valor;
}
public void setEdad(int valor){
if (valor<65)
this.edad=valor;
else
System.out.println("La edad debe ser menor de 65");
}
public void setGenero(String valor){
if (valor.equals("F")||valor.equals("M"))
this.genero=valor;
else
System.out.println("El género debe ser F o M");
}
//Métodos get
public int getIdPersona(){
return this.idPersona;
}
public String getNombre(){
return this.nombre;
}
public int getEdad(){
return this.edad;
}
public String getGenero(){
return this.genero;
}
}