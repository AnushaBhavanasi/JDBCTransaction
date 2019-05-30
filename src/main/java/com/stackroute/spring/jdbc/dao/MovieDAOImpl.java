package com.stackroute.spring.jdbc.dao;

import javax.sql.DataSource;


import com.stackroute.spring.jdbc.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;

public class MovieDAOImpl implements MovieDAO {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void create(Movie movie) {
		String queryCustomer = "insert into movie (movieId, movieName,releaseyear,ratings) values (?,?,?,?)";
		String queryAddress = "insert into actor(movieId,actorName) values (?,?)";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(queryCustomer, new Object[] { movie.getMovieId(),
				movie.getMovieName(),
				movie.getYear(),
				movie.getRatings()});
		System.out.println("Inserted into Movie Table Successfully");
		jdbcTemplate.update(queryAddress, new Object[] { movie.getMovieId(),
				movie.getActor().getActorName(),

		});
		System.out.println("Inserted into Actor Table Successfully");
	}
}
