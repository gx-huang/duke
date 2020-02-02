import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Duke extends Application {

    private DukeStorage storage;
    private UserText tasks;
    private DukeParser parser;

    public Duke() {
        String filePath = "data/tasks.txt";
        storage = new DukeStorage(filePath);
        tasks = storage.readText();
        parser = new DukeParser(this.tasks);
    }

    public void run() {
        DukeUI.showWelcomeMessage();
        this.tasks = parser.parseCommand();
        storage.saveTasks(tasks);
    }

    @Override
    public void start(Stage stage) {
        Label helloWorld = new Label("LIBERTY PRIME IS ONLINE"); // Creating a new Label control
        Scene scene = new Scene(helloWorld); // Setting the scene to be our Label

        stage.setScene(scene); // Setting the stage to show our screen
        stage.show(); // Render the stage.
    }
}
