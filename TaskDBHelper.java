public class TaskDBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "todo.db";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_TASKS = "tasks";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_DESCRIPTION = "description";
    private static final String COLUMN_COMPLETED = "is_completed";

    // Constructor and methods for creating/updating database
}

public class TaskDBHelper extends SQLiteOpenHelper {
    // Previous code...

    public void addTask(Task task) {
        // Insert task into the database
    }

    public List<Task> getTasks() {
        // Retrieve tasks from the database
    }

    public void updateTask(Task task) {
        // Update task in the database
    }

    public void deleteTask(Task task) {
        // Delete task from the database
    }
}
