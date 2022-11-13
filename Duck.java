public class Duck implements Quackable{

    private Subject subject;

    public Duck(){
        subject = new Subject();
    }

    public Subject getSubject(){
        return subject;
    }

    public void quack(){
        System.out.println("Quack");
        subject.notifyAllObservers();

    }

    public void addNewSubscriber(Observer obv){
        subject.attach(obv);
    }



}
