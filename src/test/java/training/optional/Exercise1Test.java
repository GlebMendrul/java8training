package training.optional;


import org.junit.Test;
import training.util.domain.BaseTest;
import training.util.domain.Customer;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import static java.util.Optional.empty;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class Exercise1Test extends BaseTest {

    @Test
    public void optionalTest1() {
        assertEquals("John", getCustomerName(null));
        assertEquals("John", getCustomerName(new Customer()));

        Customer customer = new Customer();
        customer.setName("Alice");

        assertEquals("Alice", getCustomerName(customer));
    }

    @Test(expected = IllegalArgumentException.class)
    public void optionalTest2() {
        assertEquals("John", getCustomerNameFromDb(Optional::empty));
    }

    @Test
    public void optionalTest3() {
        Customer customer = new Customer();
        customer.setName("John");
        assertEquals("John", getCustomerNameFromDb(() -> Optional.of(customer)));
    }

    @Test
    public void optionalTest4() {
        Customer customer = new Customer();
        customer.setName("John");
        assertEquals("Unknown", getInsuranceName(null));
        assertEquals("Unknown", getInsuranceName(new Person()));

        Person person = new Person();
        person.setCar(new Car());

        assertEquals("Unknown", getInsuranceName(person));

        Person personWithInsurance = new Person();
        Car carWithInsurance = new Car();
        carWithInsurance.setInsurance(new Insurance());
        personWithInsurance.setCar(carWithInsurance);

        assertEquals("insurance name", getInsuranceName(personWithInsurance));
    }

    @Test(expected = IllegalArgumentException.class)
    public void optionalTest5() {
        Customer customer = findAnyCustomer(() -> null);
    }

    @Test
    public void optionalTest6() {
        Customer customer = findAnyCustomer(() -> Arrays.asList(new Customer(), new Customer()));
        assertNotNull(customer);
    }

    /**
     * return customer name, if there is no customer name return John
     * keep in mind that customer can be null
     */
    private String getCustomerName(Customer customer) {
        return null;
    }

    /**
     * Return user name or throw IllegalArgumentException if user not found
     */
    private String getCustomerNameFromDb(Supplier<Optional<Customer>> dataBase) {
        return null;
    }

    /**
     * Return insurance name, if not present then Unknown
     */
    private String getInsuranceName(Person person) {
        return null;
    }

    /**
     * Refactor this shit
     */
    public Customer findAnyCustomer(Supplier<List<Customer>> dataBase) {
        Optional<List<Customer>> customers = findCustomer(dataBase);
        if (customers.isPresent() && !customers.get().isEmpty()) {
            return customers.get().get(0);
        }
        throw new IllegalArgumentException("No customer found");
    }

    /**
     * And this
     */
    private Optional<List<Customer>> findCustomer(Supplier<List<Customer>> dataBase) {
        List<Customer> customers = dataBase.get();
        return Optional.ofNullable(customers);
    }

    class Person {
        Optional<Car> car = empty();

        public Optional<Car> getCar() {
            return car;
        }

        public void setCar(Car car) {
            this.car = Optional.ofNullable(car);
        }
    }

    class Car {
        Optional<Insurance> insurance = empty();

        public Optional<Insurance> getInsurance() {
            return insurance;
        }

        public void setInsurance(Insurance insurance) {
            this.insurance = Optional.ofNullable(insurance);
        }
    }

    class Insurance {
        String getName() {
            return "insurance name";
        }
    }

}
