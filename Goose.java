public class Goose implements Bird{

    DuckAdapter duckAdapter;

    public Goose(DuckAdapter duckAdapter){
        this.duckAdapter = duckAdapter;
    }

    public void makeNoise() {
        duckAdapter.makeNoise();
    }
}
