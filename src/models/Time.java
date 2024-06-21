package models;

/**
 *
 * @author gusta
 */
public class Time {
  public Jogador[] jogadores;
  public String nome;
  public int wS;

  public Time(Jogador[] jogadores, String nome) {
    this.jogadores = jogadores;
    this.nome = nome;
    this.wS = 0;
  }
}
