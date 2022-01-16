package com.devsuperior.dsmovie.dto;

import com.devsuperior.dsmovie.entities.Movie;

public class MovieDTO {
  private long id;
  private String title;
  private Double score;
  private Integer count;
  private String image;

  public MovieDTO() {}

  public MovieDTO(
    long id,
    String title,
    Double score,
    Integer count,
    String image
  ) {
    this.id = id;
    this.title = title;
    this.score = score;
    this.count = count;
    this.image = image;
  }

  public MovieDTO(Movie movie) {
    id = movie.getId();
    title = movie.getTitle();
    score = movie.getScore();
    count = movie.getCount();
    image = movie.getImage();
  }

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Double getScore() {
    return this.score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public Integer getCount() {
    return this.count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public String getImage() {
    return this.image;
  }

  public void setImage(String image) {
    this.image = image;
  }
}
