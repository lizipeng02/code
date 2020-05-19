package singlon.factory;

public class Factory {

    interface Sender{
        void send();
    }
    public static class SmsSender implements Factory.Sender{

        @Override
        public void send() {
            System.out.println("this is sms sender");
        }
    }

    public static class MailSender implements Factory.Sender{

        @Override
        public void send() {
            System.out.println("this is mail sender");
        }
    }
/*
* 普通工厂模式
* 根据参数来具体实例化子类
* */
    public class SendFactoryNomal{

        public Sender produce(String type){

            if(type.equals("sms")) return new SmsSender();

            if(type.equals("mail")) return new MailSender();

            return null;
        }


    }
    /*
    * 方法工厂模式
    * 根据方法来具体实例化子类
    *
    * */
    public class SendFactoryMethod{

        public Sender produceSms(){
            return new SmsSender();
        }

        public Sender produceMail(){
            return new MailSender();
        }

    }
    /*
     * 静态工厂模式
     * 不用实例化工厂类
     * 根据方法来具体实例化子类
     *
     * */
    public static class SendFactoryStaticMethod{

        public static Sender produceSms(){
            return new SmsSender();
        }

        public static Sender produceMail(){
            return new MailSender();
        }

    }
/*
* 抽象工厂模式
* 再抽象一层
* 根据具体实例化的工厂
* 易于拓展
* */
    public interface provider{
        Sender produce();
    }

    public class SendSmsFactory implements provider{
        @Override
        public Sender produce() {
            return new SmsSender();
        }
    }

    public class SendMailFactory implements provider{

        @Override
        public Sender produce() {
            return new MailSender();
        }
    }


}
