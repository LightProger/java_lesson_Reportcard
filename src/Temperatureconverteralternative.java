/**
 * Created by Александр on 29.12.2016.
 */
public class Temperatureconverteralternative {

    public static void main(String[] args) {
        System.out.println("Конвертер температур.");
        Temperatureconverteralternative tca = new Temperatureconverteralternative();
        tca.convertTemp(36.6, 'c');

    }

    public void convertTemp (double temperature, char convertTo){

        if(convertTo == 'f'){
          temperature = temperature * 1.8 +32;
            System.out.println("Ваша температура в Фаренгейтах равна: " + temperature + "F.");
        } else if(convertTo == 'c'){
             temperature = (temperature - 32) * 5 / 9;
            System.out.println("Ваша температура в Цельсиях равна: " + temperature + "С.");
        } else{
            System.out.println("Ошибка! Введите f или с");
        }

       return;
    }

}

