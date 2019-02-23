import com.sun.deploy.util.StringUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class StringUtilsTest {

    private StringUtils1 stringUnderTest;
    @Before
    public void setUp() {
        System.out.println("Metoda zostanie wykonana przed kazdym testem");
        stringUnderTest=new StringUtils1();


    }

    @Test
    public void testKod(){
        String kod="41188";
        boolean sprawdz=stringUnderTest.isValidZipCode(kod);
        Assert.assertFalse(sprawdz);
    }

    @Test
    public void sprwdzPlec() throws  Exception{
        String kod="Kazek";
        boolean oczekiwanej=true;
        boolean sprawdz=stringUnderTest.isFemaleName(kod);
        Assert.assertEquals(sprawdz,oczekiwanej);
    }


}
