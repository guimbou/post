package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Main {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Post post01 = new Post(sdf.parse("21/06/2018 13:05:44"), 
				"Traveling to New Zeland", 
				"I'm going to visit this wonderful country", 
				12);
		post01.addComment(new Comment("Have a nice trip"));
		post01.addComment(new Comment("Wow that's awesome!"));
		
		Post post02 = new Post(sdf.parse("28/07/2018 23:14:19"), 
				"Good night guys", 
				"See you tomorrow", 
				5);
		post02.addComment(new Comment("Good night"));
		post02.addComment(new Comment("May the Force be with you"));
		
		System.out.println(post01);
		System.out.println(post02);
	}

}
