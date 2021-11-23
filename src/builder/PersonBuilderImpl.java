package builder;

public class PersonBuilderImpl implements PersonBuilder{
    private final Person person = new Person();

    @Override
    public PersonBuilder setName(String name) {
        person.setName(name);
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        person.setAge(age);
        return this;
    }

    @Override
    public PersonBuilder setCity(String city) {
        person.setCity(city);
        return this;
    }

    @Override
    public Person build() {
        return person;
    }
}
