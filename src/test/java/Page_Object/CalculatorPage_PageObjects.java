package Page_Object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Class.Base_Class;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CalculatorPage_PageObjects extends Base_Class {

	AndroidDriver<MobileElement> ldriver;

	public CalculatorPage_PageObjects(AndroidDriver<MobileElement> rdriver) {
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);
	}

	// WebElement For Zero Button
	@FindBy(id = "com.oneplus.calculator:id/digit_0")
	WebElement Zero;

	// WebElement For One Button
	@FindBy(id = "com.oneplus.calculator:id/digit_1")
	WebElement One;

	// WebElement For Two Button
	@FindBy(id = "com.oneplus.calculator:id/digit_2")
	WebElement Two;

	// WebElement For Three Button
	@FindBy(id = "com.oneplus.calculator:id/digit_3")
	WebElement Three;

	// WebElement For Four Button
	@FindBy(id = "com.oneplus.calculator:id/digit_4")
	WebElement Four;

	// WebElement For Five Button
	@FindBy(id = "com.oneplus.calculator:id/digit_5")
	WebElement Five;

	// WebElement For Six Button
	@FindBy(id = "com.oneplus.calculator:id/digit_6")
	WebElement Six;

	// WebElement For Seven Button
	@FindBy(id = "com.oneplus.calculator:id/digit_7")
	WebElement Seven;

	// WebElement For Eight Button
	@FindBy(id = "com.oneplus.calculator:id/digit_8")
	WebElement Eight;

	// WebElement For Nine Button
	@FindBy(id = "com.oneplus.calculator:id/digit_9")
	WebElement Nine;

	// WebElement For ADD Button
	@FindBy(id = "com.oneplus.calculator:id/op_add")
	WebElement ADD;

	// WebElement For SUB Button
	@FindBy(id = "com.oneplus.calculator:id/op_sub")
	WebElement SUB;

	// WebElement For MULTIPLY Button
	@FindBy(id = "com.oneplus.calculator:id/op_mul")
	WebElement MULTIPLY;

	// WebElement For DIVDE Button
	@FindBy(id = "com.oneplus.calculator:id/op_div")
	WebElement DIVIDE;

	// WebElement For PERCENT Button
	@FindBy(id = "com.oneplus.calculator:id/op_pct")
	WebElement PERCENT;

	// WebElement For DELETE Button
	@FindBy(id = "com.oneplus.calculator:id/del")
	WebElement DELETE;

	// WebElement For CLEAR Button
	@FindBy(id = "com.oneplus.calculator:id/clr")
	WebElement CLEAR;

	// WebElement For POINT Button
	@FindBy(id = "com.oneplus.calculator:id/dec_point")
	WebElement POINT;

	// WebElement For SCIENTIFICBTN Button
	@FindBy(id = "com.oneplus.calculator:id/ibToogleScientific")
	WebElement SCIENTIFICBTN;

	// WebElement For history_btn Button
	@FindBy(id = "com.oneplus.calculator:id/imgdragviewnew")
	WebElement history_btn;

	// WebElement For EQUAL Button
	@FindBy(id = "com.oneplus.calculator:id/eq")
	WebElement EQUAL;

	// WebElement For Formula Field
	@FindBy(id = "com.oneplus.calculator:id/formula")
	WebElement formula_Field;

	// WebElement For Result Field
	@FindBy(id = "com.oneplus.calculator:id/result")
	WebElement Result;

	// -----------------------Scientific Calculator
	// Keys---------------------------------------------------

	// WebElement For COS Button
	@FindBy(id = "com.oneplus.calculator:id/fun_cos")
	WebElement COS;

	// WebElement For LOG Button
	@FindBy(id = "com.oneplus.calculator:id/fun_log")
	WebElement LOG;

	// WebElement For Left Parenthesis Button
	@FindBy(id = "com.oneplus.calculator:id/lparen")
	WebElement leftParenthesis;

	// WebElement For Right Parenthesis Button
	@FindBy(id = "com.oneplus.calculator:id/rparen")
	WebElement rightParenthesis;

	// WebElement For Degree Button
	@FindBy(id = "com.oneplus.calculator:id/toggle_mode_deg")
	WebElement switchtoDegree;

	// WebElement For SIN Button
	@FindBy(id = "com.oneplus.calculator:id/fun_sin")
	WebElement SIN;

	// WebElement For TAN Button
	@FindBy(id = "com.oneplus.calculator:id/fun_tan")
	WebElement TAN;

	// WebElement For Square Root Button
	@FindBy(id = "com.oneplus.calculator:id/op_sqrt")
	WebElement squareRoot;

	// WebElement For ln Button
	@FindBy(id = "com.oneplus.calculator:id/fun_ln")
	WebElement ln;

	// WebElement For Inverse Button
	@FindBy(id = "com.oneplus.calculator:id/toggle_inv")
	WebElement inverse;

	// WebElement For Pi Button
	@FindBy(id = "com.oneplus.calculator:id/const_pi")
	WebElement pi;

	// WebElement For Exponential Button
	@FindBy(id = "com.oneplus.calculator:id/const_e")
	WebElement exponential;

	// WebElement For Factorial Button
	@FindBy(id = "com.oneplus.calculator:id/op_fact")
	WebElement factorial;

	// WebElement For Power Button
	@FindBy(id = "com.oneplus.calculator:id/op_pow")
	WebElement power;

	// Method to Click on Zero Button
	public void clickon_Zero() {
		Zero.click();
	}

	// Method to Click on One Button
	public void clickon_One() {
		One.click();
	}

	// Method to Click on Two Button
	public void clickon_Two() {
		Two.click();
	}

	// Method to Click on Three Button
	public void clickon_Three() {
		Three.click();
	}

	// Method to Click on Four Button
	public void clickon_Four() {
		Four.click();
	}

	// Method to Click on Five Button
	public void clickon_Five() {
		Five.click();
	}

	// Method to Click on Six Button
	public void clickon_Six() {
		Six.click();
	}

	// Method to Click on Seven Button
	public void clickon_Seven() {
		Seven.click();
	}

	// Method to Click on Eight Button
	public void clickon_Eight() {
		Eight.click();
	}

	// Method to Click on Nine Button
	public void clickon_Nine() {
		Nine.click();
	}

	// Method for Click on ADD Button
	public void clickon_Add_Btn() {
		ADD.click();
	}

	// Method to Click on SUB Button
	public void clickon_Sub_Btn() {
		SUB.click();
	}

	// Method to Click on MULTIPLY Button
	public void clickon_Multiply_Btn() {
		MULTIPLY.click();
	}

	// Method to Click on DIVIDE Button
	public void clickon_Divide_Btn() {
		DIVIDE.click();
	}

	// Method to Click on DELETE Button
	public void clickon_Delete_Btn() {
		DELETE.click();
	}

	// Method for Click on CLEAR Button
	public void clickon_Clear_Btn() {
		CLEAR.click();
	}

	// Method for Click on POINT Button
	public void clickon_Point_Btn() {
		POINT.click();
	}

	// Method to Click on SCIENTIFIC TOGGOLE BTN Button
	public void clickon_Scientific_Toggole_Btn() {
		SCIENTIFICBTN.click();
	}

	// Method to Click on HISTORY Button
	public void clickon_History_Menu() {
		history_btn.click();
	}

	// Method to Click on EQUAL Button
	public void clickon_Equal() {
		EQUAL.click();
	}

	// Method to get text from Result field
	public String getText_Formula_Field() {
		return formula_Field.getText();
	}

	// Method to get text from Result field
	public String getText_Result_Field() {
		return Result.getText();
	}

	// -------------------------------Method for Scientific
	// calculator--------------------------------------------------------------

	// Method to click on COS Button
	public void clickon_Cos() {
		COS.click();
	}

	// Method to click on LOG Button
	public void clickon_Log() {
		LOG.click();
	}

	// Method to click on Left Parenthesis Button
	public void clickon_leftParenthesis() {
		leftParenthesis.click();
	}

	// Method to click on Right Parenthesis Button
	public void clickon_rightParenthesis() {
		rightParenthesis.click();
	}

	// Method to click on Degree Button
	public void clickon_Degree() {
		switchtoDegree.click();
	}

	// Method to click on Sin Button
	public void clickon_Sin() {
		SIN.click();
	}

	// Method to click on Tan Button
	public void clickon_Tan() {
		TAN.click();
	}

	// Method to click on Square Root Button
	public void clickon_SquareRoot() {
		squareRoot.click();
	}

	// Method to click on ln Button
	public void clickon_ln() {
		ln.click();
	}

	// Method to click on inverse Button
	public void clickon_Inverse() {
		inverse.click();
	}

	// Method to click on pi Button
	public void clickon_Pi() {
		pi.click();
	}

	// Method to click on exponential Button
	public void clickon_Exponential() {
		exponential.click();
	}

	// Method to click on Factorial Button
	public void clickon_Factorial() {
		factorial.click();
	}

	// Method to click on power Button
	public void clickon_Power() {
		power.click();
	}

}
