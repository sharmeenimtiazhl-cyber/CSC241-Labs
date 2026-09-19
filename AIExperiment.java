// AIExperiment.java
// CSC241 - Lab 02 - Task 5: Integrated BAI Challenge
// Sharmeen Imtiaz | SP26-BAI-045

class AIExperiment {
    // Instance variables (R1)
    String experimentName;
    int completedEpochs;
    int targetEpochs;

    // R3: increase completedEpochs
    void runEpochs(int epochs) {
        completedEpochs = completedEpochs + epochs;
    }

    // R4: overloaded runEpochs with bonus epochs
    void runEpochs(int epochs, int bonusEpochs) {
        int totalEpochs = epochs + bonusEpochs;
        completedEpochs = completedEpochs + totalEpochs;
    }

    // R5: remaining epochs to reach the target
    int remainingEpochs() {
        return targetEpochs - completedEpochs;
    }

    // R6: readable one-line summary
    String status() {
        return "Experiment: " + experimentName + " | Completed: " + completedEpochs
                + "/" + targetEpochs + " epochs | Remaining: " + remainingEpochs();
    }
}
