public class SemiPrintInstruction extends UnaryInstruction{

    public SemiPrintInstruction() {}

    public SemiPrintInstruction(int id, String op1) {
        super(id, op1);
    }

    @Override
    public void runInstruction() {
        System.out.println(this.operand1.substring(3));
    }
}
