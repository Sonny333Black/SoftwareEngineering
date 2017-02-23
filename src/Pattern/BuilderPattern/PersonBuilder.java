package Pattern.BuilderPattern;

/**
 * Created by milena on 13/12/2016.
 */
public class PersonBuilder {


    private String firstName; //required
    private String lastName; //required
    private String email;//optional
    private String phone;//optional

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public PersonBuilder(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public PersonBuilder withEmail(String email){
        this.email = email;
        return this;
    }

    public PersonBuilder withPhone(String phone){
        this.phone = phone;
        return this;
    }

    public Person getResult(){
        return new Person(this);
    }
}
