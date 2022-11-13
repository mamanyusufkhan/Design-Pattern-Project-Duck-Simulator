public class CountingDuckFactory {

    public Quackable getCountingDuck(){
        return new CountingQuackableDecorator(new Duck());
    }

}
