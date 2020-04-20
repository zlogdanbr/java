package AdvanceMath;

public class Bissecante {

 public double fk;
 public double fk_1;
 public double xk;
 public double xk_1;

 public Bissecante(double Fk, double Fk_1, double Xk, double Xk_1) {
   fk = Fk;
   fk_1 = Fk_1;
   xk = Xk;
   xk_1 = Xk_1;
 }

 public double NextAprox() {

  double xkmais = 0;
  xkmais =  ((xk_1*fk - xk*fk_1)/(fk-fk_1));
  return xkmais;

 }

 public double Erro(double xKmais, double xK ) {

  double erro=0;
  erro = ((Math.abs(xKmais-xK))/xKmais);
  return erro;
 }

}


