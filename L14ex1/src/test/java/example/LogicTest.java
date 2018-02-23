package example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {

    @Test
    void customMath()  {
        final Logic logic = new Logic ();
        assertEquals( 3, logic.customMath(1, 2));
        assertEquals( 1, logic.customMath(2, 1));
        assertThrows(IllegalArgumentException.class, new Executable() {
            public void execute() throws Throwable {

                    logic.customMath(2,2 );

            }
        });
    }

    @Test
    void kill(){
        final Logic l1 = new Logic();
        assertThrows(NullPointerException.class, new Executable() {
            public void execute() throws Throwable {
                l1.kill("", 3);

            }
        });

        assertEquals("Order test with 2 victims was successfully executed by [Misha]",
                l1.kill("test", 2, "Misha"));
    }

    @Test
   void multiply(){
       final Logic logic = new Logic ();
       assertThrows(UnsupportedOperationException.class, new Executable() {
           public void execute() throws Throwable {

               logic.multiply(0, 1);

           }
       });
       assertEquals( 9, logic.multiply(3, 3));

       assertEquals( 18, logic.multiply(3,3,1,1,1));
   }

}