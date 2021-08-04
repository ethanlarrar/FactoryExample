import java.util.HashMap;

public class InstructionFactory {
    private HashMap<String, InstructionCreator> instructions;

    public InstructionFactory() {
        instructions = new HashMap<String, InstructionCreator>();
    }

    public Instruction createInstruction(String name, int id) {
        Instruction instruction =  this.instructions.get(name).getInstruction();
        instruction.changeId(id);

        return instruction;
    }

    public Instruction createInstruction(String name, int id, String op1) {

        UnaryInstruction instruction = (UnaryInstruction)createInstruction(name, id);
        instruction.changeOp(op1);

        return instruction;
    }

    public Instruction createInstruction(String name, int id, String op1, String op2) {
        BinaryInstruction instruction = (BinaryInstruction) createInstruction(name, id);
        instruction.changeOp1(op1);
        instruction.changeOp2(op2);

        return instruction;
    }

    public void addInstruction(String name, InstructionCreator func) {
        this.instructions.put(name, func);
    }
}
