class Student {
    private String name;
    private int schoolNumber;
    private int MathScore;
    private int russianScore;
    private int itScore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public int getMathScore() {
        return MathScore;
    }

    public void setMathScore(int mathScore) {
        MathScore = mathScore;
    }

    public int getRussianScore() {
        return russianScore;
    }

    public void setRussianScore(int russianScore) {
        this.russianScore = russianScore;
    }

    public int getItScore() {
        return itScore;
    }

    public void setItScore(int itScore) {
        this.itScore = itScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", schoolNumber=" + schoolNumber +
                ", MathScore=" + MathScore +
                ", russianScore=" + russianScore +
                ", itScore=" + itScore +
                '}';
    }

    public Student(String name, int schoolNumber, int mathScore, int russianScore, int itScore) {
        this.name = name;
        this.schoolNumber = schoolNumber;
        MathScore = mathScore;
        this.russianScore = russianScore;
        this.itScore = itScore;
    }
}