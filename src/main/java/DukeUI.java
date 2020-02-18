/**
 * User interface class for DUke
 */
public class DukeUI {

    public DukeUI() {
    }

    public static String showWelcomeMessage () {
        StringBuilder sb = new StringBuilder();
        sb.append("DEMOCRACY IS NON NEGOTIABLE\n");
        sb.append( "HI I'M:\n\n LIBERTY PRIME" );

        return sb.toString();
    }

    public static String showByeMsg() {
        return "DEATH IS A PREFERABLE ALTERNATIVE TO COMMUNISM";
    }

    public static String showLoadingError() {
        return "USERTEXT DATA IS NOT FOUND";
    }

    public static String showDoneMsg() {
        return "TASK COMPLETED";
    }

    public static String showCreationMsg(Task task) {
        return "UNDERSTOOD \n\n        " + task.toString() + "\nADDED";
    }

    public static String showDeleteMsg() {
        return "TASK DELETED";
    }

    public static String showFindMsg() {
        return "TARGET FOUND";
    }

    public static String showCurrentListSize(int size) {
        return "NOW YOU HAVE " + size + " TASKS";
    }

    public static String showArchivedMsg(Task task) {
        return task.toString() + "\n\n        IS NOW ARCHIVED";
    }

}
