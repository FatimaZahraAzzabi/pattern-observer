package net.fz.obs;

public class ObserverImpl2 implements Observer{
    @Override
    public void update(int state) {
        System.out.println("****************");
        System.out.println("new State: " + state);
        System.out.println("****************");
    }
}
