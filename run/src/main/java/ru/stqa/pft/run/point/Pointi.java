package ru.stqa.pft.run.point;

public class Pointi {

  public double x;
  public double y;

  public Pointi (double x, double y) {
    this.x = x;
    this.y= y;
  }

  public double distance(Pointi p2){
    return Math.sqrt((p2.x - this.x) * (p2.x - this.x) + (p2.y - this.y) * (p2.y - this.y));


  }
  }


