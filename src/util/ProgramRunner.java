package util;

import Core.View;
import Core.impl.ComplexCalculator;

public class ProgramRunner {
    private static void ProgramRunner(){
        View view = new View(new Logger(new ComplexCalculator()));
        view.run();

    }
    public static void Run(){
        ProgramRunner();
    }
}
