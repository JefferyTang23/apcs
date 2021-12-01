/*****************************************************
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS pd6
HW41 -- Rational
2021-12-1
time spent:   hours
DISCO
-
QCC
-
 *****************************************************/

 public class Rational {
   private int numerator;
   private int denominator;

   public Rational() {
     numerator = 0;
     denominator = 1;
   }
   public Rational(int p, int q) {
     numerator = p;
     denominator = q;
   }

   public float floatValue() {
     return (float) (numerator / denominator);
   }
   public String toString() {
     return "" + numerator + "/" + denominator;
   }
   public double multiply(Rational a) {
     return a.floatValue() * floatValue();
   }
   public double divide(Rational a) {
     return a.floatValue() / floatValue();
   }
 }
