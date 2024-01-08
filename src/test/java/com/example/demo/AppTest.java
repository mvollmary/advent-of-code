package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class AppTest {

  @Test
  void test() throws Exception {
    // given
    App app = new App();
    // when
    String result = app.hello();
    // then
    assertThat(result).isEqualTo("Hello World");
  }

}
