package ir.component.questionnaire.p1;

// Implement this interface to display question and accept answer
public interface QuestionInteraction {
    // Use of double dispatch when the implementation of this interface
    // sets the answer (second dispatch)
    public void answer(Question q);
}