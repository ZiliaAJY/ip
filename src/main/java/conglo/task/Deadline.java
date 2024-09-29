package conglo.task;

import conglo.command.DateParser;

import java.time.LocalDateTime;

/**
 * Represents a deadline task with a description and a deadline date.
 */
public class Deadline extends Task {

    protected String by;

    public Deadline(String description, String by) {
        super(description);
        this.by = by;
    }

    @Override
    protected String getTaskType() {
        return "D";
    }

    protected String getFormattedDetails() {
        return "by " + by;
    }

    @Override
    public String toFileFormat() {
        return String.format("%s | %s | %s | %s",
                getTaskType(),
                getStatusIcon(),
                getDescription(),
                getFormattedDetails());
    }
}
