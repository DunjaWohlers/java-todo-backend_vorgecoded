package de.neuefische.todo.backend.todo;

public record Todo(
        String id,
        String description,
        TodoStatus status,
        Kategorie kategorie
) {

    Todo(
            String description,
            TodoStatus status,
            Kategorie kategorie
    ) {
        this(null, description, status,kategorie);
    }


    public Todo withId(String id) {
        return new Todo(id, description, status,kategorie);
    }
}
