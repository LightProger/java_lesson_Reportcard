/**
 * Created by Александр on 29.12.2016.
 */
public class Temperatureconverteralternative {

    public static void main(String[] args) {
        System.out.println("Конвертер температур.");
        Temperatureconverteralternative tca = new Temperatureconverteralternative();
        tca.convertTemp(2850, 'g');

    }

    public void convertTemp (int temperature, char convertTo){

        if(convertTo == 'f'){
          temperature = temperature * 50;
            System.out.println("Ваша температура в Фаренгейтах равна: " + temperature + "F.");
        } else if(convertTo == 'c'){
             temperature = temperature / 50;
            System.out.println("Ваша температура в Цельсиях равна: " + temperature + "С.");
        } else{
            System.out.println("Ошибка! Введите f или с");
        }

       return;
    }

}

