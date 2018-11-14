package ir.component.questionnaire.p1;

public class ActionFlow {
    private ActionSource actionSource;
    private Action currentAction;
    private boolean complete;
    //......

    /**
     * Set the source of the actions.
     */
    public void setSource(ActionSource src) {
        actionSource = src;
        if (src != null)
            currentAction = src.getStartingAction();
    }

    public boolean isComplete() {
        return complete;
    }

    public Action getCurrentAction() {
        return currentAction;
    }

    /**
     * Move forward one step in the flow, if possible.
     */
    public void moveForward() {
        //......
        Action next = getNextAction();
        if (next != null) {
            next.setPreviousAction(currentAction);
            currentAction = next; //move forward
        }
        //......
    }

    /**
     * Move backward one step in the flow, if possible.
     * Otherwise, stay at current step.
     */
    public void moveBackward() {
        //......
        Action prev = currentAction.getPreviousAction();
        if (prev != null) {
            currentAction.setPreviousAction(null);
            currentAction = prev; //move backward
            complete = false;
        }
    }

    /**
     * Answer the current question (current step is assumed to
     * be a Question).
     */
    public void perform() {
        currentAction.perform();
        moveForward();
    }

    public Action getNextAction() {
        return null;
    }
}