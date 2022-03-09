
public class Alumnos {
	private String Nombre;
	private String Apellidos;
	private String Curso;
	private int id;
	
	public Alumnos(String nombre, String apellidos, String curso, int id) {
		super();
		Nombre = nombre;
		Apellidos = apellidos;
		Curso = curso;
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
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
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
