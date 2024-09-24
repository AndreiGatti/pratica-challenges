import br.com.challenges.curso2.model.Book;

public class MainChallenges {
    public static void main(String[] args) {
        /*br.com.challenges.curso2.User userShow = new br.com.challenges.curso2.User();
        userShow.sayHello();*/

        /*br.com.challenges.curso2.Calculator numberOp = new br.com.challenges.curso2.Calculator();
        System.out.println(numberOp.calc());*/

        /*br.com.challenges.curso2.Music musicS = new br.com.challenges.curso2.Music();
        musicS.artist = "Slipknot";
        musicS.title = "Vermilion Pt.2";
        musicS.launchYear= 2004;

        musicS.showTechincalSheet();
        musicS.rating(10);
        musicS.rating(9);
        musicS.rating(10);

        System.out.println(musicS.getAverage());*/

        /*br.com.challenges.curso2.Car car = new br.com.challenges.curso2.Car();
        car.year=2005;
        car.color="Azul";
        car.model="Gol";

        car.showTechincalSheet();

        System.out.println("A idade do carro é: "+ car.calcAge());*/

        /*br.com.challenges.curso2.Student student = new br.com.challenges.curso2.Student();

        student.age=19;
        student.name="Andrei Gatti";

        student.showStudent();*/

        /*br.com.challenges.model.PersonAge personAge = new br.com.challenges.model.PersonAge();

        personAge.setAge(18);

        personAge.ageVerifier();*/

        /*br.com.challenges.model.BankAccount account = new br.com.challenges.model.BankAccount();

        account.setAccountNumber(123);
        account.setAccountBalance(1000);
        account.setAccountHolder("Andrei");

        System.out.println("Número da conta: " + account.getAccountNumber());
        System.out.println("Saldo: " + account.getAccountBalance());
        System.out.println("Titular: "+ account.getAccountHolder());

        account.setAccountBalance(1500);
        System.out.println("Novo saldo: " + account.getAccountBalance());*/

        /*br.com.challenges.model.PersonAge person1 = new br.com.challenges.model.PersonAge();
        person1.setName("Gabriel");
        person1.setAge(15);

        br.com.challenges.model.PersonAge person2 = new br.com.challenges.model.PersonAge();
        person2.setName("Danilo");
        person2.setAge(22);

        System.out.println(person1.getName() + " tem " + person1.getAge() + " anos ");
        person1.ageVerifier();

        System.out.println(person2.getName() + " tem " + person2.getAge() + " anos ");
        person2.ageVerifier();*/

        /*br.com.challenges.model.Product product = new br.com.challenges.model.Product("Celular", 2000.0);

        System.out.println("Nome do br.com.challenges.curso1.Produto: " + product.getName());
        System.out.println("Preço: " + product.getPrice());

        product.applyDiscount(10);
        System.out.println("Novo preço após br.com.challenges.curso1.Desconto: " + product.getPrice());*/


       /* br.com.challenges.model.StudentOO student1 = new br.com.challenges.model.StudentOO("Danilo", 7.5, 8.0, 9.2);
        br.com.challenges.model.StudentOO student2 = new br.com.challenges.model.StudentOO("Andrei", 6.8, 7.3, 8.5);

        System.out.println("Aluno 1:");
        System.out.println("Nome: "+ student1.getName());
        System.out.println("Nota 1: "+ student1.getGrade1());
        System.out.println("Nota 2: "+ student1.getGrade2());
        System.out.println("Nota 3: "+ student1.getGrade3());
        System.out.println("Média: "+ student1.averageCalculator());
        System.out.println();

        System.out.println("Aluno 2:");
        System.out.println("Nome: "+ student2.getName());
        System.out.println("Nota 1: "+ student2.getGrade1());
        System.out.println("Nota 2: "+ student2.getGrade2());
        System.out.println("Nota 3: "+ student2.getGrade3());
        System.out.println("Média: "+ student2.averageCalculator());
        System.out.println();*/

        Book book1 = new Book();
        book1.setTitle("Lógica de programação");
        book1.setAuthor("Paulo Silveira");

        Book book2 = new Book();
        book2.setTitle("A lógica do jogo");
        book2.setAuthor("Marcus Becker");

        book1.showDetails();
        book2.showDetails();

    }
}
