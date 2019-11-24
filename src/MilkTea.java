import java.util.Calendar;

public  class MilkTea {
    protected String name2;
    public   materia m;

    public MilkTea(String name2, materia m) {
        this.name2 = name2;
        this.m = m;
    }
    public String toString() {
        return "奶茶"+name2+m.toString();
    }
    public MilkTea() {
    }

}