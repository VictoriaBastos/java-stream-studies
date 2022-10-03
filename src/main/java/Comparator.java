import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparator {
    public static void main(String[] args) {

        LocalDateTime localDateTimeSogolon = LocalDateTime.of(1992, 8, 1, 6, 5);
        LocalDateTime localDateTimeIuri = LocalDateTime.of(1999, 6, 22, 8, 23);
        LocalDateTime localDateTimeMatheus = LocalDateTime.of(1991, 9, 19, 4, 59);
        LocalDateTime localDateTimeVictoria = LocalDateTime.of(1993, 8, 30, 2, 34);
        LocalDateTime localDateTimeTomas = LocalDateTime.of(1999, 8, 30, 7, 2);

        LocalDateTime [] datasNascimento = {localDateTimeIuri, localDateTimeMatheus, localDateTimeSogolon,localDateTimeTomas,localDateTimeVictoria};
        List<LocalDateTime> datasDeNascimento = Arrays.asList(localDateTimeIuri, localDateTimeMatheus, localDateTimeSogolon,localDateTimeTomas,localDateTimeVictoria);

        System.out.println("Datas de nascimento:");
        System.out.println(datasDeNascimento);


        // COMPARATOR - INTERFACE

        java.util.Comparator<LocalDateTime> sortInterface = new java.util.Comparator<LocalDateTime>() {
            @Override
            public int compare(LocalDateTime o1, LocalDateTime o2) {
                return o1.getYear() - o2.getYear();
            }
        };

        System.out.println("\nComparator - Implementa Interface:");
        print(datasNascimento, sortInterface);

        // COMPARATOR - LAMBDA

        System.out.println("\nComparator - Lambda:");
        Collections.sort(datasDeNascimento, (o1, o2) -> { return o1.getYear() - o2.getYear();});
        System.out.println(datasDeNascimento);

        // COMPARATOR - CLASSE
        System.out.println("\nComparator - Classe:");
        java.util.Comparator<LocalDateTime> sortclasse = new ComparatorFunction();
        Collections.sort(datasDeNascimento, sortclasse);
        System.out.println(datasDeNascimento);
    }

    public static void print(LocalDateTime [] list, java.util.Comparator<LocalDateTime> comparator){
        Arrays.sort(list, comparator);
        System.out.println(Arrays.toString(list));
    }

    public static class ComparatorFunction implements java.util.Comparator<LocalDateTime> {
        @Override
        public int compare(LocalDateTime o1, LocalDateTime o2) {
            return o1.getYear() - o2.getYear();
        }
    }
}
