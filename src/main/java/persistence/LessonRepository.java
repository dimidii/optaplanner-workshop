package persistence;

import domain.Lesson;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LessonRepository implements PanacheRepository<Lesson> {

}
