package springBootLearning.javaTest.run;

import java.time.LocalDateTime;

public record Run(
        Integer id,
        String title,
        LocalDateTime StartedOn,
        LocalDateTime completedOn,
        Integer miles,
        Location location
    ) {

    public Run {
        if(!completedOn.isAfter(StartedOn)) {
            throw new IllegalArgumentException("Completed On must be after Started On");
        }
    }
}
