package ru.stqa.pft.run.point;

import ru.stqa.pft.run.Rectangle;

public class Point {
  public static void main(String[] args) {

    Pointi p = new Pointi (1, 9, 5, 5);

    System.out.println("Расстояние между двумя точками (x1;y1) и (x2;y2)" + "=" + p.distance());
  }
}
