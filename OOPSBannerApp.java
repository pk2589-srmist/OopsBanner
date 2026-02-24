
class Banner {
    public String text;

    
    public Banner(String text) {
        this.text = text;
    }

    
    public void printBanner() {
        if (text.equalsIgnoreCase("OOPS")) {
            System.out.println("    ***       ***    ** ** **   ** ** **  ");
            System.out.println("  **   **   **   **  **    **   **        ");
            System.out.println(" **     ** **     ** **    **   **        ");
            System.out.println(" **     ** **     ** ** ** **   ** ** **  ");
            System.out.println(" **     ** **     ** **               **  ");
            System.out.println("  **   **   **   **  **               **  ");
            System.out.println("    ***       ***    **         ** ** **  ");
        } else {
            System.out.println("Banner for " + text + " not defined yet!");
        }
    }
}


public class OOPSBannerApp {
    public static void main(String[] args) {
        Banner banner = new Banner("OOPS");
        banner.printBanner();
    }
}