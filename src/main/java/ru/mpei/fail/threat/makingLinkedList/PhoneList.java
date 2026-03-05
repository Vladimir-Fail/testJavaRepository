package ru.mpei.fail.threat.makingLinkedList;

import ru.mpei.fail.threat.Phone;

public interface PhoneList {
    int size();
    Phone get(int index);
    boolean removeAt(int index);
    boolean remove(Phone phone);
    boolean add(Phone phone, int index);
    boolean add(Phone phone);
    void clear();
    //Phone removeLast();
    //Phone removeFirst();
}
