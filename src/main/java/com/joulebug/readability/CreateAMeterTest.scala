package com.joulebug.readability
import com.google.gson.Gson

/**
 * Created by shraddharathod on 6/30/15.
 */
/**
 * {
        "account_number": "123456789",
        "utility_company_id": 231,
        "username": "jane_smith",
        "password": "pasword123",
        "data_type": "Gas"
        }
 */
object CreateAMeterTest {
  def CAMTest(): Unit = {

    val gson = new Gson()
    val json = "{\n    \"account_number\": \"123456789\",\n    \"utility_company_id\": 231,\n    \"username\": \"jane_smith\",\n    \"password\": \"pasword123\",\n    \"data_type\": \"Gas\"\n}"
    val parsed = gson.fromJson(json, new CreateAMeter().getClass)

    println("The account number is " + parsed.getAccount_number() + ".")
    println("The utility company ID is " + parsed.getUtility_company() + ".")
    println("The username is " + parsed.getUsername() + ".")
    println("The password is " + parsed.getPassword + ".")
    println("The data type is " + parsed.getData_type + ".")
  }
}