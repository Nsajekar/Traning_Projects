package com.euronet.main.domain;

import java.util.ArrayList;
import java.util.List;

public class LazyComments {
	private static volatile LazyComments lazyComments;
	private List<String> userComments = new ArrayList<>();

	private LazyComments() {
	}

	public static LazyComments getInstance() {
		if (lazyComments == null) {
			synchronized (LazyComments.class) {
				if (lazyComments == null) {
					lazyComments = new LazyComments();
				}
			}
		}
		return lazyComments;
	}
	public void addNewComments(String comments) {
		userComments.add(comments);
	}

	public List<String> getUserComments() {
		return userComments;
	}

}
