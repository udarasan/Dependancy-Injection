package org.example;

public class Boy {
    Agrement agrement;
    public void setter(Agrement a){
        this.agrement=a;
    }
    public void chatWithGirl(){
        agrement.chat();
    }
    public static void main(String[] args) {
        Boy boy=new Boy();
        boy.setter(new Girl());
        boy.chatWithGirl();
    }
}
