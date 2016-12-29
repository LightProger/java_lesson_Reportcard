/**
 * Created by Александр on 28.12.2016.
 */
public class Alternative {// альтернативный расчет оценок в табеле ученика с помощью блока (switch case break)

    public static void main(String[] args) {

        ReportCard rc = new ReportCard();
        char yourGrade = rc.convertGrades(75);
        switch (yourGrade){
            case 'A':
                System.out.println("Превосходная работа!");
                break;
            case 'B':
                System.out.println("Хорошая работа!");
                break;
            case 'C':
                System.out.println("Надо подтянуть знания!");
                break;
            case 'D':
                System.out.println("Будь посерьезнее!");
                break;
        }
    }
}
