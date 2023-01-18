
import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Harold",303030,15000);
    }

    @Test
    public void databaseAdminHasName(){
        assertEquals("Harold", databaseAdmin.getName());
    }

    @Test
    public void databaseAdminHasNINumber(){
        assertEquals(303030, databaseAdmin.getNInum());
    }

    @Test
    public void databaseAdminHasSalary(){
        assertEquals(15000, databaseAdmin.getSalary());
    }

    @Test
    public void databaseAdminCanRaiseSalary(){
        databaseAdmin.raiseSalary(5000);
        assertEquals(20000, databaseAdmin.getSalary());
    }

    @Test
    public void databaseAdminCanGetABonus(){
        assertEquals(150, databaseAdmin.payBonus(),0.0);
    }

}
