package models;

public class Jogador {
  public String nome;
  public int overall;
  public boolean alive;
  public int economy;
  public int kills;
  public int deaths;
  public int gunBuff;
  public int gunDamage;
  public int life;

  public int ktr; // kills this round

  public int r1k;
  public int r2k;
  public int r3k;
  public int r4k;
  public int r5k;

  public float rating;

  public Jogador(String nome, int overall) {
    this.nome = nome;
    this.overall = overall;
    this.alive = true;
    this.economy = 800;
    this.kills = 0;
    this.deaths = 0;
    this.ktr = 0;
    this.r1k = 0;
    this.r2k = 0;
    this.r3k = 0;
    this.r4k = 0;
    this.r5k = 0;
    this.gunBuff = 0;
    this.gunDamage = 10;
    this.life = 100;
  }

  public float calcularRating(Jogo jogo) {
    float averageKPR = 0.679f;
    float averageSPR = 0.317f;
    float averageRMK = 1.277f;
    float killRating = ((float) this.kills / (float) jogo.rounds) / averageKPR;
    float survivalRating = (((float) jogo.rounds - (float) this.deaths) / (float) jogo.rounds) / averageSPR;
    float RMPKR = (this.r1k + 4 * this.r2k + 9 * this.r3k + 16 * this.r4k + 25 * this.r5k) / (float) jogo.rounds
        / averageRMK;

    this.rating = (killRating + 0.7f * survivalRating + RMPKR) / 2.7f;
    return this.rating;
  }
}
