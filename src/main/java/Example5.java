import java.util.concurrent.*;

public class Example5 {
    public static void main(String[] args) {
        CompletableFuture completableFuture1 = calculateAsync();
        completableFuture1.completeOnTimeout("Hello", 200, TimeUnit.MILLISECONDS);
        showResults(completableFuture1);

        CompletableFuture completableFuture2 = calculateAsync();
        completableFuture2.completeOnTimeout("Hello", 600, TimeUnit.MILLISECONDS);
        showResults(completableFuture2);

        CompletableFuture completableFuture3 = CompletableFuture.completedFuture("!!!");
        showResults(completableFuture3);
    }

    private static void showResults(CompletableFuture completableFuture) {
        try {
            System.out.println(completableFuture.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    private static CompletableFuture<String> calculateAsync() {
        CompletableFuture<String> completableFuture
                = new CompletableFuture<>();

        completableFuture.defaultExecutor().execute(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            completableFuture.complete("World");
        });

        return completableFuture;
    }
}
