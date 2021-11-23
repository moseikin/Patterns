package builder;

public interface PersonBuilder {

    // тип возвращаемого значения PersonBuilder позволяет делать присвоения по цепочке
    // как в Lombok @Accessors(chain = true)
    PersonBuilder setName(String name);

    PersonBuilder setAge(int age);

    PersonBuilder setCity(String city);

    Person build();
}
