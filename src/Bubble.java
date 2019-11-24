import java.util.Calendar;

public  class Bubble extends materia{
    public Bubble(String name, Calendar c){
        this.name = name;
        this.c = c;
        this.d = 7;
    }
    public Bubble() {
    }

    public String toString() {
        return "珍珠 " + name + ", 保质期  " + d + "天, 生产日期"+c;
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
        this.d = 7;
    }
    }

