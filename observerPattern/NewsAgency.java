package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsAgencySubject {

    public String publishNews;
    public List<Subscriber> subscriberList = new ArrayList<>();

    public void setPublishNews(String publishNews) {
        this.publishNews = publishNews;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public String notifySubscriber() {
        String output = new String();
        for (Subscriber subscriber : subscriberList) {
            output += "Hello " + subscriber.getSubscriberName() + "!\n";
            output += "Here's a breaking news for you: " + publishNews + "\n\n";
        }
        return output;
    }
}
