package Repositories.Impl;

import TheDomain.Feedback.Comments;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rory on 2017-08-14.
 */
public class CommentsRepositoryImpl {
    private static CommentsRepositoryImpl repository = null;

    private Map<String,Comments> commentsTable;

    private CommentsRepositoryImpl() {
        commentsTable = new HashMap<String, Comments>();
    }

    public static CommentsRepositoryImpl getInstance(){
        if(repository==null)
            repository = new CommentsRepositoryImpl();
        return repository;
    }

    public Comments create(Comments comments) {
        commentsTable.put(comments.getComment(),comments);
        Comments savedComments = commentsTable.get(comments.getScreenId());
        return savedComments;
    }

    public Comments read(String screenId) {
        Comments comments = commentsTable.get(screenId);
        return comments;
    }

    public Comments update(Comments comments) {
        commentsTable.put(comments.getComment(),comments);
        Comments savedComments= commentsTable.get(comments.getScreenId());
        return savedComments;
    }

    public void delete(String screenId) {
        commentsTable.remove(screenId);

    }
}
