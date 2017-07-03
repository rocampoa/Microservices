package com.bdg.model;

import java.util.List;

/**
 * Created by Rafael on 3/07/2017.
 */
public class Calculation {

  private List<String> input;
  private List<String> output;
  private String function;

  public Calculation(List<String> input, List<String> output, String function) {
    this.input = input;
    this.output = output;
    this.function = function;
  }

  public List<String> getInput() {
    return input;
  }

  public void setInput(List<String> input) {
    this.input = input;
  }

  public List<String> getOutput() {
    return output;
  }

  public void setOutput(List<String> output) {
    this.output = output;
  }

  public String getFunction() {
    return function;
  }

  public void setFunction(String function) {
    this.function = function;
  }
}
