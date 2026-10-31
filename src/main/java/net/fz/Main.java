package net.fz;

import net.fz.obs.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Observable observable = new ObservableImpl();
        Observer o1 = new ObserverImpl();
        Observer o2 = new ObserverImpl2();
        Observer o3 = new ObserverImpl();

        observable.setState(60);

        observable.subscribe(o1);
        observable.subscribe(o2);
        observable.subscribe(o3);


    }
}