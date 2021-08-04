public class Main {
    public static void main(String args[]) {
        InstructionFactory instructionFactory = new InstructionFactory();
        instructionFactory.addInstruction("Add", () -> new AddInstruction());
        instructionFactory.addInstruction("Sub", () -> new SubInstruction());
        instructionFactory.addInstruction("Print", () -> new PrintInstruction());
        instructionFactory.addInstruction("Semi", () -> new SemiPrintInstruction());

        instructionFactory.createInstruction("Add", 12, "bite", "Au Cul").runInstruction();
    }
}
