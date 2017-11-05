package repository;

import model.PhoneCall;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

public class CallRepositoryImplTest {

    @Mock
    CallRepository repository = new CallRepositoryImpl();

    @Test
    public void listCallsTest() throws Exception {
        List<PhoneCall> phoneCallsTest = new ArrayList<PhoneCall>();
        phoneCallsTest.add(new PhoneCall(1385718405,1385718491));
        phoneCallsTest.add(new PhoneCall(1385718407,1385718409));
        phoneCallsTest.add(new PhoneCall(1385718408,1385718452));
        phoneCallsTest.add(new PhoneCall(1385718408,1385718464));
        phoneCallsTest.add(new PhoneCall(1385718413,1385718452));
        phoneCallsTest.add(new PhoneCall(1385718412,1385718456));
        phoneCallsTest.add(new PhoneCall(1385718444,1385718445));
        phoneCallsTest.add(new PhoneCall(1385718480,1385718490));
        phoneCallsTest.add(new PhoneCall(1385718478,1385718480));
        phoneCallsTest.add(new PhoneCall(1385718455,1385718466));

        List<PhoneCall> phoneCalls = repository.listCalls();

        Assert.assertTrue(phoneCalls.equals(phoneCallsTest));
    }
}