package Services;

import TheDomain.StudentInfo.WeighIn;

/**
 * Created by Rory on 2017-08-14.
 */
public interface WeighInService {
    WeighIn create(WeighIn weighIn);
    WeighIn read(String screenId);
    WeighIn update(WeighIn weighIn);
    void delete(String screenId);
}
