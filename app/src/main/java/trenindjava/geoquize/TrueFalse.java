package trenindjava.geoquize;

/**
 * Created by Артем on 21.11.2016.
 */

public class TrueFalse extends Object {
    private int mQuestion;
    private boolean mTrueQuestion;

    public TrueFalse (int question, boolean trueQuestion){
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int Question) {
       mQuestion = Question;
    }

    public boolean isTrueQuestion(){
        return  mTrueQuestion;
    }
    public void setTrueQuestion(boolean trueQuestion){
        mTrueQuestion = trueQuestion;
    }

}

