package aldeamo.project.controller;

import aldeamo.project.service.IArrayService;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Validated
@AllArgsConstructor
public class ArrayController {

    private IArrayService arrayService;

    @GetMapping("/serve")
    public List<Integer> run(@Min(value = 1) @Max(value = 5) Long id, @Min(value = 1) @Max(value = 7) int iterations){
        return arrayService.serve(iterations, id);

    }


}
