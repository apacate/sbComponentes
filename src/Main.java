
import entities.Employee;
import services.PensionService;
import services.SalaryService;
import services.TaxBrazil;
import services.TaxService;

import java.util.Locale; // Para configurar o local de exibição de números e datas
import java.util.Scanner; // Para leitura de entradas do usuário

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        // Solicita e lê o nome do funcionário
        System.out.println("Nome: ");
        String name = sc.nextLine();
        // Solicita e lê o salário bruto do funcionário
        System.out.println("Salario bruto ");
        double grossSalary = sc.nextDouble();

        // Cria um objeto Employee com os dados fornecidos pelo usuário
        Employee employee = new Employee(name, grossSalary);


        TaxService taxService1=new TaxBrazil();
        PensionService pensionService1=new PensionService();

        SalaryService salaryService = new SalaryService(taxService1, pensionService1);

        // Calcula o salário líquido chamando o metodo netSalary e passando o objeto Employee
        double netSalary = salaryService.netSalary(employee);


        System.out.printf("Salario liquido: %.2f%n ", netSalary);
    }
}
