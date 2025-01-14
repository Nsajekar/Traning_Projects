package com.euronet.main;

import com.euronet.main.domain.Comments;
import com.euronet.main.domain.LazyComments;

public class Client2 {
public static void main(String[] args) {
	LazyComments comments = LazyComments.getInstance();
	System.out.println("comments : " +comments.getUserComments() +"  "+comments.hashCode());
	comments.addNewComments("Hello");
	System.out.println();
	LazyComments comments1 = LazyComments.getInstance();
	System.out.println("comments1 : " +comments1.getUserComments() +"  "+comments1.hashCode());
	comments1.addNewComments("Hi");
	System.out.println();
	LazyComments comments2 =LazyComments.getInstance();
	System.out.println("comments2 : " +comments2.getUserComments() +"  "+comments2.hashCode());
}
}
