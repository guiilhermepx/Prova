package prova;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("555586572", "001-413-642-43", "88546887.564", "576.5798.23", 
                Setor.OPERACOES, 1250.00, LocalDate.of(1997, Month.AUGUST, 9), Genero.FEMININO, "Marta", "(71) 98745-5683", "martinhamb@gmail.com",
                new Endereco("Avenida", "124", "Bloco C", "40134.548", "Salvador", UnidadeFederativa.BAHIA));
        
        Medico medico = new Medico("13876132", "887-985-687-45", "84354.57", "847.2687.942", 
                Setor.SAUDE, 7290.00, LocalDate.of(1993, Month.AUGUST, 30), Genero.MASCULINO, "Ednaldo", "(71) 98745-6387", "ednaldopereira@gmail.com",
                new Endereco("Avenida", "75", "Bloco A", "40133.548", "Campinas", UnidadeFederativa.SAO_PAULO));
        
        Advogado advogado = new Advogado("56853135", "587-795-737-45", "812344.57", "687.547.678.122", 
                Setor.JURIDICO, 8290.00, LocalDate.of(1990, Month.JULY, 20), Genero.MASCULINO, "Rogério", "(71) 95615-6387", "rogerin@gmail.com",
                new Endereco("Rua", "36", "Casa", "40154.548", "Salvador", UnidadeFederativa.BAHIA));
        
        Juridica juridica = new Juridica("547.354.987.22", "578623", "Casa do arroz", "(71) 9845-3546", 
                "casadoarroz@hotmail.com", new Endereco("Avenida", "1123", "Prédio", "40654-896", "Salvador", UnidadeFederativa.BAHIA));
        
        Cliente cliente = new Cliente(554786, LocalDate.of(1976, Month.DECEMBER, 6), Genero.FEMININO, "Maria", 
                "(71) 97845-6578", "mariazinha@gmail.com", new Endereco("Rua", "90", "Casa", "45123-234", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO));
    
        System.out.println("Pessoas Físicas: ");
        System.out.println("\n- Motoboy -");
        System.out.println(motoboy.toString());
        System.out.println("");
        System.out.println("- Médico -");
        System.out.println(medico.toString());
        System.out.println("");
        System.out.println("- Advogado -");
        System.out.println(advogado.toString());
        System.out.println("");
        System.out.println("- Cliente -");
        System.out.println(cliente.toString());
        System.out.println("");
        System.out.println("Jurídica: ");
        System.out.println(juridica.toString());
    }
}
