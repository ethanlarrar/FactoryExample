public class PrintInstruction extends UnaryInstruction{

    public PrintInstruction() {}
    public PrintInstruction(int id, String op1) {
        super(id, op1);
    }

    @Override
    public void runInstruction() {
        System.out.println(this.operand1);
    }
}
