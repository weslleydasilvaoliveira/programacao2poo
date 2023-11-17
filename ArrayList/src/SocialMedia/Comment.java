package SocialMedia;

public class Comment {
	private String text;
	
	//constructors
	public Comment(String text) {
		super();
		this.text = text;
	}

	//methods
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
