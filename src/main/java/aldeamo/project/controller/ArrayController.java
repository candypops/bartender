package aldeamo.project.controller;

import aldeamo.project.service.IArrayService;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
@Validated
@AllArgsConstructor
public class ArrayController {


    private IArrayService arrayService;

    @GetMapping("/run")
    public List<Integer> run(@Min(value = 1) @Max(value = 5) Long id, @Positive int q){
        return arrayService.serve(q, id);

    }


}
