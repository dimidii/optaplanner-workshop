package persistence;

import domain.Room;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RoomRepository implements PanacheRepository<Room> {
}
