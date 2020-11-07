package edu.school.gui;

public class Books {
	private String title;
	private String author;
	private String publisher;
	
	public Books(String t, String a, String p) {
		if(t != null && !t.isEmpty()) {
			title = t;
		}
		if(a != null && !a.isEmpty()) {
			author = a;
		}
		if(p != null & !p.isEmpty()) {
			publisher = p;
		}
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public String toString() {
		String result = author + "\"" + title + "\"" + ". " + publisher;
		return result;
	}
}
