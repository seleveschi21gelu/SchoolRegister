package org.example.controller;

import org.example.entity.Register;
import org.example.repository.RegisterRepository;
import org.example.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/register")
public class RegisterRestController {

    @Autowired
    private RegisterService registerService;

    @GetMapping
    private List<Register> getAllRegisters() {
        return registerService.getAllRegisters();
    }

    @PostMapping
    private Register addRegisters(@RequestBody Register register) {
        return registerService.addRegisters(register);
    }

    @GetMapping("/{id}")
    private Register getRegisterById(@PathVariable int id) {
        return registerService.getRegistersById(id);
    }

    @PatchMapping("/{id}")
    private Register updateRegisterUsingPatchMapping(@PathVariable int id, @RequestBody Register register) {
        register.setId(id);
        return registerService.updateRegisterById(register);
    }

    @PutMapping("/{id}")
    private Register updateRegisterUsingPutMapping(@PathVariable int id, @RequestBody Register register) {
        register.setId(id);
        return registerService.updateRegisterById(register);
    }

    @DeleteMapping("/{id}")
    private String deleteRegisterById(@PathVariable int id) {
        registerService.deleteRegisterById(id);

        return "removed with success";
    }


}
