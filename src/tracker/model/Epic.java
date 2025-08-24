package tracker.model;

import java.util.ArrayList;
import java.util.List;

public class Epic extends Task{
    private final List<Integer> subtaskIds = new ArrayList<>();

    public Epic(int id, String name, String description) {
        super(id,name, description);
    }

    public List<Integer> getSubtaskIds() {
        return subtaskIds;
    }

    public void addSubtask(int subtaskId) {
        if (subtaskId == this.getId()) {
            throw new IllegalArgumentException("Эпик не может быть подзадачей самого себя.");
        }
        subtaskIds.add(subtaskId);
    }
}
