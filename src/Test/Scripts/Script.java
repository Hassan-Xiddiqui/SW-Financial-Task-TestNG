package Test.Scripts;

import POM.PageObject;
import Test.General.BaseClass;
import org.testng.annotations.Test;

public class Script extends BaseClass {

    @Test(groups = {"E2E"})
    public void testScript(){

//      User Will Sign-in
        PageObject.signIn("standard_user", "secret_sauce");

//      User will filter products with respect to values given
        PageObject.filterProducts("za");

//      User can add product via based on values given in double datatype
        PageObject.addProductcondition(15.99);

//      User will click on cart
        PageObject.clickCart();

//      User can remove product via based on values given in double datatype
        PageObject.removeProductcondition(9.99);

//      User will click on checkout
        PageObject.clickCheckout();

//      User will fill the form based on respective fields
        PageObject.fillForm("Hassan","Siddiqui",75300);

//      User will click on continue button
        PageObject.contButton();

//      User will click on finish button
        PageObject.finishButton();

//      User will logout
        PageObject.logout();

//      User will login again with different user
        PageObject.signIn("problem_user","secret_sauce");

    }

}
