package SocialMedia;

import java.time.LocalDateTime;

public class Program {
	public static void main(String[] args) {
		LocalDateTime dt1 = LocalDateTime.now(); 
		Post p1 = new Post(dt1,"Traveling to New Zealand", "content", 2);
		System.out.println(dt1);
		Comment c1 = new Comment("Ok!");
		p1.addComment(c1);
		
		var c2 = new Comment("bye");
		p1.addComment(c2);
	}
}
