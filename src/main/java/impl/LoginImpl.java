package impl;

import pages.LoginPage;

public class LoginImpl {
    LoginPage page;

    public LoginPage getPage(){
        if(page == null)
            page = new LoginPage();
        return page;
    }

    public String getImageSrcValue(String imgName) {
        String imageSrc = "";
        switch (imgName.toLowerCase()) {
            case "tla logo":
                imageSrc = getPage().loginLogo.getAttribute("src");
                break;
            default:
                System.out.println("image was not found");
        }
        return imageSrc;
    }
}
