package ir.component.questionnaire.p1;

// Interface to provide the source of all actions.  The actions
// are already wired together (decision tree).
public interface ActionSource {
    /**
     * Get the starting action.
     */
    public Action getStartingAction();

    /**
     * Get the action given its ID.
     */
    public Action getAction(String id);
}