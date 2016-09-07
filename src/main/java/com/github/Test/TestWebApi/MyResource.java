package com.github.Test.TestWebApi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("test");
	EntityManager em = fac.createEntityManager();

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Testtable> getIt() {
    	List<Testtable> customers = em.createQuery("SELECT c FROM Testtable c", Testtable.class).getResultList();
        return customers;
    }
}
