package rest;

import domain.Lesson;
import io.quarkus.hibernate.orm.rest.data.panache.PanacheRepositoryResource;
import io.quarkus.rest.data.panache.ResourceProperties;
import persistence.LessonRepository;

@ResourceProperties(path = "lessons")
public interface LessonResource extends PanacheRepositoryResource<LessonRepository, Lesson, Long> {
}
