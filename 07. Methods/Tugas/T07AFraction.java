// File: T07AFraction.java
public class T07AFraction {
  // bagian ide/ algoritma
  
  /* Method untuk menambahkan pecahan 1 dan pecahan 2 */
  static void sumFraction(int e1, int d1, int e2, int d2)
  {
    int es = e1 * d2 + e2 * d1, ds = d1 * d2;
    int pembagi = FPB(es, ds);
    es = es / pembagi;
    ds = ds / pembagi;
    printFraction(es, ds);
  }

  /* Method untuk mengalikan pecahan 1 dengan pecahan 2*/
  static void productFraction(int e1, int d1, int e2, int d2)
  {
    int ep = e1 * e2, dp = d1 * d2;
    int pembagi = FPB(ep, dp);
    ep = ep / pembagi;
    dp = dp / pembagi;
    printFraction(ep, dp);
  }

  /* Method untuk mencetak pecahan ke terminal */
  static void printFraction(int e, int d)
  {
    System.out.println(e + " / " + d); 
  }

  /* Method untuk mencari fpb pembilang dan penyebut */
  static int FPB(int e, int d)
  {
    int fpb = 1;
    for (int i = 1; i <= e && i <= d; i++) {
      if (e % i == 0 && d % i == 0)
        fpb = i;
    }
    return fpb;
  }

  public static void main(String[] args)
  {
    // method utama untuk melaukan testcase
    sumFraction(1, 2, 2, 3);
    sumFraction(1, 3, 3, 4);
    productFraction(1, 2, 2, 3);
    productFraction(1, 4, 2, 3);
  }
}
