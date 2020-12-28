
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LetterGradTest {
    private LetterGrade letterGrade;
    @Before
    public void setUp(){
        letterGrade = new LetterGrade();
    }

    @Test
    public void EuivalenceTest(){
        Assert.assertEquals('A',letterGrade.getGrade(95));
        Assert.assertEquals('B',letterGrade.getGrade(85));
        Assert.assertEquals('C',letterGrade.getGrade(75));
        Assert.assertEquals('D',letterGrade.getGrade(65));
        Assert.assertEquals('F',letterGrade.getGrade(30));
        Assert.assertEquals('X',letterGrade.getGrade(Integer.MIN_VALUE));
    }

    @Test
    public void PartitionBoudaryTest(){
        Assert.assertEquals('A',letterGrade.getGrade(100));
        Assert.assertEquals('A',letterGrade.getGrade(90));
        Assert.assertEquals('B',letterGrade.getGrade(89));
        Assert.assertEquals('B',letterGrade.getGrade(80));
        Assert.assertEquals('C',letterGrade.getGrade(79));
        Assert.assertEquals('C',letterGrade.getGrade(70));
        Assert.assertEquals('D',letterGrade.getGrade(69));
        Assert.assertEquals('D',letterGrade.getGrade(60));
        Assert.assertEquals('F',letterGrade.getGrade(59));
        Assert.assertEquals('F',letterGrade.getGrade(0));
        Assert.assertEquals('X',letterGrade.getGrade(Integer.MIN_VALUE));
        Assert.assertEquals('X',letterGrade.getGrade(-Integer.MIN_VALUE));
    }
}
