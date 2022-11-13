public abstract class QuackableDecorator implements Quackable{

    protected Quackable decoratedQuackable;

    public QuackableDecorator(Quackable decoratedQuackable){
        this.decoratedQuackable = decoratedQuackable;
    }

    public abstract void quack();

}
