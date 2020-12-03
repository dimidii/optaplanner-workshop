package persistence;

import domain.Timeslot;

import javax.enterprise.context.ApplicationScoped;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class TimeslotRepository implements PanacheRepository<Timeslot> {

}
