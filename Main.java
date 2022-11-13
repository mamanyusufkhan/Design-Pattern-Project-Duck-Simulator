public class Main {

    public static void main(String[] args) {
        DuckFactory df1 = new DuckFactory();
        CountingDuckFactory df2 = new CountingDuckFactory();



        Quackable d1 = df1.getDuck();



        Quackable d2 = df1.getDuck();

        Observer obv1 = new QuackObserver(d1.getSubject(), "Dr. Robert");
        Observer obv2 = new QuackObserver(d1.getSubject(), "Dr. John");

        Observer obv3 = new QuackObserver(d2.getSubject(), "Dr. Suresh");





        Goose g = new Goose(new DuckAdapter());
        System.out.print("Goose's noise: ");
        g.makeNoise();
        System.out.println("\n");
        Quackable d3 = df2.getCountingDuck();
        Observer obv4 = new QuackObserver(d3.getSubject(), "Dr. Ahmed");

        Flock f1 = new Flock();
        f1.add(d1);
        f1.add(d2);
        f1.add(d3);

        for (int i = 0; i < 3; i++){
            int iter = i + 1;
            System.out.println("Iteration " + iter +": ");
            f1.quack();
        }


    }

}
