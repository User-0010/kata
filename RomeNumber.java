import java.lang.constant.Constable;

public enum RomeNumber {                               // делаю перечисление

 I(1), II(2), III(3), IV(4),
    V(5), VI(6), VII(7), VIII(8),
    XI(9), X(10);

    private int RomeArab;

    RomeNumber(int RomeArab){
        this.RomeArab = RomeArab;
    }
            public int getromearab(){
            return RomeArab;
            }


}
