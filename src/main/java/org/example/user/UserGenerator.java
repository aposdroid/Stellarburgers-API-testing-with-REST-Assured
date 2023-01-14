package org.example.user;
import com.github.javafaker.Faker;
public class UserGenerator {
    Faker faker = new Faker();
    public User random(){
        return new User(faker.internet().emailAddress(), faker.internet().password(), faker.name().firstName());
    }
    public User userLoginData(){
        return new User("aposdroid@ya.ru", "12341234");
    }
}