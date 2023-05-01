public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Gladston", "gladston@empresa.com",
                "1111111111", "Financeiro",
                5000.00, "01/01/2020", "123456789");
        Funcionario funcionario2 = new Funcionario("Felipe", "felipes@empresa.com",
                "2222222222", "Recursos Humanos",
                6000.00, "01/02/2020", "987654321");
        Funcionario funcionario3 = new Funcionario("Edson", "edson@empresa.com",
                "3333333333", "TI",
                8000.00, "01/03/2020", "456789123");
        Funcionario funcionario4 = new Funcionario("Arthur", "arthur@empresa.com",
                "4444444444", "Marketing",
                5500.00, "01/04/2020", "321654987");
        Funcionario funcionario5 = new Funcionario("Eduardo", "eduardo@empresa.com",
                "5555555555", "Comercial",
                7000.00, "01/05/2020", "789456123");

        Empresa empresa = new Empresa("CT INTERPRISES", "123456789/0001-01", 100);
        empresa.adicionarFuncionario(funcionario1);
        empresa.adicionarFuncionario(funcionario2);
        empresa.adicionarFuncionario(funcionario3);
        empresa.adicionarFuncionario(funcionario4);
        empresa.adicionarFuncionario(funcionario5);

        empresa.listarFuncionarios();
    }
}
