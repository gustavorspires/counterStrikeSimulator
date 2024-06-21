package models;
import java.util.Random;
public class Jogo {
  public Time time1;
  public Time time2;
  public int[] placar;
  public int rounds;

  public Jogo(Time t1, Time t2) {
    this.time1 = t1;
    this.time2 = t2;
    this.placar = new int[2];
    this.placar[0] = 0;
    this.placar[1] = 0;
  }
  
  public enum economyRounds {
      ECO(500, 30),
      FORCED(1750, 100),
      HALF(2500, 150),
      FULL(4000, 200);
      
      private final int value;
      private final int buff;
      //private final int damage;
      
      economyRounds(int value, int buff/* , int damage*/) {
          this.value = value;
          this.buff = buff;
          //this.damage = damage;
      }
      
      public int getValue() {
          return this.value;
      }
      
      public int getBuff(){
          return this.buff;
      }

      /* public int getDamage(){
        return this.damage;
      }*/
  }
  
  public int[] iniciarJogo() {
    while (this.placar[1] < 13 && this.placar[0] < 13) {
        for (Jogador j : this.time1.jogadores){
            if (j.economy >= 4000) {
                j.economy -= economyRounds.FULL.getValue();
                j.gunBuff = economyRounds.FULL.getBuff();
                //j.gunDamage = economyRounds.FULL.getDamage();
            } else if (j.economy >= 3000) {
                j.economy -= economyRounds.HALF.getValue();
                j.gunBuff = economyRounds.HALF.getBuff();
                //j.gunDamage = economyRounds.HALF.getDamage();
            } else if (j.economy >= 1900) {
                j.economy -= economyRounds.FORCED.getValue();
                j.gunBuff = economyRounds.FORCED.getBuff();
                //j.gunDamage = economyRounds.FORCED.getDamage();
            } else if (j.economy >= 500) {
                j.economy -= economyRounds.ECO.getValue();
                j.gunBuff = economyRounds.ECO.getBuff();
                //j.gunDamage = economyRounds.ECO.getDamage();
            } else {
              j.gunBuff = 0;
            }
        }

        for (Jogador j : this.time2.jogadores) {
          if (j.economy > 4000) {
            if (j.economy >= 4000) {
                j.economy -= economyRounds.FULL.getValue();
                j.gunBuff = economyRounds.FULL.getBuff();
                //j.gunDamage = economyRounds.FULL.getDamage();
            } else if (j.economy >= 3000) {
                j.economy -= economyRounds.HALF.getValue();
                j.gunBuff = economyRounds.HALF.getBuff();
                //j.gunDamage = economyRounds.HALF.getDamage();
            } else if (j.economy >= 1900) {
                j.economy -= economyRounds.FORCED.getValue();
                j.gunBuff = economyRounds.FORCED.getBuff();
                //j.gunDamage = economyRounds.FORCED.getDamage();
            } else if (j.economy >= 500) {
                j.economy -= economyRounds.ECO.getValue();
                j.gunBuff = economyRounds.ECO.getBuff();
                //j.gunDamage = economyRounds.ECO.getDamage();
            } else {
              j.gunBuff = 0;
            }
          }
      }

      if (checarRound() == 1) {
        this.time1.wS++;
        this.time2.wS = 0;
        resetarRound();
        this.placar[0]++;
        this.rounds++;
        System.out.println(this.time1.nome);
      } else if (checarRound() == 2) {
        this.time2.wS++;
        this.time1.wS = 0;
        resetarRound();
        this.placar[1]++;
        this.rounds++;
        System.out.println(this.time2.nome);
      }

      Random rand = new Random();
      int n1 = rand.nextInt(5);
      while (this.time1.jogadores[n1].alive == false) {
        n1 = rand.nextInt(5);
      }

      int n2 = rand.nextInt(5);
      while (this.time2.jogadores[n2].alive == false) {
        n2 = rand.nextInt(5);
      }

      if (this.time1.jogadores[n1].overall + this.time1.jogadores[n1].gunBuff + rand.nextInt(100) > this.time2.jogadores[n2].overall + this.time2.jogadores[n2].gunBuff + rand.nextInt(100)) {
        this.time2.jogadores[n2].alive = false;
        this.time2.jogadores[n2].deaths++;
        this.time1.jogadores[n1].kills++;
        this.time1.jogadores[n1].ktr++;
      } else {
        this.time1.jogadores[n1].alive = false;
        this.time1.jogadores[n1].deaths++;
        this.time2.jogadores[n2].kills++;
        this.time2.jogadores[n2].ktr++;
      }
    }
    return this.placar;
}

  private void resetarRound() {
    for (Jogador j : this.time1.jogadores) {
      switch (j.ktr) {
        case 1:
          j.r1k++;
          break;
        case 2:
          j.r2k++;
          break;
        case 3:
          j.r3k++;
          break;
        case 4:
          j.r4k++;
          break;
        case 5:
          j.r5k++;
          break;
      }
      j.ktr = 0;
      j.alive = true;
      switch (this.time2.wS){
          case 1:
              j.economy += 1400;
              break;
          case 2:
              j.economy += 1900;
              break;
          case 3:
              j.economy += 2400;
              break;
          case 4:
              j.economy += 2900;
              break;
          default:
              if (this.time2.wS >= 5) {
                  j.economy += 3400;
              } else {
                j.economy += 3250;
            }
              break;
              
      }
        if (j.economy > 16000) {
                  j.economy = 16000;
              }
    }
    for (Jogador j : this.time2.jogadores) {
      switch (j.ktr) {
        case 1:
          j.r1k++;
          break;
        case 2:
          j.r2k++;
          break;
        case 3:
          j.r3k++;
          break;
        case 4:
          j.r4k++;
          break;
        case 5:
          j.r5k++;
          break;
      }
      j.ktr = 0;
      j.alive = true;
      switch (this.time1.wS){
          case 1:
              j.economy += 1400;
              break;
          case 2:
              j.economy += 1900;
              break;
          case 3:
              j.economy += 2400;
              break;
          case 4:
              j.economy += 2900;
              break;
          default:
              if (this.time1.wS >= 5) {
                  j.economy += 3400;
              } else {
                  j.economy += 3250;
              }
          break;
      }
      if (j.economy > 16000) {
        j.economy = 16000;
      }
    }
  }

  private int checarRound() {
    boolean fim = true;
    for (Jogador j : this.time1.jogadores) {
      if (j.alive) {
        fim = false;
      }
    }
    if (fim)
      return 2;

    fim = true;
    for (Jogador j : this.time2.jogadores) {
      if (j.alive) {
        fim = false;
      }
    }
    if (fim)
      return 1;

    return -1;
  }
}
