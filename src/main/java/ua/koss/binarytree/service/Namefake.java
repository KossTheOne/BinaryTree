package ua.koss.binarytree.service;

import retrofit2.Call;
import retrofit2.http.GET;
import ua.koss.binarytree.model.Person;

public interface Namefake {
    @GET("/")
    Call<Person> persons();
}
