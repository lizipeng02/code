package mode.observer;

import java.util.ArrayList;
import java.util.List;
/*
* 被观察者
* */
public class Subject {

    private List<Observer> observers
            = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
            //假如痛知不同的观察者做不同的事情，需要携带信息过去
            //observer.update(Subject su,Event event);
            //这个时候抽象出事件对象event，节省代码，就成了监听模式
        }
    }
}
