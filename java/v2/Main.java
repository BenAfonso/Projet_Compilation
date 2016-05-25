public class Main {

    public static void main(String[] args) {
        boolTests();
    }

    private static void boolTests(){

        System.out.println("===========   Booleans tests ============\n");
        System.out.println(":: Creating two booleans: ");
        PPTrue True = new PPTrue();
        PPFalse False = new PPFalse();
        System.out.println(True.toString());
        System.out.println(False.toString());

        // Not
        System.out.println("\n:: Testing PPNot class: ");
        PPNot not = new PPNot(True);
        System.out.println(not.toString());
        not = new PPNot(False);
        System.out.println(not.toString());

        // And
        System.out.println("\n:: Testing PPAnd class: ");
        PPAnd and = new PPAnd(True, False);
        System.out.println(and.toString());
        and = new PPAnd(True, True);
        System.out.println(and.toString());
        and = new PPAnd(False, False);
        System.out.println(and.toString());

    }


}
