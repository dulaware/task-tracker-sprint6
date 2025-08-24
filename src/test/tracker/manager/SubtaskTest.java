package test.tracker.manager;

import org.junit.jupiter.api.Test;
import tracker.model.Subtask;

import static org.junit.jupiter.api.Assertions.*;

public class SubtaskTest {

    @Test
    void shouldReturnEpicId_WhenSubtaskCreated() {
        Subtask subtask = new Subtask(2, "Subtask1", "Small task", 1);

        assertEquals(1, subtask.getEpicId(), "Subtask должен ссылаться на Epic с id=1");
    }

    @Test
    void shouldThrowException_WhenEpicIdEqualsSubtaskId() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Subtask(1, "Subtask1", "Invalid", 1));

        assertEquals("Подзадача не может быть своим же эпиком.", exception.getMessage());
    }

}