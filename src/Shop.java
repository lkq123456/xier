import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public interface Shop {
    void  in();
    void  sell() throws SoldOutException;
}
class teashop implements Shop{
    Calendar today  =Calendar.getInstance();// TODO: 2019/11/24

    ArrayList<Bubble> list1 = new ArrayList<Bubble>();
    ArrayList<Coconut> list2 = new ArrayList<Coconut>();
    public void in(){
        System.out.println("请进货珍珠3，椰果4 格式代号、年、月、日"+"\n");
        Scanner sc=new Scanner(System.in);
        int n;
        int d,m,y;
        n=sc.nextInt();
        y=sc.nextInt();
        m=sc.nextInt();
        d=sc.nextInt();
        if(n==3){
            Calendar c=Calendar.getInstance();
            c.set(y,m,d+7);
            materia x=new Bubble("珍珠",c);


            list1.add((Bubble)x);
        }
        else{
            Calendar c=Calendar.getInstance();
            c.set(y,m,d+5);
            materia x=new Coconut("椰果",c);

            list2.add((Coconut)x);
        }
        System.out.println("输入完毕 继续进货1 买奶茶2 结束0"+"\n");
    }

    @Override
    public void sell() throws SoldOutException {
        int n;
        System.out.println("需要什么奶茶珍珠奶茶5，椰果奶茶6"+"\n");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n==5){
            for(int i=0;i<list1.size();i++){
                Bubble temp=list1.get(i);
                if(temp.c.after(today)){
                    list1.remove(i);
                    MilkTea x=new MilkTea("珍珠奶茶",temp);
                    System.out.println("卖出珍珠奶茶 继续进货1 买奶茶2 结束0"+"\n");
                    break;
                }
                else {
                    list1.remove(i);
                    throw new SoldOutException("原料过期");
                }

            }

        }
        else{
            for(int i=0;i<list1.size();i++){
                Coconut temp=list2.get(i);
                if(temp.c.after(today)){
                    list2.remove(i);
                    MilkTea x=new MilkTea("椰果奶茶",temp);
                    System.out.println("卖出珍珠奶茶 继续进货1 买奶茶2 结束0"+"\n");
                    break;
                }
                else {
                    list2.remove(i);
                    throw new SoldOutException("原料过期");
                }

            }

        }
    }

}
class SoldOutException extends Exception{
    public SoldOutException(){}
    public SoldOutException(String msg){super(msg);}
}

