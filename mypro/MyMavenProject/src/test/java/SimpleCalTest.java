import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalTest {
@Test
    void oneplusoneequaltwo(){
    SimpleCal simpleCal = new SimpleCal();
    assertEquals(2,simpleCal.add(1,1));
}

}