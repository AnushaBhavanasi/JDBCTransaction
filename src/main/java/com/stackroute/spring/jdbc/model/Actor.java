package com.stackroute.spring.jdbc.model;

public class Actor {

	private String movieId;
	private String actorName;



	public String getActorName() {
		return actorName;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
}
