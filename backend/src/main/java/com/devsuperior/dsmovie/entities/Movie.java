package com.devsuperior.dsmovie.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_movie")
public class Movie {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String title;
  private Double score;
  private Integer count;
  private String image;

  public Movie() {}

  public Movie(
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
