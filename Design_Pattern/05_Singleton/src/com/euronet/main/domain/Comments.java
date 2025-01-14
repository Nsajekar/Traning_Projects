package com.euronet.main.domain;

import java.util.ArrayList;
import java.util.List;

public class Comments {
	private final static Comments COMMENTS = new Comments();
	private List<String> userComments = new ArrayList<>();

	private Comments() {
	}

	public static Comments getComment() {
		return COMMENTS;
	}

	public void addNewComments(String comments) {
		userComments.add(comments);
	}

	public List<String> getUserComments() {
		return userComments;
	}

}
