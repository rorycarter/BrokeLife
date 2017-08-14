package Repositories.Impl;

import Repositories.WeighInRepository;
import TheDomain.StudentInfo.WeighIn;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rory on 2017-08-14.
 */
public class WeighInRepositoryImpl implements WeighInRepository{
    private static WeighInRepositoryImpl repository = null;

    private Map<String,WeighIn> weighInTable;

    private WeighInRepositoryImpl() {
        weighInTable = new HashMap<String, WeighIn>();
    }

    public static WeighInRepositoryImpl getInstance(){
        if(repository==null)
            repository = new WeighInRepositoryImpl();
        return repository;
    }

    public WeighIn create(WeighIn weighIn) {
        weighInTable.put(weighIn.getScreenId(),weighIn);
        WeighIn savedWeighIn = weighInTable.get(weighIn.getWeightNow());
        return savedWeighIn;
    }

    public WeighIn read(String screenId) {
        WeighIn weighIn = weighInTable.get(screenId);
        return weighIn;
    }

    public WeighIn update(WeighIn weighIn) {
        weighInTable.put(weighIn.getScreenId(),weighIn);
        WeighIn savedWeighIn= weighInTable.get(weighIn.getWeightNow());
        return savedWeighIn;
    }

    public void delete(String screenId) {
        weighInTable.remove(screenId);


    }
}
