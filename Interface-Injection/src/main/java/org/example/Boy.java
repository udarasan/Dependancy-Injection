package org.example;

public class Boy implements DI {
    Agrement agrement;
    public void chatWithGirl(){
        agrement.chat();
    }
    public static void main(String[] args) {
        Boy boy=new Boy();
        boy.inject(new Girl());
        boy.chatWithGirl();
    }
    @Override
    public void inject(Agrement a) {
        this.agrement=a;
    }
}
