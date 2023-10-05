public class CAP02EJ06 {
   public static void main(String[] args) {
    double base, iva, total;
    base=22.75;
    iva=4.78; //4.68%
    total=base+iva;
    System.out.printf("%-14s\t%5.2f%n", "Base imponible",base);
    System.out.printf("%-14s\t%5.2f%n", "IVA",iva);
    System.out.printf("---------------------%n", args);
    System.out.printf("%-14s\t%5.2f%n", "Total",total);
   } 
}
