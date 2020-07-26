package com.company;

public class Score {
    private int math;
    private int phy;

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getPhy() {
        return phy;
    }

    public void setPhy(int phy) {
        this.phy = phy;
    }

    public Score(int math, int phy) {
        this.math = math;
        this.phy = phy;
    }

    @Override
    public String toString() {
        return "Score{" +
                "math=" + math +
                ", phy=" + phy +
                '}';
    }
}
