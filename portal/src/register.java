import java.util.Scanner;

public class register {
    static Scanner in;
    private  String name;
    private String regno;
    private int maths;
    private int physics;
    private int chemistry;
    private int total;
    private int cutoff;

    public register() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getCutoff() {
        return cutoff;
    }

    public void setCutoff(int cutoff) {
        this.cutoff = cutoff;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    public register(String name, String regno, int maths, int physics, int chemistry, int total, int cutoff) {
        this.name = name;
        this.regno = regno;
        this.maths = maths;
        this.physics = physics;
        this.chemistry = chemistry;
        this.total = total;
        this.cutoff = cutoff;
    }
}
