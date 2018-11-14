package ir.component.questionnaire.p1;

public abstract class Action {
    private final String id;
    private boolean done;
    private String nextActionId;
    private Action prevAction;

    //Constructor is protected - should always have a subclass object
    protected Action(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getNextActionId() {
        return nextActionId;
    }

    public void setNextActionId(String nextActionId) {
        this.nextActionId = nextActionId;
    }

    public Action getPreviousAction() {
        return prevAction;
    }

    public void setPreviousAction(Action prev) {
        prevAction = prev;
    }

    public abstract void perform();
}