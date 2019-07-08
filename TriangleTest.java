
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

public class TriangleTest { 

@Test
public void testTriangle_type() throws Exception {
    Assert.assertEquals("equilateral triangle", new Triangle(3,3,3).triangle_type());
    Assert.assertEquals("isosceles triangle", new Triangle(3,3,4).triangle_type());
    Assert.assertEquals("ordinary triangle", new Triangle(3,4,5).triangle_type());

} 


} 
