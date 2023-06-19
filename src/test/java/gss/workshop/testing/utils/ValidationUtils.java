package gss.workshop.testing.utils;

import io.restassured.response.Response;
import org.testng.Assert;

import java.util.Collections;

public class ValidationUtils {

  /**
   * Http status code validation
   *
   * @param res Http response is returned after sending a request to specific service
   * @param expectedStatusCode any http status code that is returned expectation
   */
  public static void validateStatusCode(Response res, int expectedStatusCode) {
    res.then().statusCode(expectedStatusCode);
  }

  /**
   * String value validation for text equal
   *
   * @param expectedStr expected text
   * @param actualStr actual text
   */
  public static void validateStringEqual(Object expectedStr, Object actualStr) {
    Assert.assertEquals(expectedStr, actualStr);
  }

  public static void validateEmpty(Object list) {
    Assert.assertNotEquals(Collections.EMPTY_LIST, list);
  }
}
