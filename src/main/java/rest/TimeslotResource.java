package rest;

import domain.Timeslot;
import io.quarkus.hibernate.orm.rest.data.panache.PanacheRepositoryResource;
import io.quarkus.rest.data.panache.ResourceProperties;
import persistence.TimeslotRepository;

@ResourceProperties(path = "timeslots")
public interface TimeslotResource  extends PanacheRepositoryResource<TimeslotRepository, Timeslot, Long> {
}
