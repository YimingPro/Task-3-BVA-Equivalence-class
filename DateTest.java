
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 


public class DateTest { 

    @Test
    public void testDate()
    {
        Date date = new Date(2019,6,30);
        Assert.assertEquals("30-06-2019", date.toString());
        date.add(1);
        Assert.assertEquals("01-07-2019", date.toString());
        date.add(365);
        Assert.assertEquals("30-06-2020", date.toString());
    }

} 
