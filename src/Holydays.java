import java.util.*;

public class Holydays {
    public String[] holidays = {"01/01/2023","21/02/2023","17/04/2023","01/05/2023","08/06/2023","07/09/2023","12/10/2023","02/11/2023","15/11/2023","25/12/2023"};
    public String[] holidaysName = {"Confraternização mundial","Carnaval","Páscoa","Tiradentes","Dia do trabalho","Corpus Christi","Independência do Brasil","Nossa Senhora Aparecida","Finados","Proclamação da República","Natal"};

    void getAllHolidaysDate(){
        System.out.println(Arrays.toString(holidays));
    }

    void getAllHolidaysName(){
        System.out.println(Arrays.toString(holidaysName));
    }

    void getHolidayByDate(String s){
        for(int i = 0; i < holidays.length; i ++){
            if(s.equals(holidays[i])){
                System.out.println(s + " é a data do seguinte feriado: " + holidaysName[i]);
                break;
            }
            if(i == holidays.length - 1){
                System.out.println("Esse feriado não existe!");
            }
        }
    }
    
}
