package springBootLearning.javaTest.run;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;

public record Run(
        Integer id,
        @NotEmpty
        String title,
        LocalDateTime StartedOn,
        LocalDateTime completedOn,
        @Positive
        Integer miles,
        Location location
    ) {

    public Run {
        if(!completedOn.isAfter(StartedOn)) {
            throw new IllegalArgumentException("Completed On must be after Started On");
        };
    }
}
