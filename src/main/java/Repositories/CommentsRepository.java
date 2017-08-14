package Repositories;

import TheDomain.Feedback.Comments;

/**
 * Created by Rory on 2017-08-14.
 */
public interface CommentsRepository {
    Comments create(Comments comment);
    Comments read(String screenId);
    Comments update(Comments comment);
    void delete(String screenId);

}
