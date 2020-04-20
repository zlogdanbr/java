package AdvanceMath;

public class FFT {

 double F[];

 public FFT(double f[]) {
   F= new double[f.length];
   System.arraycopy(f,0,F,0,f.length);
 };

 public void Deslocar(Complex C[]){


