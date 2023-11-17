package SocialMedia;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Post {
	private LocalDateTime moment;
	private String title;
	private String content;
	private Integer likes;
	private ArrayList<Comment> comments = new ArrayList<>();
	
	//constructor
	public Post(LocalDateTime moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
		this.comments = new ArrayList<>();
	}
	
	//methods
	public void addComment(Comment c) {
		comments.add(c);
	}
	
	public void removeComment(Comment c) {
		comments.remove(c);
	}
	
	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	} 
	
	
}