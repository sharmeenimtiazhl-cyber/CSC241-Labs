// AIExperimentDemo.java
// CSC241 - Lab 02 - Task 5: Integrated BAI Challenge
// Sharmeen Imtiaz | SP26-BAI-045

class AIExperimentDemo {

    // R9: helper method that mutates an AIExperiment object through a copied reference
    void boostEpochs(AIExperiment exp, int extra) {
        exp.completedEpochs = exp.completedEpochs + extra;
    }

    public static void main(String[] args) {
        AIExperimentDemo demo = new AIExperimentDemo();

        // R2: two independent AIExperiment objects
        AIExperiment exp1 = new AIExperiment();
        exp1.experimentName = "ImageClassifier";
        exp1.completedEpochs = 5;
        exp1.targetEpochs = 20;

        AIExperiment exp2 = new AIExperiment();
        exp2.experimentName = "TextSummarizer";
        exp2.completedEpochs = 8;
        exp2.targetEpochs = 25;

        System.out.println("Initial state:");
        System.out.println(exp1.status());
        System.out.println(exp2.status());

        // R3 & R4: call runEpochs (single arg) and runEpochs (overloaded, two args)
        exp1.runEpochs(3);
        exp2.runEpochs(2, 1);

        System.out.println("\nAfter runEpochs calls:");
        System.out.println(exp1.status());
        System.out.println(exp2.status());

        // R8: demonstrate that changing one experiment does not change the other
        System.out.println("\nR8 check - exp1 and exp2 remain independent:");
        System.out.println("exp1 completedEpochs: " + exp1.completedEpochs);
        System.out.println("exp2 completedEpochs: " + exp2.completedEpochs);

        // R9: pass exp1 to a helper method that modifies completedEpochs
        demo.boostEpochs(exp1, 4);
        System.out.println("\nAfter boostEpochs(exp1, 4):");
        System.out.println(exp1.status());
        // The mutation is visible because the reference value is copied into the
        // parameter exp, and that copy still points to the same object as the caller's exp1.

        System.out.println("\nFinal remaining epochs:");
        System.out.println(exp1.experimentName + " remaining: " + exp1.remainingEpochs());
        System.out.println(exp2.experimentName + " remaining: " + exp2.remainingEpochs());
    }
}
