package pages;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class CreateBoardPage extends PageObjectManager {
    private String profileIcon = "com.pinterest:id/profile_menu_view";
    private String plusIcon = "com.pinterest:id/profile_boards_tab_create_icon";
    private String boardBtn = "//android.widget.TextView[@text=\"Board\"]";
    private String boardNameField = "com.pinterest.board:id/board_name_edittext";
    private String boardNextButton = "com.pinterest.board:id/create_board_button_id";
    private String boardDoneButton = "com.pinterest.board:id/done_button";
    private String boardTitle = "com.pinterest.board:id/board_title";

    public CreateBoardPage(WebDriver driver) {
        super(driver);
    }

    public void tapProfileIcon(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        clickElement("id", profileIcon);
    }

    public void tapPlusIcon(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        clickElement("id", plusIcon);
    }

    public void tapBoardBtn(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        clickElement("xpath", boardBtn);
    }

    public void enterBoardName(String name){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SendKeysToInputField("id", boardNameField, name);
    }

    public void tapBoardNextBtn(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        clickElement("id", boardNextButton);
    }

    public void tapBoardDoneBtn(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        clickElement("id", boardDoneButton);
    }

    public boolean isBoardCreated(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return isElementDisplayed("id", boardTitle);
    }
}
