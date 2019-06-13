package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(1, "User Pierwszy",'M', LocalDate.of(1992, Month.SEPTEMBER, 21), 200));
        theUserList.add(new ForumUser(2, "User Drugi",'F', LocalDate.of(2000, Month.MAY, 30), 100));
        theUserList.add(new ForumUser(3, "User Trzeci",'M', LocalDate.of(1980, Month.DECEMBER, 12), 1));
        theUserList.add(new ForumUser(4, "User Czwarty",'M', LocalDate.of(1914, Month.JULY, 1), 0));
        theUserList.add(new ForumUser(5, "User Piąty",'M', LocalDate.of(2007, Month.FEBRUARY, 1), 120));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theUserList);
    }
}
