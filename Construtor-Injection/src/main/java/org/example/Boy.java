package org.example;

public class Boy {
    Agrement agrement;
    public Boy(Agrement a){
        this.agrement=a;
    }
    public Boy(){
    }
    public void chatWithGirl(){
        agrement.chat();
    }
    public static void main(String[] args) {
        Boy boy=new Boy(new Girl());
        boy.chatWithGirl();
    }
}
