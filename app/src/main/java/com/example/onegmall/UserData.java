package com.example.onegmall;

public class UserData {
 String Donut_Cafe;
 String LifeAfter;
 String Currency;

 public UserData(){

 }

 public String getCurrency(){
     return Currency;
 }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public String getDonut_Cafe() {
        return Donut_Cafe;
    }

    public void setDonut_Cafe(String donut_Cafe) {
        Donut_Cafe = donut_Cafe;
    }

    public String getLifeAfter() {
        return LifeAfter;
    }

    public void setLifeAfter(String lifeAfter) {
        LifeAfter = lifeAfter;
    }
}
