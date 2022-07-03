package com.example;

public class App 
{
    public static void main( String[] args )
    {
        /* 
        BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger() , new DataBaseLogger(),new ConsoleLogger()};
        for(BaseLogger logger:loggers){
            logger.log("logged");
        }
        */ 
        CustomerManager customerManager = new CustomerManager(new DataBaseLogger());
        customerManager.add();
    }
}
