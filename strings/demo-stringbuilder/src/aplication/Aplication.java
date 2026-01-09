package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Comment;
import entities.Post;

public class Aplication {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date moment_p1 = sdf.parse("21/06/2018 13:05:44");
		String title_p1 = "Traveling to New Zealand";
		String content_p1 = "I'm going to visit this wonderful country!";
		Integer likes_p1 = 12;
		Post p1 = new Post(moment_p1,title_p1,content_p1,likes_p1);
		String comment1 = ("Have a nice trip");
		String comment2 = ("Wow that's awesome!");
		Comment comment_1_p1 = new Comment(comment1);
		Comment comment_2_p1 = new Comment(comment2);
		p1.AddComments(comment_1_p1);
		p1.AddComments(comment_2_p1);
		
		Date moment_p2 = sdf.parse("28/07/2018 23:14:19");
		String title_p2 = "Good night guys";
		String content_p2 = "See you tomorow";
		Integer likes_p2 = 5;
		Post p2 = new Post(moment_p2,title_p2,content_p2,likes_p2);
		String comment3 = ("Good night");
		String comment4 = ("May the Force be with you");
		Comment comment_1_p2 = new Comment(comment3);
		Comment comment_2_p2 = new Comment(comment4);
		p2.AddComments(comment_1_p2);
		p2.AddComments(comment_2_p2);
		
		System.out.println(p1);
		System.out.println(p2);

	
	}

}
