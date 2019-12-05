package btu;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
public class qavtara {
    public static void main(String[] args) {
        ArrayList arrayList =  new ArrayList();
        ArrayList New = new ArrayList();
        Random rand = new Random();

        for (int j = 0; j<12; j++)
        {
            New.add(rand.nextInt(10 - 5 + 1) + 5);
            arrayList.add(rand.nextInt(100));
        }
        Even(arrayList);
        _3multiple(New,rand);

    }
    public static void  Even(ArrayList newlist){
        ArrayList New1list = newlist;
        System.out.println("Even Function");
        System.out.println(newlist);
        for (int i=0; i < New1list.size();){
            New1list.remove(i);
            i++;
        }
        Collections.sort(New1list);
        System.out.println(New1list);
        System.out.println("");
    }
    public static void _3multiple(ArrayList New, Random rand){
        ArrayList Newone = new ArrayList();
        Newone = New;
        System.out.println("3multiple function");
        System.out.println(New);

        for (int i=0; i < 12;i++){
            i++;
            i++;
            i++;
            Newone.add(i,rand.nextInt(25 - 20 + 1) + 20);

        }

        System.out.println(Newone);

    }
}
