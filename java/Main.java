import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Launching test module: \n");
        PPProg program = factoriel();

        // Printing PP
        System.out.println("PP: \n"+program);

        // Transforming from PP to UPP
        UPPProg upp = program.toUPP();

        // Printing UPP
        System.out.println("\n\nUPP: \n"+upp);

        // Transforming from UPP to RTL
        RTLProg rtl = upp.toRTL();

    }


    private static PPProg factoriel() {
        /*
         *
         *          Globals
         *
         */
        ArrayList<Pair<String, Type>> globals = new ArrayList<>();
        globals.add(new Pair<String, Type>("n", new Int()));

        /*
         *
         *          Defs
         *
         */
        ArrayList<PPDef> defs = new ArrayList<>();

        /*
         *
         *          Function
         *
         */
        ArrayList<Pair<String, Type>> vars = new ArrayList<>();
        vars.add(new Pair<String, Type>("n", new Int()));
        ArrayList<Pair<String, Type>> locals = new ArrayList<>();
        locals.add(new Pair<String, Type>("i", new Int()));
        Type ret = new Int();

        /*
         *
         *          Code
         *
         */

        // if (n == 0)
        PPExpr ifCondition = new PPEq(new PPVar("n"), new PPCte(0));
        // then ( f := 0)
        PPInst thenSeq = new PPAssign("f", new PPCte(0));
        // else
        PPInst other0 = new PPAssign("f", new PPCte(1));
        PPInst other1 = new PPAssign("i", new PPCte(1));
        PPInst while0 = new PPAssign("f", new PPMul(new PPVar("f"), new PPVar("i")));
        PPInst while1 = new PPAssign("i", new PPAdd(new PPVar("i"), new PPCte(1)));
        PPInst whileSeq = new PPSeq(while0, while1);
        PPExpr whileCondition = new PPLe(new PPVar("i"), new PPVar("n"));
        PPInst other2 = new PPWhile(whileCondition, whileSeq);
        PPInst otherSeq = new PPSeq(other1, other2);
        otherSeq = new PPSeq(other0, otherSeq);
        // Recurse
        PPInst functionCode = new PPCond(ifCondition, thenSeq, otherSeq);
        defs.add(new PPFun("f", vars, locals, functionCode, ret));
        // Read call
        PPFunCall read = new PPFunCall(new Read(), new ArrayList<PPExpr>());
        PPInst affect = new PPAssign("n", read);
        // Return
        ArrayList<PPExpr> callArgs0 = new ArrayList<>();
        callArgs0.add(new PPVar("n"));
        ArrayList<PPExpr> callArgs1 = new ArrayList<>();
        callArgs1.add(new PPFunCall(new User("f"), callArgs0));
        // Write
        PPInst write = new PPProcCall(new Write(), callArgs1);
        PPInst mainCode = new PPSeq(affect, write);

        PPProg program = new PPProg(globals, defs, mainCode);
        return program;
    }


}
