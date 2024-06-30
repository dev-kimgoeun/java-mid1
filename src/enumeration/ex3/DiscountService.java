package enumeration.ex3;


import static enumeration.ex3.Grade.*;

public class DiscountService {

    public int discount (Grade classGrade, int price){
        int discountPercent = 0;

        if(classGrade.equals(BASIC)){ //static import 가능
            discountPercent = 10;
        }else if(classGrade.equals(GOLD)){
            discountPercent = 20;
        }else if(classGrade.equals(DIAMOND)){
            discountPercent = 30;
        }else{
            System.out.println("할인 없음");
        }

        return price * discountPercent /100;
    }
}
