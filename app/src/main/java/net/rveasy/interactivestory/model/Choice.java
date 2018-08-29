package net.rveasy.interactivestory.model;

/**
 * Created by Alfred Ekeuwei on 8/27/2018.
 */
public class Choice {
    private int textId;
    private int nextpage;

    public Choice(int textId, int nextpage) {
        this.textId = textId;
        this.nextpage = nextpage;
    }


    public int getTextId() {
        return textId;
    }

    public void setTextId(int textId) {
        this.textId = textId;
    }

    public int getNextpage() {
        return nextpage;
    }

    public void setNextpage(int nextpage) {
        this.nextpage = nextpage;
    }
}

