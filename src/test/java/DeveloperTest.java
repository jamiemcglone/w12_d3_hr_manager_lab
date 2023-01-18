
import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Betty",202020,80000);
    }

    @Test
    public void developerHasName(){
        assertEquals("Betty", developer.getName());
    }

    @Test
    public void developerHasNINumber(){
        assertEquals(202020, developer.getNInum());
    }

    @Test
    public void developerHasSalary(){
        assertEquals(80000, developer.getSalary());
    }

    @Test
    public void developerCanRaiseSalary(){
        developer.raiseSalary(5000);
        assertEquals(85000, developer.getSalary());
    }

    @Test
    public void developerCanGetABonus(){
        assertEquals(800, developer.payBonus(),0.0);
    }

}
