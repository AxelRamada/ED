package proyectoAxelRamada;

public class AxelRamadaJugarVideojuegos {
	
	private String nombreHobby;
	private String genero;
	private String plataforma;
	
	public AxelRamadaJugarVideojuegos(String nombreHobby,String genero, String plataforma) {
		this.genero=genero;
		this.plataforma=plataforma;
		this.nombreHobby=nombreHobby;
		
		
		
		
	}
	
	public String getNombreHobby() {
		
		
		return nombreHobby;
	}
	public void setNombreHobby(String nombre) {
		
		nombreHobby=nombre;
		
	}
	public String getGenero() {
		
		
		return genero;
	}
	public void setGenero(String generito) {
		
		genero=generito;
	
	
	
	}
}
