import staff.management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;
    @Before
    public void before(){
        manager = new Manager("Ahmed",101010,65000,"Clothing");
    }
    @Test
    public void managerHasName(){
        assertEquals("Ahmed",manager.getName());
    }
    @Test
    public void managerChangesName(){
        manager.setName("Mo");
        assertEquals("Mo",manager.getName());
    }
    @Test
    public void managerNameCantBeChangedToNull(){
        manager.setName(null);
        assertEquals("Ahmed",manager.getName());
    }
    @Test
    public void managerHasNINumber(){
        assertEquals(101010,manager.getNInum());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(65000,manager.getSalary());
    }

    @Test
    public void managerHasADepartment(){
        assertEquals("Clothing",manager.getDeptName());
    }

    @Test
    public void managerCanRaiseSalary(){
        manager.raiseSalary(1000);
        assertEquals(66000,manager.getSalary());
    }
    @Test
    public void managerCantHaveNegativeRaise(){
        manager.raiseSalary(-1);
        assertEquals(65000,manager.getSalary());
    }

    @Test
    public void managerCanGetABonus(){
        assertEquals(650, manager.payBonus(),0.0);
    }

}
