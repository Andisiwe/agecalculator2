package za.ac.cput.agecalculator2.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.agecalculator2.Impl.MultipleImpl;
import za.ac.cput.agecalculator2.Impl.PersonDetailsImpl;
import za.ac.cput.agecalculator2.PersonDetails;

/**
 * Created by student on 2015/02/20.
 */
@Configuration
public class AppConfig {
    @Bean(name = "age")
    public PersonDetails getPersonDetails() { return new PersonDetailsImpl();}

    @Bean(name = "ageCalc")
    public PersonDetails pDetails() {return new MultipleImpl();}
}
