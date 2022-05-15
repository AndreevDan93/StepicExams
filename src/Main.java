import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsNumbers = scanner.nextInt();
        scanner.nextLine();
        Student[] students = new Student[studentsNumbers];
        TreeSet<Integer> schoolsNumbers = new TreeSet<>();
        for (int i = 0; i < studentsNumbers; i++) {
            String str = scanner.nextLine();
            String[] arr = str.split(" ");
            students[i] = new Student(arr[0] + " " + arr[1], Integer.parseInt(arr[2]),
                    Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), Integer.parseInt(arr[5]));
            schoolsNumbers.add(students[i].getSchoolNumber());

        }
        Integer[] schoolsNumbersArray = new Integer[schoolsNumbers.size()];
        schoolsNumbersArray = schoolsNumbers.toArray(schoolsNumbersArray);

        School[] schools = new School[schoolsNumbers.size()];
        for (int i = 0; i < schools.length; i++) {
            DecimalFormat decimalFormat = new DecimalFormat("#.#");
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
            //midMath = Double.parseDouble(decimalFormat.format(midMath));
            double midRussian = russianAtSchool / count;
            //String midRussianS = decimalFormat.format(midRussian);
            //midRussian = Double.parseDouble(midRussianS);
            double midIt = itAtSchool / count;
            //midIt = Double.parseDouble(decimalFormat.format(midIt));
            double mid = (midMath + midRussian + midIt) / 3.0;
            //mid = Double.parseDouble(decimalFormat.format(mid));

            schools[i] = new School(schoolsNumbersArray[i], (midMath), (midRussian), (midIt), (mid));


        }


        for (School s : schools) {
            System.out.println(s);
        }


    }


}
