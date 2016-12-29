/**
 * Created by Александр on 28.12.2016.
 */
public class ReportCard { // расчет оценок в табеле ученика

    public static char convertGrades(int testResult) {

        char grade;
        if (testResult >= 90) {
            grade = 'A';
        } else if (testResult >= 80 && testResult < 90){// если testResult больше или равен 80 и меньше 90
            grade = 'B';
        } else if (testResult >= 70 && testResult < 80){
            grade = 'C';
        } else {
            grade = 'D';
        }
        return grade;
    }

     public static void main(String[] args) {

        ReportCard rc = new ReportCard(); // создание объекта ReportCard
        char yourGrade = rc.convertGrades(95);
        /*
          Присваивание переменной yourGrade, результата вычислений метода convertGrades
          */
        System.out.println("Ваша первая оценка равна: " + yourGrade);

        yourGrade = rc.convertGrades(60);
        /*
          Присваивание переменной yourGrade, результата вычислений метода convertGrades
          */
        System.out.println("Ваша вторая оценка равна: " + yourGrade);

    }
}
