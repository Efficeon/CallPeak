import service.CallService;
import service.CallServiceImpl;

public class StartApp {
    public static void main(String[] args) {
        CallService callService = new CallServiceImpl();
        callService.outputOfResult(callService.searchMaxPeriods());
    }
}
