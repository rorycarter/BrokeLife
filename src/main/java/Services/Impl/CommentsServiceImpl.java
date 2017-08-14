package Services.Impl;

import Repositories.CommentsRepository;
import Repositories.Impl.CommentsRepositoryImpl;
import Services.CommentsService;
import TheDomain.Feedback.Comments;

/**
 * Created by Rory on 2017-08-14.
 */
public class CommentsServiceImpl implements CommentsService{
    private static CommentsServiceImpl service=null;
    CommentsRepositoryImpl services= CommentsRepositoryImpl.getInstance();


    public static CommentsServiceImpl getInstance()
    {
        if(service==null) {
            service = new CommentsServiceImpl();
        }
            return service;
    }


    public Comments create(Comments Comments)
    {
        return services.create(Comments);
    }

    public Comments read(String comment)
    {

        return services.read(comment);

    }

    public Comments update(Comments Comments)
    {

        return services.update(Comments);

    }
    public void delete(String screenId){
        services.delete(screenId);
    }


}
