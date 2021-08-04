public abstract class UnaryInstruction extends Instruction{
    protected String operand1;

    public UnaryInstruction() {}

    public UnaryInstruction(int id, String operand1) {
        super(id);
        this.operand1 = operand1;
    }

    public void changeOp(String op) {
        this.operand1 = op;
    }
}
