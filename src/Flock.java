import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable{
    ArrayList allDucks = new ArrayList();
    int check = 0 ;
    boolean boss = false ;
    public void add(Quackable duck) {
        allDucks.add(duck);
        if (check == 0){
            boss =  true ;
        }
    }
    @Override
    public void quack() {
        Iterator iterator = allDucks.iterator();
        while (iterator.hasNext()) {
            Quackable eachDuck = (Quackable) iterator.next();
            eachDuck.quack();
            if (boss==true) {
                eachDuck.quack();
                eachDuck.quack();
                boss = false;
                check++;
            }

        }
    }
}