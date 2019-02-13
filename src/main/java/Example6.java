package main.java;

import java.util.concurrent.Flow;

public class Example6 {
    public static void main(String[] args) {
        Flow.Publisher publisher = subscriber -> {
            subscriber.onNext(1);
            subscriber.onNext(2);
            subscriber.onNext(3);
            subscriber.onNext(4);
            subscriber.onNext(5);
        };

        Flow.Subscriber subscriber = new Flow.Subscriber() {
            @Override
            public void onSubscribe(Flow.Subscription subscription) {

            }

            @Override
            public void onNext(Object o) {
                System.out.println(o);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onComplete() {

            }
        };

        publisher.subscribe(subscriber);
    }
}
