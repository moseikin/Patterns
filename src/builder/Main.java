package builder;

public class Main {

    public static void main(String[] args) {
        Person person1 = new PersonBuilderImpl().setName("Ivan").setAge(27).build();
        System.out.println(person1);

        Person person2 = new PersonBuilderImpl().setName("Andrew").setAge(23).setCity("Moscow").build();
        System.out.println(person2);
    }
}
