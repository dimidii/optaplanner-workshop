package rest;

import domain.Room;
import io.quarkus.hibernate.orm.rest.data.panache.PanacheRepositoryResource;
import persistence.RoomRepository;
import io.quarkus.rest.data.panache.ResourceProperties;

@ResourceProperties(path = "rooms")
public interface RoomResource extends PanacheRepositoryResource<RoomRepository, Room, Long> {

}