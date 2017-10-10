package week8.jany;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class Quiz
{
    public static void main(final String[] args)
    {
        final List<QuizQuestion> questions = new ArrayList<QuizQuestion>();
        QuizQuestion q = new QuizQuestion("Question 1", "1. Which of the following is not a bright colour?\nA. Cyan\nB. Green\nC. Black\nD. Yellow\nAnswer: ");
        q.addAnswer('a', "Incorrect! Cyan is a bright colour, Please Try Again..");
        q.addAnswer('b', "Incorrect! Green is a bright colour, Please Try Again..");
        q.addAnswer('c', "Correct! Black is not a bright colour", true);
        q.addAnswer('d', "Incorrect! Yellow is a bright colour, Please Try Again..");

        questions.add(q);

        q = new QuizQuestion("Question 2", "2. What genre does the singer John Legend sing in?\nA. Pop\nB. R&b\nC. Rap\nD. Rock\nAnswer: ");
        q.addAnswer('a', "Incorrect! John Legend is not a Pop Singer!,\nPlease Try Again..");
        q.addAnswer('b', "Correct! John Legend is a R&B Singer!", true);
        q.addAnswer('c', "Incorrect! John Legend does not Rap!,\nPlease Try Again..");
        q.addAnswer('d', "Incorrect! John Legend is not in the genre of Rock!,\nPlease Try Again..");

        questions.add(q);

        /** Now add the other questions like this */

        // This loop goes until i is the the number of questions, but we will
        // only increment i if the answer is correct.
        for (int i = 0, size = questions.size(); i < size; )
        {
            final QuizQuestion question = questions.get(i);
            final char answer = poseQuestion(question);

            // show the response to their answer they gave
            showResponse(question.getResponse(answer));

            // if the answer was correct, remove it from the list of questions
            if (question.isCorrect(answer))
            {
                ++i;
            }
        }

        /** Now you can do things here when they have answered all the
         * questions correctly.
         */
    }

    private static char poseQuestion(final QuizQuestion question)
    {
        final String ans =
                JOptionPane.showInputDialog(null,
                        question.question,
                        question.title,
                        JOptionPane.INFORMATION_MESSAGE);
        final char answer = ans.charAt(0);

        return answer;
    }

    private static void showResponse(final String response)
    {
        JOptionPane.showMessageDialog(null,
                response,
                "Answer CHECK!",
                JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * This is an object to hold the information related to a quiz question.
     *
     * It's got the title of the question, the question itself and a mapping
     * of answers to responses (where a response is the string the users sees,
     * and whether or not the response is correct)
     *
     */
    private static class QuizQuestion
    {
        private final String title;
        private final String question;

        private final Map<Character, Pair<Boolean, String>> responses;

        public QuizQuestion(final String iTitle, final String iQuestion)
        {
            title = iTitle;
            question = iQuestion;
            responses = new HashMap<Character, Pair<Boolean, String>>();
        }

        public void addAnswer(final char letter, final String response)
        {
            addAnswer(letter, response, false);
        }

        public void addAnswer(final char letter,
                              final String response,
                              final boolean correct)
        {
            responses.put(Character.toLowerCase(letter),
                    new Pair<Boolean, String>(correct, response));
        }

        public String getResponse(final char letter)
        {
            return getPair(letter).b;
        }

        public boolean isCorrect(final char letter)
        {
            return getPair(letter).a;
        }

        private Pair<Boolean, String> getPair(final char letter)
        {
            return responses.get(Character.toLowerCase(letter));
        }

    }

    private static class Pair<A, B>
    {
        private final A a;
        private final B b;

        public Pair(final A iA, final B iB)
        {
            a = iA;
            b = iB;
        }
    }
}