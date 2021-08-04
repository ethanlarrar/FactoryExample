public class SubInstruction extends BinaryInstruction{

    public SubInstruction() {}
    public SubInstruction(int id, String op1, String op2) {
        super(id, op1, op2);
    }

    @Override
    public void runInstruction() {
        System.out.println(this.operand1 + " - " + this.operand2);
    }
}
