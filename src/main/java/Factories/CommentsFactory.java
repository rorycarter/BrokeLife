package Factories;

import TheDomain.Feedback.Comments;

import java.util.Date;
import java.util.Map;

/**
 * Created by Rory on 2017-08-14.
 */
public class CommentsFactory {
    public static Comments getComment(Map<String,String> values,Date date)
    {

        Comments comment=new Comments.Builder()
                .comment(values.get("comment"))
                .date(date)
                .build();
        return comment;

    }

}
