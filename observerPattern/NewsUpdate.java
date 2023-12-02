package observerPattern;

public class NewsUpdate {

    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        Subscriber isaiah = new Subscriber();
        isaiah.setSubscriberName("Isaiah");
        Subscriber phil = new Subscriber();
        phil.setSubscriberName("Phil");
        Subscriber jun = new Subscriber();
        jun.setSubscriberName("Jun");

        newsAgency.subscribe(isaiah);
        newsAgency.subscribe(jun);

        System.out.println("\tBREAKING NEWS!");
        newsAgency.setPublishNews("Philippine volcano Mount Mayon erupts, spewing ash and lava.");
        System.out.println(newsAgency.notifySubscriber());

        newsAgency.unsubscribe(jun);

        System.out.println("\tJUST IN! BREAKING NEWS!");
        newsAgency.setPublishNews("Philippine national basketball team, the Gilas Pilipinas, defeats China to win the FIBA Asia Cup.");
        System.out.println(newsAgency.notifySubscriber());

        newsAgency.subscribe(phil);

        System.out.println("\tFLASH NEWS!");
        newsAgency.setPublishNews("Philippine peso hits new all-time low against the US dollar.");
        System.out.println(newsAgency.notifySubscriber());
    }

}
