package com.euronet.main;

import com.euronet.main.domain.Comments;

public class Client {

	public static void main(String[] args) {
		Comments comments = Comments.getComment();
		System.out.println("comments : " +comments.getUserComments() +"  "+comments.hashCode());
		comments.addNewComments("Hello");
		System.out.println();
		Comments comments1 = Comments.getComment();
		System.out.println("comments1 : " +comments1.getUserComments() +"  "+comments1.hashCode());
		comments1.addNewComments("Hi");
		System.out.println();
		Comments comments2 =Comments.getComment();
		System.out.println("comments2 : " +comments2.getUserComments() +"  "+comments2.hashCode());
		
	}

}
