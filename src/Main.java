import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsNumbers = scanner.nextInt();
        scanner.nextLine();
        Student[] students = new Student[studentsNumbers];
        TreeSet<Integer> schoolsNumbers = new TreeSet<>();
        double bestOfMathResult = 0.0;
        double bestOfRussianResult = 0.0;
        double bestOfItResult = 0.0;
        double mathTown = 0;
        double russianTown = 0;
        double itTown = 0;

        for (int i = 0; i < studentsNumbers; i++) {
            String str = scanner.nextLine();
            String[] arr = str.split(" ");
            students[i] = new Student(arr[0] + " " + arr[1], Integer.parseInt(arr[2]),
                    Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), Integer.parseInt(arr[5]));
            schoolsNumbers.add(students[i].getSchoolNumber());
            if (students[i].getMathScore() > bestOfMathResult) bestOfMathResult = students[i].getMathScore();
            if (students[i].getRussianScore() > bestOfRussianResult) bestOfRussianResult = students[i].getRussianScore();
            if (students[i].getItScore() > bestOfItResult) bestOfItResult = students[i].getItScore();
            mathTown += students[i].getMathScore();
            russianTown += students[i].getRussianScore();
            itTown += students[i].getItScore();

        }


        Integer[] schoolsNumbersArray = new Integer[schoolsNumbers.size()];
        schoolsNumbersArray = schoolsNumbers.toArray(schoolsNumbersArray);

        School[] schools = new School[schoolsNumbers.size()];

        for (int i = 0; i < schools.length; i++) {

            double mathAtSchool = 0;
            double russianAtSchool = 0;
            double itAtSchool = 0;
            double count = 0;

            for (int j = 0; j < studentsNumbers; j++) {
                if (students[j].getSchoolNumber() == schoolsNumbersArray[i]) {
                    mathAtSchool += students[j].getMathScore();
                    russianAtSchool += students[j].getRussianScore();
                    itAtSchool += students[j].getItScore();
                    count++;
                }


            }

            double midMath = mathAtSchool / count;
            double midRussian = russianAtSchool / count;
            double midIt = itAtSchool / count;
            double mid = (midMath + midRussian + midIt) / 3.0;
            schools[i] = new School(schoolsNumbersArray[i], (midMath), (midRussian), (midIt), (mid));


        }
        TreeSet<String> bestOfMath = new TreeSet<>();
        TreeSet<String> bestOfRussian = new TreeSet<>();
        TreeSet<String> bestOfIt = new TreeSet<>();

        for (int i = 0; i < studentsNumbers; i++) {

            if (students[i].getMathScore() == bestOfMathResult) bestOfMath.add(students[i].getName() +" - "+  students[i].getMathScore());
            if (students[i].getRussianScore() == bestOfRussianResult) bestOfRussian.add(students[i].getName() +" - "+  students[i].getRussianScore());
            if (students[i].getItScore() == bestOfItResult) bestOfIt.add(students[i].getName() +" - "+  students[i].getItScore());

        }

        System.out.printf("Отчет по городу: математика - %.1f, русский язык - %.1f, инфрматика - %.1f, общий средний балл - %.1f \n"
                ,mathTown / studentsNumbers ,russianTown/studentsNumbers,itTown/studentsNumbers,(mathTown+russianTown+itTown) / (studentsNumbers *3) );
        System.out.println("Отчет по школам:");



        Arrays.sort(schools, School.COMPARE_BY_MIDSCORE);


        for (School s: schools ) {
            System.out.printf("Школа № %d: математика - %.1f, русский язык - %.1f, инфрматика - %.1f, общий средний балл - %.1f \n"
                    ,s.schoolMidNumber,s.MathMidScore,s.russianMidScore,s.itMidScore,s.midScore);
        }

        for (String s:bestOfMath ) {
            System.out.println("Лучший результат по математике - " + s);
        }

        for (String s:bestOfRussian ) {
            System.out.println("Лучший результат по русскому языку - " + s);
        }

        for (String s:bestOfIt ) {
            System.out.println("Лучший результат по информатике - " + s);
        }








    }


}
