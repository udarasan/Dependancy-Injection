package org.example;

public class Boy {
    Agrement agrement=new Girl();
    public void chatWithGirl(){
        agrement.chat();
    }
    public void test(){
        agrement.chat();
    }
    public static void main(String[] args) {
        Boy boy=new Boy();
        boy.chatWithGirl();
        boy.test();
    }
}
