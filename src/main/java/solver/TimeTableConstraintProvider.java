package solver;

import domain.Lesson;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;
import org.optaplanner.core.api.score.stream.Constraint;
import org.optaplanner.core.api.score.stream.ConstraintFactory;
import org.optaplanner.core.api.score.stream.ConstraintProvider;

public class TimeTableConstraintProvider implements ConstraintProvider {
    // TODO Implement the TimeTableConstraintProvider class
    /**
     * This class contains all the hard and soft constraints.
     * Task: create 3 hard constraints and 3 soft constraints
     * Hard constraints examples:
     *  1. A room can accommodate at most one lesson at the same time.
     *  2. A teacher can teach at most one lesson at the same time.
     *  3. A student can attend at most one lesson at the same time.
     * Soft constraints examples:
     *  1. A teacher prefers to teach in a single room.
     *  2. A teacher prefers to teach sequential lessons and dislikes gaps between lessons.
     *  3. A student group dislikes sequential lessons on the same subject.
     *
     *  Tip: create multiple methods, for the hard and soft constraints, which will be called inside the 'defineConstraints' method.
     */

    @Override
    public Constraint[] defineConstraints(ConstraintFactory constraintFactory) {
        return new Constraint[] {

        };
    }

    // Example of constraint implementation
    Constraint exampleConflict(ConstraintFactory constraintFactory) {
        return constraintFactory
                .from(Lesson.class)
                .filter((lesson1) -> {
                    // Something
                    return true;
                })
                .penalize("Example", HardSoftScore.ONE_SOFT);
    }
}
