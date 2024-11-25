public class Main {
    public static void main(String[] args) {

        PessoaFisica pessoaFisica = new PessoaFisica();
        PessoaJuridica pessoaJuridica = new PessoaJuridica();

        pessoaFisica.setNome("Nome da Pessoa Física");
        pessoaFisica.setEmail("pessoafisica@email.com");
        pessoaFisica.setTelefone(987654321L);

        pessoaFisica.setCPF(123456789);

        pessoaJuridica.setNome("Nome da Pessoa Jurídica");
        pessoaJuridica.setEmail("pessoajuridica@email.com");
        pessoaJuridica.setTelefone(975318642L);

        pessoaJuridica.setCNPJ(12345678910L);

        System.out.println("Classes abstratas");

        System.out.println(" ");
        System.out.println("Pessoa física");
        System.out.println("Nome ......:" + pessoaFisica.getNome());
        System.out.println("eMail .....:" + pessoaFisica.getEmail());
        System.out.println("Telefone ..:" + pessoaFisica.getTelefone());
        System.out.println("Documento .:" + pessoaFisica.getCPF());

        System.out.println(" ");
        System.out.println("Pessoa jurídica");
        System.out.println("Nome ......:" + pessoaJuridica.getNome());
        System.out.println("eMail .....:" + pessoaJuridica.getEmail());
        System.out.println("Telefone ..:" + pessoaJuridica.getTelefone());
        System.out.println("Documento .:" + pessoaJuridica.getCNPJ());
    }
}