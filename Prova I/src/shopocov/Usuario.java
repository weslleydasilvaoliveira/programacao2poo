package shopocov;
import java.time.LocalDate;
import java.util.ArrayList;
public class Usuario {
	private static int count = 0;
	private int id;
	private String nome;
	private String email;
	private LocalDate nascimento;
	private String webSite;
	private String genero;
	private String telefone;
	private Foto fotoPerfil;
	private ArrayList<Album> albuns = new ArrayList<>();
	private ArrayList<Usuario>seguidores = new ArrayList<>();
	private ArrayList<Usuario>seguindo = new ArrayList<>();
	
	public Usuario(String nome, String email, LocalDate nascimento, String webSite, String genero, String telefone, Foto foto) {
		this.id = ++count;
		this.nome = nome;
		this.email = email;
		this.nascimento = nascimento;
		this.webSite = webSite;
		this.genero = genero;
		this.telefone = telefone;
		this.fotoPerfil = foto;
	}
	
	public void addSeguidor(Usuario seguidor) {
		this.seguidores.add(seguidor);
	}
	public void removeSeguidor(Usuario seguidor) {
		this.seguidores.add(seguidor);
	}
	public void addAlbum(Album album) {
		this.albuns.add(album);
	}
	public void removeAlbum(Album album) {
		this.albuns.remove(album);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public ArrayList<Usuario> getSeguidores() {
		return this.seguidores;
	}
	public ArrayList<Usuario> getSeguindo() {
		return this.seguindo;
	}
	public void removeSeguindo(Usuario seguindo) {
		this.seguindo.remove(seguindo);
	}

	public void addSeguindo(Usuario seguindo) {
		this.seguindo.add(seguindo);
	}
	public ArrayList<Album> getAlbum() {
		return this.albuns;
	}

	@Override
	public String toString() {
		String string = "Usuario [id=" + id +
				"\n nome=" + nome + 
				"\n email=" + email + 
				"\n nascimento=" + nascimento + 
				"\n webSite=" + webSite + 
				"\n genero=" + genero + 
				"\n telefone=" + telefone +
				"\n foto=" + fotoPerfil;
		return string;
	}
	
	
	
	
	
}