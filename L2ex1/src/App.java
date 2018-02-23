public class App {
    private long second_ms = 1000;
    private long minute_ms = second_ms * 60;
    private long hour_ms = minute_ms * 60;
    private long day_ms = hour_ms * 24;
    private long year_ms = day_ms * 365;

    public static void main(String[] args) {

        App theApp = new App();
        theApp.task1(100000000);
        theApp.task1(200000000);

        theApp.task2(1005315611000L);

    }

    private void task1(long milicesconds) {
        long hour = milicesconds % this.day_ms / this.hour_ms;
        long minute = milicesconds % this.hour_ms / this.minute_ms;
        long second = milicesconds % this.minute_ms / this.second_ms;

        System.out.println(hour + ":" + minute + ":" + second);
    }
    /*
        Миллисекунды отображают время, прошедшее с 01/01/1970 00:00:00.
        Дописать вывод таким образом, чтобы миллисекунды прибавляли время к этой дате.
        Так, для числа 1005315611000 вывод должен быть 11/09/2001 17:20:11.
        Не использовать класс Date.
    */
    public void task3 (long miliseconds){

    }

    public void task2(long milicesconds) {

        long years =  milicesconds / this.year_ms;
        long days = milicesconds % this.year_ms / day_ms;

        years = years + 1970;

        // отнимаем кол-во високосных дней из days
        for(int i = 1970; i <= years; i = i + 1) {
            if (i % 4 == 0) {
                days = days - 1;
            }
        }

        // вычислить месяц и день
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month = 0;

        for(int i = 0; i < 12; i = i + 1) {
            if (days > months[i]){
                days = days - months[i];
            } else {
                month = i;
            }
        }

        // прибавляем один день относительно 01/01/1970
        days = days + 1;

        long hour = milicesconds % day_ms / this.hour_ms;
        long minute = milicesconds % this.hour_ms / this.minute_ms;
        long second = milicesconds % this.minute_ms / this.second_ms;

        System.out.println(month + days +years + hour + minute + second);
    }
}