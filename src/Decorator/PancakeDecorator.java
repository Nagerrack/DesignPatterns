package Decorator;

public class PancakeDecorator implements Pancake {
    protected Pancake p;

    public PancakeDecorator(Pancake p){
        this.p=p;
    }
    @Override
    public void Serve() {
        this.p.Serve();
    }
}
