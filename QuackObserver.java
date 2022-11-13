public class QuackObserver extends Observer{

    public QuackObserver(Subject subject, String name){
        this.name = name;
        this.subject = subject;
        this.subject.attach(this);
    }
    public void update(){
        System.out.println(this.name + " has been notified about the Quack");
    }


}
