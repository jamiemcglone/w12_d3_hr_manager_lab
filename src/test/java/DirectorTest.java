import staff.management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;
    @Before
    public void before(){
        director = new Director("Keith",404040,100000,"All", 1000000);
    }
    @Test
    public void directorHasName(){
        assertEquals("Keith",director.getName());
    }
    @Test
    public void directorHasNINumber(){
        assertEquals(404040,director.getNInum());
    }

    @Test
    public void directorHasSalary(){
        assertEquals(100000,director.getSalary());
    }

    @Test
    public void directorHasADepartment(){
        assertEquals("All",director.getDeptName());
    }

    @Test
    public void directorCanRaiseSalary(){
        director.raiseSalary(1000);
        assertEquals(101000,director.getSalary());
    }

    @Test
    public void directorCanGetABonus(){
        assertEquals(2000, director.payBonus(),0.0);
    }

}
