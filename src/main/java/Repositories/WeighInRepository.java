package Repositories;

import TheDomain.StudentInfo.WeighIn;

/**
 * Created by Rory on 2017-08-14.
 */
public interface WeighInRepository {
    WeighIn create(WeighIn weighIn);
    WeighIn read(String screenId);
    WeighIn update(WeighIn weighIn);
    void delete(String screenId);

}
