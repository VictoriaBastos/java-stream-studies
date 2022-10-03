public class Predicate {
    public static void main(String[] args) {

        // PREDICATE - INTERFACE
        java.util.function.Predicate<Integer> isGeracaoZInterface = new java.util.function.Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer >= 1995 && integer <= 2010;
            }
        };
        System.out.println("Predicate Interface :" + isGeracaoZInterface.test(1998)); //true

        // PREDICATE - LAMBDA
        java.util.function.Predicate<Integer> isGeracaoZLambda = (integer) -> integer >= 1995 && integer <= 2010;
        System.out.println("Predicate Lambda :" + isGeracaoZLambda.test(2012)); //false

        // PREDICATE - CLASSE
        java.util.function.Predicate<Integer> isGeracaoZClasse = new PredicateFunction();
        System.out.println("Predicate Classe :" + isGeracaoZClasse.test(1993)); //false
    }

    public static class PredicateFunction implements java.util.function.Predicate<Integer> {

        @Override
        public boolean test(Integer integer) {
            return integer >= 1995 && integer <= 2010;
        }
    }
}
