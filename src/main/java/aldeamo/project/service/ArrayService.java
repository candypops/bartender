package aldeamo.project.service;

import aldeamo.project.model.Array;
import aldeamo.project.repository.ArrayRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;

@Service
@AllArgsConstructor
public class ArrayService implements IArrayService {

    private ArrayRepository arrayRepository;

    @Override
    public List<Array> getAllArrays() {
        return arrayRepository.findAll();
    }

    @Override
    public Array getArrayById(Long id) {
        return arrayRepository.findById(id).orElse(null);
    }

    @Override
    public List<Integer> serve(int Q, Long id) {
        int[] P = {2, 3, 5, 7, 11, 13, 17};
        String array = getArrayById(id).getInputArray();
        List<Integer> A = Arrays.stream(array.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();
        List<Integer> Ai = new ArrayList<>();


        for (int q = 0; q < Q; q++) {
            List<Integer> B = new ArrayList<>();
            int divisor = P[q];

            List<Integer> divisibles = new ArrayList<>(A.stream().filter(a -> a % divisor == 0).toList());
            List<Integer> noDivisibles = new ArrayList<>(A.stream().filter(a -> a % divisor != 0).toList());

            List<Integer> tempAi =  new ArrayList<>(noDivisibles);
            Collections.reverse(divisibles);
            B.addAll(divisibles);
            A = tempAi;
            result.addAll(B);
            Ai = tempAi;
        }
        result.addAll(Ai);
        return result;
    }

}
