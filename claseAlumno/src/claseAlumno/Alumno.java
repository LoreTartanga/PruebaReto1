package claseAlumno;

public class Alumno {
private String Nombre;
private String Apellidos;
private String Curso;
private int Id;

public String getNombre() {
	return Nombre;
}

public void setNombre(String nombre) {
	Nombre = nombre;
	Nombre ="Lorea";
}

public String getApellidos() {
	return Apellidos;
}

public void setApellidos(String apellidos) {
	Apellidos = apellidos;
}

public String getCurso() {
	return Curso;
}

public void setCurso(String curso) {
	Curso = curso;
}

public int getId() {
	return Id;
}

public void setId(int id) {
	Id = id;
}

public Alumno(String nombre, String apellidos, String curso, int id) {
	super();
	Nombre = nombre;
	Apellidos = apellidos;
	Curso = curso;
	Id = id;
}

}
