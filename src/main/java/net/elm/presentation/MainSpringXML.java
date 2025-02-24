package net.elm.presentation;
import net.elm.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringXML {
    public static void main(String[] a){
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        IMetier imetier = (IMetier) context.getBean("metier");
        System.out.println(imetier.calcule());
    }
}
