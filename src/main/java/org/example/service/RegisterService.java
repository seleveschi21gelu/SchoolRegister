package org.example.service;

import org.example.entity.Professor;
import org.example.entity.Register;
import org.example.entity.Student;
import org.example.exception.RegisterException;
import org.example.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RegisterService {

    @Autowired
    private RegisterRepository registerRepository;

    public List<Register> getAllRegisters() {
        return registerRepository.findAll();
    }

    public Register addRegisters(Register register) {
        return registerRepository.save(register);
    }

    public Register getRegistersById(int id) {
        return registerRepository.findById(id).orElseThrow(() -> new RegisterException(id));
    }

    public Register updateRegisterById(Register register) {
        return registerRepository.save(register);
    }

    public String deleteRegisterById(Integer id) {
        registerRepository.deleteById(id);
        return id + " was deleted";
    }

//    static Set<Register> registerSet = new TreeSet<>();
//    static {
//        registerSet.add(new Register(new Professor().getId(),new Student()).getId());
//    }
}
