package aldeamo.project.service;

import aldeamo.project.model.Array;

import java.util.List;

public interface IArrayService {

    List<Array> getAllArrays();

    Array getArrayById(Long id);
    List<Integer> serve(int Q, Long id);


}
