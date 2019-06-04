package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatcounterTestSuite {

    @Test
    public void counterZeroPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            usersList.add("user");
        }
        int posts = 0;
        int comments = 0;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        Statcounter statcounter = new Statcounter();

        //When

        statcounter.calculateAdvStatistics(statisticsMock);

        //Then

        Assert.assertEquals(0.0, statcounter.avUsersPost, 0.0);
        Assert.assertEquals(0.0, statcounter.avPostsComments, 0.0);
        Assert.assertEquals(0.0, statcounter.avUsersComments, 0.0);
    }

    @Test
    public void counterThousandPostsMoreComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            usersList.add("user");
        }
        int posts = 1000;
        int comments = 10000;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        Statcounter statcounter = new Statcounter();

        //When

        statcounter.calculateAdvStatistics(statisticsMock);

        //Then

        Assert.assertEquals(50.0, statcounter.avUsersPost, 0.0);
        Assert.assertEquals(10.0, statcounter.avPostsComments, 0.0);
        Assert.assertEquals(500.0, statcounter.avUsersComments, 0.0);
    }

    @Test
    public void counterZeroComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            usersList.add("user");
        }
        int posts = 100;
        int comments = 0;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        Statcounter statcounter = new Statcounter();

        //When

        statcounter.calculateAdvStatistics(statisticsMock);

        //Then

        Assert.assertEquals(5.0, statcounter.avUsersPost, 0.0);
        Assert.assertEquals(0.0, statcounter.avPostsComments, 0.0);
        Assert.assertEquals(0.0, statcounter.avUsersComments, 0.0);
    }

    @Test
    public void counterThousandPostsLessComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            usersList.add("user");
        }
        int posts = 1000;
        int comments = 500;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        Statcounter statcounter = new Statcounter();

        //When

        statcounter.calculateAdvStatistics(statisticsMock);

        //Then

        Assert.assertEquals(50.0, statcounter.avUsersPost, 0.0);
        Assert.assertEquals(0.5, statcounter.avPostsComments, 0.0);
        Assert.assertEquals(25.0, statcounter.avUsersComments, 0.0);

    }

    @Test
    public void counterZeroUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();

        int posts = 0;
        int comments = 0;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        Statcounter statcounter = new Statcounter();

        //When

        statcounter.calculateAdvStatistics(statisticsMock);

        //Then

        Assert.assertEquals(0.0, statcounter.avUsersPost, 0.0);
        Assert.assertEquals(0.0, statcounter.avPostsComments, 0.0);
        Assert.assertEquals(0.0, statcounter.avUsersComments, 0.0);

    }

    @Test
    public void counterHundredUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersList.add("user");
        }
        int posts = 250;
        int comments = 340;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        Statcounter statcounter = new Statcounter();

        //When

        statcounter.calculateAdvStatistics(statisticsMock);

        //Then

        Assert.assertEquals(2.5, statcounter.avUsersPost, 0.0);
        Assert.assertEquals(1.36, statcounter.avPostsComments, 0.0);
        Assert.assertEquals(3.4, statcounter.avUsersComments, 0.0);

    }


}



