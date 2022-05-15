class School {
    int schoolMidNumber;
    double MathMidScore;
    double russianMidScore;
    double itMidScore;
    double midScore;

    public int getSchoolMidNumber() {
        return schoolMidNumber;
    }

    public void setSchoolMidNumber(int schoolMidNumber) {
        this.schoolMidNumber = schoolMidNumber;
    }

    public double getMathMidScore() {
        return MathMidScore;
    }

    public void setMathMidScore(double mathMidScore) {
        MathMidScore = mathMidScore;
    }

    public double getRussianMidScore() {
        return russianMidScore;
    }

    public void setRussianMidScore(double russianMidScore) {
        this.russianMidScore = russianMidScore;
    }

    public double getItMidScore() {
        return itMidScore;
    }

    public void setItMidScore(double itMidScore) {
        this.itMidScore = itMidScore;
    }

    public double getMidScore() {
        return midScore;
    }

    public void setMidScore(double midScore) {
        this.midScore = midScore;
    }

    public School(int schoolMidNumber, double mathMidScore, double russianMidScore, double itMidScore, double midScore) {
        this.schoolMidNumber = schoolMidNumber;
        MathMidScore = mathMidScore;
        this.russianMidScore = russianMidScore;
        this.itMidScore = itMidScore;
        this.midScore = midScore;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolMidNumber=" + schoolMidNumber +
                ", MathMidScore=" + MathMidScore +
                ", russianMidScore=" + russianMidScore +
                ", itMidScore=" + itMidScore +
                ", midScore=" + midScore +
                '}';
    }
}
