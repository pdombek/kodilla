package com.kodilla.testing.forum.statistics;

public class Statcounter {

    int usersNumber;
    int postsNumber;
    int commentsNumber;
    double avUsersPost;
    double avUsersComments;
    double avPostsComments;

    public void calculateAdvStatistics(Statistics statistics){

        usersNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();

        if(usersNumber == 0){
            avUsersPost = 0;
            avUsersComments = 0;
        } else {
            avUsersPost = (double)postsNumber/(double)usersNumber;
            avUsersComments = (double)commentsNumber/(double)usersNumber;
        }

        if(postsNumber == 0) {
            avPostsComments = 0;
        } else {
            avPostsComments = (double)commentsNumber/(double)postsNumber;
        }

    }

}
