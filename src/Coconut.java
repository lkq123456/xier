import java.util.Calendar;

public  class Coconut extends materia{
    public Coconut(String name, Calendar c){
        this.name = name;
        this.c = c;
        this.d = 5;
    }
    public Coconut() {
    }
    public String toString() {
        return "椰果 " + name + ", 保质期  " + d + "天, 生产日期"+c;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getdate() {
        return d;
    }

    public void setdate() {
        this.d = 5;
    }
}