package mvc;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber){
        if(!subscribers.contains(subscriber)){
            subscribers.add(subscriber);
        }
    }

    public void unsubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(){
        for (Subscriber s: subscribers){
            s.update();
        }
    }
}
