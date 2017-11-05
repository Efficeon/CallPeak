package service;

import model.PhoneCall;
import org.junit.Test;
import org.mockito.Mockito;
import repository.CallRepository;
import repository.CallRepositoryImpl;

import static org.junit.Assert.*;

public class CallServiceImplTest extends Mockito{

    @Test
    public void searchMaxPeriods() throws Exception {

        CallRepositoryImpl callRepository = mock(CallRepositoryImpl.class);
        //cmock(CallRepositoryImpl.class).listCalls().FILE)
    }

    @Test
    public void outputOfResult() throws Exception {
    }

}