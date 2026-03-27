import java.util.Scanner;

class ZakatAlfitrCalculator{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        ZakatCategory zakatAlfitr = null;

        System.out.println("<===Welcome To Zakat Al-fitr Calculator===>");
        System.out.println("");
        
        System.out.print("===> Enter The Number Of Family Members : ");
        int familyMembers = S.nextInt();
        System.out.println("");

        System.out.print("===> Enter The Category Of Zakat : (1-Rice | 2-Dates) : ");
        int zakatCategory = S.nextInt();
        System.out.println("");

        switch (zakatCategory) {
            case 1:
                zakatAlfitr = new Rice();
                break;
            case 2:
                zakatAlfitr = new Dates();
                break;
            default : 
            System.out.println("Incorrect Selection");   
        }
        if (zakatAlfitr != null) {
            System.out.println("<=========================================>");
            System.out.println("");
            zakatAlfitr.calculate(familyMembers);
            System.out.println("");
            System.out.println("<=========================================>");
        }     
        S.close();
    }
}
