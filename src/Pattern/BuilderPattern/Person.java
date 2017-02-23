package Pattern.BuilderPattern;

/**
 * Created by milena on 13/12/2016.
 */
public class Person {

    private final String firstName; //required
    private final String lastName; //required
    private final String email;//optional
    private final String phone;//optional

    private Person(String firstName, String lastName){
        this(firstName, lastName, null);
    }

    private Person(String firstName, String lastName, String email){
        this(firstName, lastName, email, null);
    }

    private Person(String firstName, String lastName, String email,
                   String phone){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public Person(PersonBuilder personBuilder){
        this(personBuilder.getFirstName(), personBuilder.getLastName(),
            personBuilder.getEmail(), personBuilder.getPhone());
    }

    @Override
    public String toString(){
        return ("Person with " +this.firstName + " " + this.lastName);
    }


}
