import java.time.*;



public class App {
    enum Holidays {
        NOTHING(), NEW_YEAR(31,12), MARCH_EIGHTH(8,3), NOVEMBER_NINETEENTH(11,19);
        private int month;
        private int day;
        Holidays(int day, int month){
            this();
            this.day = day;
            this.month=month;
        }
        Holidays(){
         
        }
        public static Holidays getHoliday(){
            Holidays result = NOTHING;
            if(LocalDate.now().getMonth()==Month.MARCH && LocalDate.now().getDayOfMonth()==8){
                result = Holidays.MARCH_EIGHTH;
            }
            if(LocalDate.now().getMonth()==Month.NOVEMBER && LocalDate.now().getDayOfMonth()==19){
                result = Holidays.NOVEMBER_NINETEENTH;
            }
            if(LocalDate.now().getMonth()==Month.DECEMBER && LocalDate.now().getDayOfMonth()==31){
                result = Holidays.NEW_YEAR;
            }
            return result;
        }

    };
    public static void main(String[] args) throws Exception {

       Employee [] employees = {new Employee("Margareth", Customer.Genders.Female),new Employee("Tom",Customer.Genders.Female),
                                            new Employee("Alex",Customer.Genders.Male),new Employee("Tracy",Customer.Genders.Abinary)};

        congratulations(employees,Holidays.getHoliday());
    }

    public static void congratulations(Employee[] employees, Holidays holidays ){
        if(holidays != Holidays.NOTHING){
            for (Employee employee : employees) {
                if(employee.getSex()==Customer.Genders.Female &&holidays==Holidays.MARCH_EIGHTH){
                    System.out.println(String.format("Congrats for %s", Holidays.MARCH_EIGHTH));
                }
                if(employee.getSex()==Customer.Genders.Male &&holidays==Holidays.NOVEMBER_NINETEENTH){
                    System.out.println(String.format("Congrats for al men!!!"));
                }
                if(holidays==Holidays.NEW_YEAR){
                    System.out.println(String.format("Congrats for all !!!"));
                }
            }

        }
        else{
            System.out.println("No holidays :(");
        }

    }
}
