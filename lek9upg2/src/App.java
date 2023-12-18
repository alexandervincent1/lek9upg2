import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);
        Storbokstav(null);
        Ärprimtal(0);
        Potens(0,0);
    }

static String Storbokstav (String a)
{
    Scanner tangentbord = new Scanner(System.in);
    System.out.println("Ange din bokstav");
    String b = tangentbord.nextLine();
    System.out.println(b.toUpperCase());
    return a; 
}

static int Potens (int bas, int exponent)
{
    Scanner tangentbord = new Scanner(System.in);
    System.out.println("Ange ditt bas tal");
    bas = tangentbord.nextInt();
    System.out.println("Ange din exponent");
    exponent = tangentbord.nextInt();
    int x = bas;
    for (int varv=1; varv<exponent;)
    {
        bas = bas*x;
        varv++;
    }
    System.out.println(bas);
    return exponent;
}
static boolean Ärprimtal(int tal)
{
    Scanner tangentbord = new Scanner(System.in);
    System.out.println("Ange ditt tal.");
    int Primtal = tangentbord.nextInt();
    Primtal = Primtal%2;
    if (Primtal>=1) {
        System.out.println("Ditt tal är ett primtal");
    }
    else if (Primtal<1) {
        System.out.println("Ditt tal är inte ett primtal.");
        
    }
    boolean b = true;
    return b;
}


}