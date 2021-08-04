public abstract class Instruction {
    protected int id;

    public Instruction() {}

    public Instruction(int id) {
        this.id = id;
    }

    public void changeId(int id) {
        this.id = id;
    }

    public abstract void runInstruction();
}
