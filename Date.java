public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void add()
    {
        day++;
        if(day>31){
            month++;
            day = 1;
        }
        else if(month==4||month==6||month==9||month==11){
            if(day>30){
                month++;
                day = 1;
            }
        }else if(month==2){
            if((year%4==0&&year%100!=0)||year%400==0){
                if(day>29){
                    month++;
                    day = 1;
                }
            }else{
                if(day>28){
                    month++;
                    day = 1;
                }
            }
        }
        if(month>12){
            month = 1;
            year++;
        }

    }

    public void add(int days)
    {
        for(int i=0; i<days; i++){
            add();
        }
    }

    @Override
    public String toString() {
        return String.format("%02d-%02d-%d", day, month, year);
    }

    public void print()
    {
        System.out.println(this);
    }
}
