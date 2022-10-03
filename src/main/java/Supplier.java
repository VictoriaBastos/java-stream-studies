import java.util.Arrays;
import java.util.List;

public class Supplier {
    public static void main(String[] args) {

        // SUPPLIER - INTERFACE

        System.out.println("Supplier Interface :");
        java.util.function.Supplier<List<String>> supplierInterface = new java.util.function.Supplier<List<String>>() {
            @Override
            public List<String> get() {
                return List.of( "Áries: do 21 de março a 20 de abril",
                        "Touro: de 21 de abril a 20 de maio",
                        "Gêmeos: de 21 de maio a 20 de junho",
                        "Câncer: de 21 de junho a 22 de julho",
                        "Leão: de 23 de julho a 22 de agosto",
                        "Virgem: de 23 de agosto a 22 de setembro",
                        "Libra: de 23 de setembro a 22 de outubro",
                        "Escorpião: de 23 de outubro a 21 de novembro",
                        "Sagitário: de 22 de novembro a 21 de dezembro",
                        "Capricórnio: de 22 de dezembro a 20 de janeiro",
                        "Aquário: de 21 de janeiro a 18 de fevereiro",
                        "Peixes: de 19 de fevereiro a 20 de março");
            }
        };
        System.out.println(supplierInterface.get());

        // SUPPLIER - LAMBDA
        System.out.println("Supplier Lambda :");

        List<String> signos = Arrays.asList( "Áries: do 21 de março a 20 de abril",
                "Touro: de 21 de abril a 20 de maio",
                "Gêmeos: de 21 de maio a 20 de junho",
                "Câncer: de 21 de junho a 22 de julho",
                "Leão: de 23 de julho a 22 de agosto",
                "Virgem: de 23 de agosto a 22 de setembro",
                "Libra: de 23 de setembro a 22 de outubro",
                "Escorpião: de 23 de outubro a 21 de novembro",
                "Sagitário: de 22 de novembro a 21 de dezembro",
                "Capricórnio: de 22 de dezembro a 20 de janeiro",
                "Aquário: de 21 de janeiro a 18 de fevereiro",
                "Peixes: de 19 de fevereiro a 20 de março");

        java.util.function.Supplier<List<String>> supplierLambda = () -> signos;
        System.out.println(supplierLambda.get());


        // SUPPLIER - CLASSE
        System.out.println("Supplier Classe :");

        java.util.function.Supplier<List<String>> supplierClasse = new SupplierFunction();
        System.out.println(supplierClasse.get());

    }

    private static class SupplierFunction implements java.util.function.Supplier<List<String>> {

        @Override
        public List<String> get() {
            return Arrays.asList( "Áries: do 21 de março a 20 de abril",
                    "Touro: de 21 de abril a 20 de maio",
                    "Gêmeos: de 21 de maio a 20 de junho",
                    "Câncer: de 21 de junho a 22 de julho",
                    "Leão: de 23 de julho a 22 de agosto",
                    "Virgem: de 23 de agosto a 22 de setembro",
                    "Libra: de 23 de setembro a 22 de outubro",
                    "Escorpião: de 23 de outubro a 21 de novembro",
                    "Sagitário: de 22 de novembro a 21 de dezembro",
                    "Capricórnio: de 22 de dezembro a 20 de janeiro",
                    "Aquário: de 21 de janeiro a 18 de fevereiro",
                    "Peixes: de 19 de fevereiro a 20 de março");
        }
    }
}
