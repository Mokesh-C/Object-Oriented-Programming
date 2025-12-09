package Interfaces;

public interface BaseInfo {
    void showBasicDetails();
}

interface DetailedInfo extends BaseInfo { // interface extending another interface
    void showDetailedInfo();
}
