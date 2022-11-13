import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable{
    private List<Quackable> ducks = new ArrayList<Quackable>();
    Subject subject = new Subject();

    public void add(Quackable duck){
        ducks.add(duck);
    }

    public void remove(Quackable duck){
        ducks.remove(duck);
    }

    public Subject getSubject(){
        return subject;
    }

    public void quack(){
        int i = 0;
        Iterator <Quackable> iterator = ducks.iterator();
        while(iterator.hasNext()){
            Quackable duck = (Quackable)iterator.next();
            i++;
            System.out.println("Duck number :" + i);
            duck.quack();
            System.out.println("\n");
        }
    }

}
