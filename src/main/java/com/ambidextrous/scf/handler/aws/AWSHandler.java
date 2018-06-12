package com.ambidextrous.scf.handler.aws;

import com.ambidextrous.scf.model.FromModel;
import com.ambidextrous.scf.model.ToModel;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class AWSHandler extends SpringBootRequestHandler<FromModel, ToModel> {
}
