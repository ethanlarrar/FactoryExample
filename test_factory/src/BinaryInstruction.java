public abstract class BinaryInstruction extends Instruction {
    protected String operand1;
    protected String operand2;

    public BinaryInstruction() {}

    public BinaryInstruction(int id, String op1, String op2) {
        super(id);
        this.operand1 = op1;
        this.operand2 = op2;
    }

    public void changeOp1(String newOp) {
        this.operand1 = newOp;
    }

    public void changeOp2(String newOp) {
        this.operand2 = newOp;
    }
}
