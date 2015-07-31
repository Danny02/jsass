package io.bit3.jsass.function.arguments.converter;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.LinkedList;
import java.util.List;

import io.bit3.jsass.context.Context;
import io.bit3.jsass.function.FunctionArgumentSignature;
import io.bit3.jsass.function.FunctionArgumentSignatureFactory;

public class ContextArgumentConverter implements ArgumentConverter {

  @Override
  public Object convert(
      List<?> remainingArguments, Context context
  ) {
    return context;
  }

  @Override
  public List<FunctionArgumentSignature> argumentSignatures(
      Object object, Method method, Parameter parameter, FunctionArgumentSignatureFactory factory
  ) {
    return new LinkedList<>();
  }
}