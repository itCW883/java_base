package recursion;

public class RecrusionRabit {
    public static int TuZ(int month){
        int Rabbit=0;
        if(month==2||month==1){
            return 1;
        }
        else {
            Rabbit=TuZ(month-1)+TuZ(month-2);
            return Rabbit;
        }

    }
}
