package jpa_test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class MockitoTest {
    @Test
    public void testListMock(){
        List mock = mock(List.class);
        when(mock.size()).thenReturn(5);
        when(mock.get(0)).thenReturn(12);

        Assert.assertEquals(mock.size(), 5);
        Assert.assertEquals(mock.get(0), 12);
        Assert.assertEquals(mock.get(2), null);
        //Assert.assertEquals(mock.get(3), null);
        verify(mock, times(2)).get(anyInt());

    }

    @Test
    public  void  testListSpyMock(){
        ArrayList numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i);
        }
        // Array.asList(new int[] {1,2,3,4,5}
        List spy = spy(numbers);
        when(spy.size()).thenReturn(20);
        when(spy.get(0)).thenReturn(10);
        when(spy.get(1)).thenReturn(20);

        //when(spy.get(10)).thenReturn(60);

        Assert.assertEquals(spy.size(), 20);
        Assert.assertEquals(spy.get(0), 10);

        spy.add(13);
        //Assert.assertEquals(spy.get(10), 60);
    }
}
