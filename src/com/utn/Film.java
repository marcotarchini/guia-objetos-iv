package com.utn;

import java.time.LocalDate;

public class Film {

  private int duracion;
  private int stock;
  private String clasificacion;
  private String titulo;
  private LocalDate fechaLanzamiento;
  private String genero;


  public Film(int duracion, int stock, String clasificacion, String titulo, LocalDate fechaLanzamiento, String genero) {
    this.duracion = duracion;
    this.stock = stock;
    this.clasificacion = clasificacion;
    this.titulo = titulo;
    this.fechaLanzamiento = fechaLanzamiento;
    this.genero = genero;
  }

  public int getDuracion() {
    return duracion;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public String getClasificacion() {
    return clasificacion;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getGenero() {
    return genero;
  }

  public LocalDate getFechaLanzamiento() {
    return fechaLanzamiento;
  }

  @Override
  public String toString() {
    return "Film{" +
            "duracion=" + duracion +
            ", stock=" + stock +
            ", clasificacion='" + clasificacion + '\'' +
            ", titulo='" + titulo + '\'' +
            ", fechaLanzamiento=" + fechaLanzamiento +
            ", genero=" + genero +
            '}';
  }
}
