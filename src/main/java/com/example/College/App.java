package com.example.College;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
public class App{
	public static void main(String args[]) {
//public class App {
//
//    @Autowired
//    @Qualifier("student")  // Specify which implementation to inject
//    private Collage clg;
//
//    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//
//        App app = context.getBean(App.class);
//        app.run();
//    }
//
//    public void run() {
//        clg.Clginfo();
//    }
ApplicationContext con= new AnnotationConfigApplicationContext(AppConfig.class);

Staff obj=con.getBean(Staff.class);
obj.Clginfo();
}
}