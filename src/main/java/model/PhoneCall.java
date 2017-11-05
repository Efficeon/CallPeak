package model;

public class PhoneCall {
    public long callStart;
    public long callEnd;

    public PhoneCall(long start, long callEnd) {
        this.callStart = start;
        this.callEnd = callEnd;
    }

    public long getCallStart() {
        return callStart;
    }

    public void setCallStart(long callStart) {
        this.callStart = callStart;
    }

    public long getCallEnd() {
        return callEnd;
    }

    public void setCallEnd(long callEnd) {
        this.callEnd = callEnd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhoneCall phoneCall = (PhoneCall) o;

        if (callStart != phoneCall.callStart) return false;
        return callEnd == phoneCall.callEnd;
    }

    @Override
    public int hashCode() {
        int result = (int) (callStart ^ (callStart >>> 32));
        result = 31 * result + (int) (callEnd ^ (callEnd >>> 32));
        return result;
    }
}
