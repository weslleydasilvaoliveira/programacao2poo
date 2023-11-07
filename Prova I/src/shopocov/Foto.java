package shopocov;

import java.time.LocalDateTime;
public class Foto {
	private String uri;
	private LocalDateTime data;
	
	public Foto(String uri, LocalDateTime data) {
		this.uri = uri;
		this.data = data;
	}
	
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Foto [uri=" + uri + ", data=" + data + "]\n";
	}
	
}


