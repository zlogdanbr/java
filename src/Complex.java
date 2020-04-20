package AdvanceMath;

/*
  Classe Complex
  Implementa m�todos para lidar com n�meros complexos
  em Linguagem Java
*/
public class Complex {

 public double x;
 public double y;
 public double r;
 public double teta;
 public double complexn[];


 //contrutor para forma cartesiana
 public Complex(double a, double b) {
  x=a;
  y=b;
 }

 //construtor para forma polar
 public Complex(double raio, double argumento, int option){
  r = raio;
  teta = argumento;
 }

 //Apresenta n�mero Complexo na forma cartesiana na tela
 public void DisplayCartesiano() {
   System.out.println(y + "+j" + x);
 }

 //Apresetna n�mero complex na forma polar
 public void DisplayPolar(){
   System.out.println(r + "cos" + "(" + teta + ") + " + r +
   "jsen(" + teta + ")");
 }

 //Calcula o raio de um n�mero complexo
 public double Raio(){
  return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
 }

 //Converte um n�mero complexo de coordenadas cartesianas
 //para coordenadas polares
 public void Cart2Pol(){
  teta = Math.atan(x/y);
  r = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
 }

 //Converte um n�mero complexo de coordenadas polares
 //para coordenadas cartesianas
 public void Pol2Cart(){
  x = r*Math.cos(teta);
  y = r*Math.sin(teta);
 }

 //Soma dois n�meros complexos em coordenadas cartesianas
 public Complex Somar(Complex co, Complex c1) {
  Complex c2 = new Complex(co.x+c1.x,co.y+c1.y);
  return c2;
 }

 //Multiplica um n�mero complexo por uma constante K
 public void MultiplicarPorConstante(double k) {
   x = x*k;
   y = y*k;
 }

 //Divide dois n�meros complexos em coordenadas cartesianas
 public Complex Dividir(Complex co, Complex c1){

  double a = co.x;
  double b = co.y;
  double c = c1.x;
  double d = c1.y;
  double f = Math.pow(c,2)+Math.pow(d,2);
  double g = a*c+b*d;
  double h = a*d-c*b;

  Complex c2 = new Complex(g/f,h/f);
  return c2;

 }

 //Multiplioca dois n�meros complexos em coordenadas cartesianas
 public Complex Multiplicar(Complex co, Complex c1){

  double a = co.x;
  double b = co.y;
  double c = c1.x;
  double d = c1.y;

  double f = a*c-b*d;
  double g = a*d-b*c;

  Complex c2 = new Complex(f,g);
  return c2;

 }

 //Retorna o conjugado de um n�mero complexo
 public Complex Conjugado(Complex co){
  Complex c2 = new Complex(co.x,-co.y);
  return c2;
 }



}