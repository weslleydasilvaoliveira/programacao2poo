package shopocov;
//import java.time.format.DateTimeFormatter; se der tempo, eu uso
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		LocalDateTime instante;
		instante = LocalDateTime.now();
		Foto foto;
		
		//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy:HH"); se der tempo
		
		//criando os perfis de usuário
		foto = new Foto("https://driveREPOSITOYfilesYZ/PHOTOS/viagem%20para%20Cancum",instante);
		Usuario u1 = new Usuario("Alex","alexsouza@gmail.com",LocalDate.parse("2000-10-17"),"www.dacasolucoes.com.br","M","94 9999 9999",foto);
		instante = LocalDateTime.now();
		foto = new Foto("https://driveREPOSITOYfilesYZ/MYPHOTOS/eua",instante);
		Usuario u2 = new Usuario("Douglas Carvalho Lima","naoeodouglas@gmail.com",LocalDate.parse("1998-04-11"),"www.naotenhosite.com.br","M","94 9999 8888",foto);
		instante = LocalDateTime.now();
		foto = new Foto("https://driveREPOSITOYfilesYZ/ICLOUD/me",instante);
		Usuario u3 = new Usuario("Simão Pedro","cefas@gmail.com",LocalDate.parse("2010-11-10"),"www.angel.com.br","M","99 9849 1234",foto);
		instante = LocalDateTime.now();
		foto = new Foto("https://driveREPOSITOYdouglasYZ/PHOTOS/eu",instante);
		Usuario u4 = new Usuario("Douglas Carvalho Lima","naoeodouglas@gmail.com",LocalDate.parse("1998-04-11"),"www.sejagentiletenhacoragem.com.br","M","94 81099 5678",foto);
		
		//definindo as postagens do Usuario u1
		instante = LocalDateTime.now();
		foto = new Foto("https://driveREPOSITOYfilesYZ/PHOTOS/viagem%20para%20Cancum",instante);
		Album album = new Album("Férias em Cancúm",instante);
		instante = LocalDateTime.now();
		album.addFoto(foto);
		instante = LocalDateTime.now();
		foto = new Foto("https://driveREPOSITOYfilesYZ/PHOTOS/eu%20e%20minha%20esposa",instante);
		album.addFoto(foto);
		u1.addAlbum(album);
		
		//definindo seguidores e seguinte
		u1.addSeguidor(u4); 
		u1.addSeguindo(u4);
		u1.addSeguidor(u3); 
		u1.addSeguindo(u3);
		u1.addSeguidor(u2); 
		u1.addSeguindo(u2);
		u4.addSeguidor(u1);
		u4.addSeguindo(u1);
		u4.addSeguidor(u3);
		u4.addSeguindo(u3);
		u3.addSeguidor(u4);
		u3.addSeguindo(u4);
		
		System.out.println(u1);
		
		System.out.println("SEGUIDORES:");
		for(Usuario u: u1.getSeguidores()) {
			System.out.println(u.getNome());
		}
		
		System.out.println();
		
		System.out.println("SEGUINDO:");
		for(Usuario u: u1.getSeguindo()) {
			System.out.println(u.getNome());
		}
			
	}
	
	
}
