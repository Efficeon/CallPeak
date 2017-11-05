package repository;

import model.PhoneCall;

import java.util.List;

public interface CallRepository {
    public List<PhoneCall> listCalls();
}
