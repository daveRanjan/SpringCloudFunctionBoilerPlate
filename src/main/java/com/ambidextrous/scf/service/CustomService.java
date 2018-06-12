package com.ambidextrous.scf.service;

import com.ambidextrous.scf.model.FromModel;
import com.ambidextrous.scf.model.ToModel;
import org.springframework.stereotype.Service;

@Service
public class CustomService {

    public ToModel convert(final FromModel input) {
        ToModel toModel = new ToModel();
        toModel.setData(input.getValue().toLowerCase());
        return toModel;
    }
}
