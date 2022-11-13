public class CountingQuackableDecorator extends QuackableDecorator{

    private int countNumber;
    Subject subject = new Subject();


    public CountingQuackableDecorator(Quackable decoratedQuackable){
        super(decoratedQuackable);
        this.countNumber = 0;
    }

    public void quack(){
        System.out.println("Quack");
        this.countNumber++;
        getCount();
        subject.notifyAllObservers();


    }
    public Subject getSubject(){
        return subject;
    }

    public void addNewSubscriber(Observer obv){
        subject.attach(obv);
    }

    public void getCount() {
        if (this.countNumber == 1) {
            System.out.println("Duck has quacked " + this.countNumber + " time");

        }
        else{
            System.out.println("Duck has quacked " + this.countNumber + " times");
        }
    }
}
