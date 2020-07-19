package address.point;


public class Point {
  public static void main (String[] args) {
    Pointi p1 = new Pointi(3, 3);
    Pointi p2 = new Pointi(2,2.6);

    System.out.println("Расстояние между двумя точками (p1) и (p2) " + "=" + p1.distance(p2));
  }

}
