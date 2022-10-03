import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class Consumer {
    public static void main(String[] args) {

        LocalDateTime localDateTimeSogolon = LocalDateTime.of(1992, 8, 1, 6, 5);
        LocalDateTime localDateTimeIuri = LocalDateTime.of(1999, 6, 22, 8, 23);
        LocalDateTime localDateTimeMatheus = LocalDateTime.of(1991, 9, 19, 4, 59);
        LocalDateTime localDateTimeVictoria = LocalDateTime.of(1993, 8, 30, 2, 34);
        LocalDateTime localDateTimeTomas = LocalDateTime.of(1999, 8, 30, 7, 2);
        List<LocalDateTime> datasDeNascimento = Arrays.asList(localDateTimeIuri, localDateTimeMatheus, localDateTimeSogolon,localDateTimeTomas,localDateTimeVictoria);


        // CONSUMER - INTERFACE
        System.out.println("Consumer Interface :");
        java.util.function.Consumer<LocalDateTime> consumerInterface = new java.util.function.Consumer<LocalDateTime>() {
            @Override
            public void accept(LocalDateTime localDateTime) {
                System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
            }
        };
        for (LocalDateTime date : datasDeNascimento){
            consumerInterface.accept(date);
        }


        // CONSUMER - LAMBDA
        System.out.println("Consumer Lambda :");
        java.util.function.Consumer<LocalDateTime> consumerLambda = (localDateTime) -> System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        for (LocalDateTime date : datasDeNascimento){
            consumerLambda.accept(LocalDateTime.now());
        }

        // CONSUMER - CLASSE
        System.out.println("Consumer Classe :");
        java.util.function.Consumer<LocalDateTime> consumerClasse = new ConsumerFunction();
        consumerClasse.accept(LocalDateTime.now());
        for (LocalDateTime date : datasDeNascimento){
            consumerLambda.accept(date);
        }
    }

    public static class ConsumerFunction implements java.util.function.Consumer<LocalDateTime> {
        @Override
        public void accept(LocalDateTime localDateTime) {
            System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        }
    }
}
