package ir.component.questionnaire.p1;

import java.util.List;

public abstract class Question extends Action {
    private String questionText;
    private String explanation;
    private QuestionInteraction interaction;
    private List<Answer> ansChoices;
    private Answer answer;

    //......

    public Question(String id) {
        super(id);
    }

    // The actual question itself
    public String getText() {
        return questionText;
    }

    // The explanation or instruction text for answering the question
    public String getExplanation() {
        return explanation;
    }

    // Allow multiple choices
    public void addAnswerChoice(Answer ans) {
        ansChoices.add(ans);
    }

    // Set the interaction method to be used
    public void setQuestionInteraction(QuestionInteraction qInt) {
        interaction = qInt;
    }

    /* The question is answered */
    public void setAnswer(int index) {
        Answer ans = (index >= 0 && index < ansChoices.size()) ?
                (Answer) ansChoices.get(index) : null;
        setAnswer(ans);
    }

    public void setAnswer(Answer ans) {
        answer = ans;
        if (answer != null) {
            setDone(true); //Question has been answered
            Action consequence = answer.getConsequenceAction();
            if (consequence != null)
                setNextActionId(consequence.getId());
        } else { // Not answered, or remove previous answer
            setDone(false);
        }
    }

    public void perform() {
        // Don't perform anything if there's no way of getting the answer
        if (interaction == null || isDone())
            return;
        // Use of double dispatch (first dispatch)
        interaction.answer(this);
    }
}