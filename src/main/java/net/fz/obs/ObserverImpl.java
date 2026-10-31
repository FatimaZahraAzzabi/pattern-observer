package net.fz.obs;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl implements Observer {

    private List<Integer> history=new ArrayList<Integer>();

    @Override
    public void update(int state) {
        history.add(state);
        double sum=0;
        for(int i=0;i<history.size();i++) {
            sum+=history.get(i);
        }

        System.out.println("Moyenne = " + sum/history.size());
    }
}
