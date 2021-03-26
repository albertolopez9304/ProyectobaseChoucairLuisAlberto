package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage{
    public static final Target COURSE_CERTIFICATION = Target.the("courses and certifications to select")
            .located(By.xpath("//div[@id='certificaciones']/div[1]/a/h4/strong"));
    public static final Target SEARCH_COURSE = Target.the("search course")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("click button go")
            .located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("select course")
            .located(By.xpath("//h4[@class='result-title']//a[contains(text(),'ISTQB Agile Tester Extension')]"));
    public static final Target NAME_COURSE = Target.the("extract the name of the course")
            .located(By.xpath("//a[@class='aalink']"));

}
